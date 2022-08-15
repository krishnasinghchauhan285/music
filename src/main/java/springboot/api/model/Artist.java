package springboot.api.model;

import java.util.ArrayList;

public class Artist {
	
	 public String mbid;
	    public String name;
	    public String gender;
	    public String country;
	    public String disambiguation;
	    public String description;
	    public ArrayList<Album> albums;
		public String getMbid() {
			return mbid;
		}
		public void setMbid(String mbid) {
			this.mbid = mbid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getDisambiguation() {
			return disambiguation;
		}
		public void setDisambiguation(String disambiguation) {
			this.disambiguation = disambiguation;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public ArrayList<Album> getAlbums() {
			return albums;
		}
		public void setAlbums(ArrayList<Album> albums) {
			this.albums = albums;
		}
	    
	    
	    

}
