package springboot.api.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import springboot.api.constant.MusicServiceConstants;
import springboot.api.model.Album;
import springboot.api.model.CoverArtArchive;
import springboot.api.model.Image;
import springboot.api.model.MusicArtist;
import springboot.api.model.MusicBrainzArtistProfile;
import springboot.api.model.Product;
import springboot.api.model.Relation;
import springboot.api.model.Wikipedia;

import springboot.api.repository.RestTemplateHelper;

@Service
public class MusicArtistService /*implements IProductRepositoryMusicBrainz*/ {

	@Autowired
	private RestTemplateHelper restclient;

	
	public MusicArtist retriveMusicBrainzArtistProfile(String mbid) {

		// MusicBrainz
		MusicBrainzArtistProfile musicBrainz = musicBrainz(mbid);

		MusicArtist musicArtist = new MusicArtist();
		musicArtist.setMbid(musicBrainz.getId());
		musicArtist.setCountry(musicBrainz.getCountry());
		musicArtist.setGender(musicBrainz.getGender());
		musicArtist.setDisambiguation(musicBrainz.getDisambiguation());
		musicArtist.setName(musicBrainz.getName());

		Relation relation = musicBrainz.getRelations().stream()
				.filter(p -> p.getType().equals(MusicServiceConstants.WIKIDATA)).distinct().findAny().get();
		String wikiDataId = relation.getUrl().getResource().replace(MusicServiceConstants.RESOURCE_URL, "");

		Product product = wikiData(wikiDataId);

		String title = product.getEntities().getQ2831().getSitelinks().getEnwiki().getTitle();

		Wikipedia wikipedia = wikipedia(title);
		musicArtist.setDescription(wikipedia.getExtract_html());

		List<Album> album = musicBrainz.getReleaseGroups().parallelStream().map(objects -> {
			Album alb = new Album();
			alb.setId(objects.getId());
			alb.setTitle(objects.getTitle());
			try {
				alb.setImageUrl(coverArtArchivDetails(objects.getId()).get().toString());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return alb;
		}).collect(Collectors.toList());

		musicArtist.setAlbums(album);

		return musicArtist;
	}

	private MusicBrainzArtistProfile musicBrainz(String mbid) {

		String url = MusicServiceConstants.MUSICBRAINZ_URL;
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put(MusicServiceConstants.MBID, mbid);

		UriComponents builder = UriComponentsBuilder.fromHttpUrl(url)
				.queryParam(MusicServiceConstants.FMT, MusicServiceConstants.MEDIA)
				.queryParam(MusicServiceConstants.INC, MusicServiceConstants.RELEASEGROUPS).build();

		ResponseEntity<MusicBrainzArtistProfile> res = restclient.getEntity(MusicBrainzArtistProfile.class,
				builder.toUriString().toString(), uriVariables);
		MusicBrainzArtistProfile musicBrainzArtistProfile = res.getBody();

		return musicBrainzArtistProfile;
	}

	private Product wikiData(String wikiDataId) {
		Map<String, String> uriVariables = new HashMap<>();
		String url = MusicServiceConstants.WIKIDATA_URL;
		UriComponents builder = UriComponentsBuilder.fromHttpUrl(url).queryParam(MusicServiceConstants.ID, wikiDataId)
				.queryParam(MusicServiceConstants.FORMAT, MusicServiceConstants.MEDIA).build();

		ResponseEntity<Product> res = restclient.getEntity(Product.class, builder.toUriString().toString(),
				uriVariables);
		Product product = res.getBody();
		return product;
	}

	private Wikipedia wikipedia(String title) {

		String url = MusicServiceConstants.WIKIPEDIA_URL;
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put(MusicServiceConstants.TITLE, title);

		ResponseEntity<Wikipedia> res = restclient.getEntity(Wikipedia.class, url, uriVariables);

		Wikipedia wikipedia = res.getBody();

		return wikipedia;
	}

	// @Async
	private String coverArtArchiv(String mbid) {

		String url = MusicServiceConstants.COVERARTARCHIV_URL;
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put(MusicServiceConstants.MBID, mbid);

		ResponseEntity<CoverArtArchive> res = restclient.getEntity(CoverArtArchive.class, url, uriVariables);

		CoverArtArchive coverArtArchive = res.getBody();
		String image = coverArtArchive.getImages().stream().map(Image::getImage).findAny().toString();
		return image;
	}
	 
	    @Async
		private CompletableFuture<Optional<String>> coverArtArchivDetails(String mbid) {

			String url = MusicServiceConstants.COVERARTARCHIV_URL;
			Map<String, String> uriVariables = new HashMap<>();
			uriVariables.put(MusicServiceConstants.MBID, mbid);

			ResponseEntity<CoverArtArchive> res = restclient.getEntity(CoverArtArchive.class, url, uriVariables);

			CoverArtArchive coverArtArchive = res.getBody();
			String image = coverArtArchive.getImages().stream().map(Image::getImage).findAny().toString();
			return CompletableFuture.completedFuture(coverArtArchive.getImages().stream().map(Image::getImage).findAny());
		}


}
