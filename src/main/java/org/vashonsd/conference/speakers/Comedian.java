package org.vashonsd.conference.speakers;

public class Comedian extends Speaker {
	private String bestJoke;
	
	public Comedian(String name, String speech, String joke) {
		super(name, speech);
		bestJoke = joke;
		// TODO Auto-generated constructor stub
	}
	
	public String tellJoke() {
		return bestJoke;
	}
}
