package portfolio.beans;

import java.util.Date;

abstract class Career {
	
	protected String title;
	protected Date start;
	protected Date end;
	protected String town;
		
	
	protected Career(String title, Date start, Date end, String town) {
		this.title = title;
		this.start = start;
		this.end = end;
		this.town = town;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Date getStart() {
		return start;
	}
	
	public void setStart(Date start) {
		this.start = start;
	}
	
	public Date getEnd() {
		return end;
	}
	
	public void setEnd(Date end) {
		this.end = end;
	}
	
	public String getTown() {
		return town;
	}
	
	public void setTown(String town) {
		this.town = town;
	}
	
}
