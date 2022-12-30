package com.hackerRank.programs.in;
import java.io.*;
import java.util.*;

public class Java_String_Reverse {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String st = sc.nextLine();
	sc.close();
	String str = new StringBuilder(st).reverse().toString();
	if(st.equals(str)) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
}
}
