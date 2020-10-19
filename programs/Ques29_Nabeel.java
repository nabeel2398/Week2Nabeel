package com.week2;

import java.util.*;

public class Ques29_Nabeel {
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter string");
    	 String s=sc.nextLine();
    	 StringBuilder sb=new StringBuilder();
    	 
    	 for (int i = 0; i < s.length(); i++) { 
    		 String x = s.substring(i, i + 1);
    		 if (sb.indexOf(x) < 0)
    		     sb.append(x);	 
    	 }
         System.out.println(sb.toString());  
         sc.close();
     }
}
