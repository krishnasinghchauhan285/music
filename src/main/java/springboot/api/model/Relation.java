package springboot.api.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Relation {
	
	    public boolean ended;
	    public Url url;
	    public Object begin;
	    @JsonProperty("attribute-ids") 
	    public AttributeIds attributeIds;
	    @JsonProperty("target-credit") 
	    public String targetCredit;
	    public String type;
	    public String end;
	    public String direction;
	    @JsonProperty("source-credit") 
	    public String sourceCredit;
	    @JsonProperty("target-type") 
	    public String targetType;
	    @JsonProperty("attribute-values") 
	    public AttributeValues attributeValues;
	    @JsonProperty("type-id") 
	    public String typeId;
	    public ArrayList<Object> attributes;
		public boolean isEnded() {
			return ended;
		}
		public void setEnded(boolean ended) {
			this.ended = ended;
		}
		public Url getUrl() {
			return url;
		}
		public void setUrl(Url url) {
			this.url = url;
		}
		public Object getBegin() {
			return begin;
		}
		public void setBegin(Object begin) {
			this.begin = begin;
		}
		public AttributeIds getAttributeIds() {
			return attributeIds;
		}
		public void setAttributeIds(AttributeIds attributeIds) {
			this.attributeIds = attributeIds;
		}
		public String getTargetCredit() {
			return targetCredit;
		}
		public void setTargetCredit(String targetCredit) {
			this.targetCredit = targetCredit;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getEnd() {
			return end;
		}
		public void setEnd(String end) {
			this.end = end;
		}
		public String getDirection() {
			return direction;
		}
		public void setDirection(String direction) {
			this.direction = direction;
		}
		public String getSourceCredit() {
			return sourceCredit;
		}
		public void setSourceCredit(String sourceCredit) {
			this.sourceCredit = sourceCredit;
		}
		public String getTargetType() {
			return targetType;
		}
		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}
		public AttributeValues getAttributeValues() {
			return attributeValues;
		}
		public void setAttributeValues(AttributeValues attributeValues) {
			this.attributeValues = attributeValues;
		}
		public String getTypeId() {
			return typeId;
		}
		public void setTypeId(String typeId) {
			this.typeId = typeId;
		}
		public ArrayList<Object> getAttributes() {
			return attributes;
		}
		public void setAttributes(ArrayList<Object> attributes) {
			this.attributes = attributes;
		}
		@Override
		public String toString() {
			return "Relation [ended=" + ended + ", url=" + url + ", begin=" + begin + ", attributeIds=" + attributeIds
					+ ", targetCredit=" + targetCredit + ", type=" + type + ", end=" + end + ", direction=" + direction
					+ ", sourceCredit=" + sourceCredit + ", targetType=" + targetType + ", attributeValues="
					+ attributeValues + ", typeId=" + typeId + ", attributes=" + attributes + "]";
		}
	    
	    
	    

}
