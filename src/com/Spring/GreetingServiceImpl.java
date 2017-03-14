package com.Spring;

public class GreetingServiceImpl implements GreetingService {

	private String greeting;
	public GreetingServiceImpl(String greeting)
	{
		this.greeting=greeting;
	}
	
	public GreetingServiceImpl()
	{
		
	}
	
	public void setGreeting(String greeting)
	{
		this.greeting=greeting;
	}
	
	public void sayGreeting()
	{
		System.out.println("Hello " +greeting);
	}
	
	
}
