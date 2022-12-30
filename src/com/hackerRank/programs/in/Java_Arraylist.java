package com.hackerRank.programs.in;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_Arraylist {

	public static void main(String[] args) {
	       
	       List<List<Integer>> listInList = new ArrayList<>();
	       Scanner sc = new Scanner(System.in);
	       int l1 = sc.nextInt();
	       
	       for(int i = 0;i<l1;i++){
	           int l2 = sc.nextInt();
	           List<Integer> secList = new ArrayList<>();
	           for(int j = 0; j<l2; j++){
	               secList.add(sc.nextInt());
	           }
	           listInList.add(secList);
	       }
	        
	          int l3 = sc.nextInt();
	          for(int i = 0; i < l3; i++){
	              int n = sc.nextInt();
	              int m = sc.nextInt();
	              
	              try{
	             int output = listInList.get(n-1).get(m-1);
	             System.out.println(output);
	              }
	              catch(Exception ex){
	                  System.out.println("ERROR!");
	              }
	              
	          }
	          
	    }
	}

