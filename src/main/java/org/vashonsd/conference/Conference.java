package org.vashonsd.conference;

import java.util.*;
import org.vashonsd.conference.entertainment.*;

public class Conference 
{
	private ArrayList<Speaker> speakers;
	private String name;
	private static int numberOfSpeakers;
	
	public void AddSpeaker(Speaker s)
	{
		speakers.add(s);
		numberOfSpeakers++;
	}
	
	public Conference(String name) 
	{
		this.name = name;
		numberOfSpeakers = 0;
		speakers = new ArrayList<Speaker>();
		Speaker com = new Comedian("Orly Johns");
		Politician pol = new Politician("Dennis Hastert");
		AddSpeaker(com);
		AddSpeaker(pol);
	}
	
	public String toString() 
	{
		String result = "";
		result += "We are at the " + name + " Conference!\n";
		for (Speaker s: speakers)
		{
			result += s.Introduce() + " \n";
			result += s.Speak() + "\n"; 
		}
		return result;
	}
}
