package springboot.api.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReleaseGroup {
	
	    @JsonProperty("primary-type") 
	    public String primaryType;
	    @JsonProperty("secondary-type-ids") 
	    public ArrayList<String> secondaryTypeIds;
	    public String disambiguation;
	    public String title;
	    @JsonProperty("secondary-types") 
	    public ArrayList<String> secondaryTypes;
	    @JsonProperty("first-release-date") 
	    public String firstReleaseDate;
	    public String id;
	    @JsonProperty("primary-type-id") 
	    public String primaryTypeId;
		public String getPrimaryType() {
			return primaryType;
		}
		public void setPrimaryType(String primaryType) {
			this.primaryType = primaryType;
		}
		public ArrayList<String> getSecondaryTypeIds() {
			return secondaryTypeIds;
		}
		public void setSecondaryTypeIds(ArrayList<String> secondaryTypeIds) {
			this.secondaryTypeIds = secondaryTypeIds;
		}
		public String getDisambiguation() {
			return disambiguation;
		}
		public void setDisambiguation(String disambiguation) {
			this.disambiguation = disambiguation;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public ArrayList<String> getSecondaryTypes() {
			return secondaryTypes;
		}
		public void setSecondaryTypes(ArrayList<String> secondaryTypes) {
			this.secondaryTypes = secondaryTypes;
		}
		public String getFirstReleaseDate() {
			return firstReleaseDate;
		}
		public void setFirstReleaseDate(String firstReleaseDate) {
			this.firstReleaseDate = firstReleaseDate;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPrimaryTypeId() {
			return primaryTypeId;
		}
		public void setPrimaryTypeId(String primaryTypeId) {
			this.primaryTypeId = primaryTypeId;
		}
	    
	    

}
