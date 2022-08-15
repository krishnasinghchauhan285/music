package springboot.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BeginArea {
	
	    public String id;
	    public String disambiguation;
	    public Object type;
	    public String name;
	    @JsonProperty("sort-name") 
	    public String sortName;
	    @JsonProperty("type-id") 
	    public Object typeId;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getDisambiguation() {
			return disambiguation;
		}
		public void setDisambiguation(String disambiguation) {
			this.disambiguation = disambiguation;
		}
		public Object getType() {
			return type;
		}
		public void setType(Object type) {
			this.type = type;
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
		public Object getTypeId() {
			return typeId;
		}
		public void setTypeId(Object typeId) {
			this.typeId = typeId;
		}
	    
	    

}
