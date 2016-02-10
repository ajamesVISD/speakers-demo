package org.vashonsd.conference.speakers;

public class Speaker {
	private String name;
	private String speech;
	
	public Speaker(String name, String speech) {
		this.name = name;
		this.speech = speech;
	}
	
	public String introduceSelf() {
		return "Hello, my name is " + name;
	}
	
	public String giveSpeech() {
		return speech;
	}
}
