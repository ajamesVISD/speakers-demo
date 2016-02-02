package org.vashonsd.conference.entertainment;

public class Politician implements Speaker {

	private String name;

	public Politician(String name) {
		super();
		this.name = name;
	}

	public String Speak() {
		// TODO Auto-generated method stub
		return "I want to bring this nation back to greatness!";
	}

	public String Introduce() {
		// TODO Auto-generated method stub
		return "My name is " + name + " and I need your vote.";
	}

}
