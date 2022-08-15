package springboot.api.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Area {
	
	    public String id;
	    @JsonProperty("type-id") 
	    public Object typeId;
	    @JsonProperty("sort-name") 
	    public String sortName;
	    public String name;
	    public Object type;
	    @JsonProperty("iso-3166-1-codes") 
	    public ArrayList<String> iso31661Codes;
	    public String disambiguation;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public Object getTypeId() {
			return typeId;
		}
		public void setTypeId(Object typeId) {
			this.typeId = typeId;
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
		public Object getType() {
			return type;
		}
		public void setType(Object type) {
			this.type = type;
		}
		public ArrayList<String> getIso31661Codes() {
			return iso31661Codes;
		}
		public void setIso31661Codes(ArrayList<String> iso31661Codes) {
			this.iso31661Codes = iso31661Codes;
		}
		public String getDisambiguation() {
			return disambiguation;
		}
		public void setDisambiguation(String disambiguation) {
			this.disambiguation = disambiguation;
		}

	    
	    
	    
	    
	    
}
