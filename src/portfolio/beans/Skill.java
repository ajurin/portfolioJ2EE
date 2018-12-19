package portfolio.beans;

public class Skill {
	protected String title;
	protected String description;
	protected String urlImg;
	
	public Skill(String title, String description, String urlImg) {
		this.title = title;
		this.description = description;
		this.urlImg = urlImg;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrlImg() {
		return urlImg;
	}

	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	
	
	
}
