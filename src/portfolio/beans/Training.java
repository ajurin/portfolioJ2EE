package portfolio.beans;

import java.util.Date;

public class Training extends Career{

	protected String school;

	public Training(String title, Date start, Date end, String town, String school) {
		super(title, start, end, town);
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	
}
