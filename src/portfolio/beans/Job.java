package portfolio.beans;

import java.util.Date;

public class Job extends Career {
	protected String company;
	protected String description;
	

	public Job(String title, Date start, Date end, String town, String company, String description) {
		super(title, start, end, town);
		this.company = company;
		this.description = description;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
