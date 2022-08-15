package springboot.api.model;

public class Wikipedia {
	
	
	public String type;
    public String title;
    public String displaytitle;
    //public Namespace namespace;
    public String wikibase_item;
   // public Titles titles;
    public int pageid;
    //public Thumbnail thumbnail;
    //public Originalimage originalimage;
    public String lang;
    public String dir;
    public String revision;
    public String tid;
   // public Date timestamp;
    public String description;
    public String description_source;
   // public ContentUrls content_urls;
    public String extract;
    public String extract_html;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDisplaytitle() {
		return displaytitle;
	}
	public void setDisplaytitle(String displaytitle) {
		this.displaytitle = displaytitle;
	}
	public String getWikibase_item() {
		return wikibase_item;
	}
	public void setWikibase_item(String wikibase_item) {
		this.wikibase_item = wikibase_item;
	}
	public int getPageid() {
		return pageid;
	}
	public void setPageid(int pageid) {
		this.pageid = pageid;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public String getRevision() {
		return revision;
	}
	public void setRevision(String revision) {
		this.revision = revision;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription_source() {
		return description_source;
	}
	public void setDescription_source(String description_source) {
		this.description_source = description_source;
	}
	public String getExtract() {
		return extract;
	}
	public void setExtract(String extract) {
		this.extract = extract;
	}
	public String getExtract_html() {
		return extract_html;
	}
	public void setExtract_html(String extract_html) {
		this.extract_html = extract_html;
	}
	
	
	

}
