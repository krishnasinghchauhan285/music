package springboot.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EndArea {
	
	    public Object type;
	    public String disambiguation;
	    @JsonProperty("type-id") 
	    public Object typeId;
	    public String name;
	    @JsonProperty("sort-name") 
	    public String sortName;
	    public String id;
		public Object getType() {
			return type;
		}
		public void setType(Object type) {
			this.type = type;
		}
		public String getDisambiguation() {
			return disambiguation;
		}
		public void setDisambiguation(String disambiguation) {
			this.disambiguation = disambiguation;
		}
		public Object getTypeId() {
			return typeId;
		}
		public void setTypeId(Object typeId) {
			this.typeId = typeId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSortName() {
			return sortName;
		}
		public void setSortName(String sortName) {
			this.sortName = sortName;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
	    
	    

}
