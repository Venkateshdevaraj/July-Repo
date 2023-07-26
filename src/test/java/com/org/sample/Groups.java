package com.org.sample;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups= {"Arts"})
	public void rkmvc() 
	{
		System.out.println("Ramakrishna mission vivekanda college");	
	}
	
	@Test(groups= {"Arts"})
	public void gurunank()
	{
		System.out.println("Gurunanak college");	
	}
	
	@Test(groups= {"Arts"})
	public void dgvaishnava()
	{
		System.out.println("Dg vaishnava college");	
	}
	
	@Test(groups= {"Engineering"})
	public void panimalar()
	{
		System.out.println("Panimalar college");	
	}
	
	@Test(groups= {"Engineering"})
	public void annauniversity()
	{
		System.out.println("Anna university college");	
	}
	
	@Test(groups= {"Engineering"})
	public void dhanalakshmi()
	{
		System.out.println("Dhanalakshmi college");	
	}

}
