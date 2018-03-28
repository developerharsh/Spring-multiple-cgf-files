package mypack;

import java.util.Date;

public class DemoBean implements Demo 
{
	private Date date;
	
	
	
		public void setDate(Date date) {
		this.date = date;
	}



		public void showData()
	{
		System.out.println(date);
	}
}
