package com.hackerRank.programs.in;
import java.util.Scanner;

public class Java_String_Tokens {
	
	  public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        // Write your code here.
	        scan.close();
	        
	        s = s.trim();
	        
	        if(s.length()==0){
	            System.out.println(0);
	            return;
	        }
	        
	        String[] words = s.split("[^A-Za-z]+");
	        System.out.println(words.length);
	        for(String wo:words){
	            System.out.println(wo);
	        }
	    }
	}

