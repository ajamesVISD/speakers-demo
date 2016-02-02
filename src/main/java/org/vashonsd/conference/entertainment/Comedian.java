package org.vashonsd.conference.entertainment;

public class Comedian implements Speaker
{
	private String name;
	
	
	public Comedian(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String Speak() {
		// TODO Auto-generated method stub
		return "Hey, what's the deal with these TV commercials?";
	}

	public String Introduce() {
		// TODO Auto-generated method stub
		return "My name is " + name;
	}
	
	
}
