package springboot.api.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MusicBrainzArtistProfile {
	
	   @JsonProperty("type-id") 
	    public String typeId;
	    public EndArea end_area;
	    public ArrayList<Relation> relations;
	    public String disambiguation;
	    @JsonProperty("end-area") 
	    public EndArea endArea;
	    @JsonProperty("begin-area") 
	    public BeginArea beginArea;
	    public String country;
	    @JsonProperty("release-groups") 
	    public ArrayList<ReleaseGroup> releaseGroups;
	    public String gender;
	    @JsonProperty("life-span") 
	    public LifeSpan lifeSpan;
	    @JsonProperty("sort-name") 
	    public String sortName;
	    public String name;
	    public String type;
	    public BeginArea begin_area;
	    public Area area;
	    public String id;
	    @JsonProperty("gender-id") 
	    public String genderId;
	    public ArrayList<String> ipis;
	    public ArrayList<String> isnis;
		public String getTypeId() {
			return typeId;
		}
		public void setTypeId(String typeId) {
			this.typeId = typeId;
		}
		public EndArea getEnd_area() {
			return end_area;
		}
		public void setEnd_area(EndArea end_area) {
			this.end_area = end_area;
		}
		public ArrayList<Relation> getRelations() {
			return relations;
		}
		public void setRelations(ArrayList<Relation> relations) {
			this.relations = relations;
		}
		public String getDisambiguation() {
			return disambiguation;
		}
		public void setDisambiguation(String disambiguation) {
			this.disambiguation = disambiguation;
		}
		public EndArea getEndArea() {
			return endArea;
		}
		public void setEndArea(EndArea endArea) {
			this.endArea = endArea;
		}
		public BeginArea getBeginArea() {
			return beginArea;
		}
		public void setBeginArea(BeginArea beginArea) {
			this.beginArea = beginArea;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public ArrayList<ReleaseGroup> getReleaseGroups() {
			return releaseGroups;
		}
		public void setReleaseGroups(ArrayList<ReleaseGroup> releaseGroups) {
			this.releaseGroups = releaseGroups;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public LifeSpan getLifeSpan() {
			return lifeSpan;
		}
		public void setLifeSpan(LifeSpan lifeSpan) {
			this.lifeSpan = lifeSpan;
		}
		public String getSortName() {
			return sortName;
		}
		public void setSortName(String sortName) {
			this.sortName = sortName;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public BeginArea getBegin_area() {
			return begin_area;
		}
		public void setBegin_area(BeginArea begin_area) {
			this.begin_area = begin_area;
		}
		public Area getArea() {
			return area;
		}
		public void setArea(Area area) {
			this.area = area;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getGenderId() {
			return genderId;
		}
		public void setGenderId(String genderId) {
			this.genderId = genderId;
		}
		public ArrayList<String> getIpis() {
			return ipis;
		}
		public void setIpis(ArrayList<String> ipis) {
			this.ipis = ipis;
		}
		public ArrayList<String> getIsnis() {
			return isnis;
		}
		public void setIsnis(ArrayList<String> isnis) {
			this.isnis = isnis;
		}
	    
	    

}
