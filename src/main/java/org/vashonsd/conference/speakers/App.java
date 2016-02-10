package org.vashonsd.conference.speakers;

import java.util.*;

public class App {
	
	private static ArrayList<Speaker> program;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotivationalSpeaker penny = new MotivationalSpeaker("Penny Earned", "You can do your best.");
		Comedian slappy = new Comedian("Slappy White", "I tell, it's crazy, man.", 
				"The problem with being unemployed is you start your job the minute you wake up.");		
		
		program = new ArrayList<Speaker>();
		program.add(penny);
		program.add(slappy);
		
		for (Speaker s : program) {
			System.out.println(s.introduceSelf());
			System.out.println(s.giveSpeech());
		}
	}

}
