package springboot.api.controller;

import org.apache.commons.lang3.StringUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springboot.api.model.MusicArtist;
import springboot.api.service.MusicArtistService;

@Api(tags = "MusicService ")
@RestController
@RequestMapping("/musify")
public class MusicArtistControler {

	@Autowired
	private MusicArtistService musicArtistService;

	@ApiOperation(value = "getMusicArtistById", notes = "Get MusicArtist base on  mbid")
	@GetMapping("/music-artist/details/{mbid}")
	public ResponseEntity<MusicArtist> getMusicArtistById(@PathVariable String mbid) {

		MusicArtist musicArtist = musicArtistService.retriveMusicBrainzArtistProfile(mbid);

		return new ResponseEntity<MusicArtist>(musicArtist, HttpStatus.OK);
	}

}
