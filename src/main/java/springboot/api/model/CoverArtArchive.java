package springboot.api.model;

import java.util.ArrayList;

public class CoverArtArchive {

	public ArrayList<Image> images;
	public String release;

	public ArrayList<Image> getImages() {
		return images;
	}

	public void setImages(ArrayList<Image> images) {
		this.images = images;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

}
