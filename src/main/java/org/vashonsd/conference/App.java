package org.vashonsd.conference;

import java.util.Scanner;

public class App 
{
	
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Please name this conference: ");
    	String name = sc.next();
    	sc.close();
    	Conference c = new Conference(name);
        System.out.println( c );
    }
}
