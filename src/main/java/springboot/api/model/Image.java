package springboot.api.model;

import java.util.ArrayList;

public class Image {
	
	 public ArrayList<String> types;
	    public boolean front;
	    public boolean back;
	    public int edit;
	    public String image;
	    public String comment;
	    public boolean approved;
	    public String id;
		public ArrayList<String> getTypes() {
			return types;
		}
		public void setTypes(ArrayList<String> types) {
			this.types = types;
		}
		public boolean isFront() {
			return front;
		}
		public void setFront(boolean front) {
			this.front = front;
		}
		public boolean isBack() {
			return back;
		}
		public void setBack(boolean back) {
			this.back = back;
		}
		public int getEdit() {
			return edit;
		}
		public void setEdit(int edit) {
			this.edit = edit;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public String getComment() {
			return comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
		}
		public boolean isApproved() {
			return approved;
		}
		public void setApproved(boolean approved) {
			this.approved = approved;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
	    
	    

}
