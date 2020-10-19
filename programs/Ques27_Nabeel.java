package com.week2;

import java.util.*;
public class Ques27_Nabeel {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2 strings");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		s1 = s1.replaceAll("\\s",""); 
		s2 = s2.replaceAll("\\s",""); 
		int flag=0;
		
		if(s1.length()!=s2.length()) {
			flag=1;
		}
		else {
			char[] a1 = s1.toCharArray(); 
			char[] a2 = s2.toCharArray(); 
			Arrays.sort(a1);
			Arrays.sort(a2);
			for(int i=0;i<a1.length;i++) {
				if(a1[i]!=a2[i]) {
					flag=1;
					break;
				}
			}
		}
		
		if(flag==1) 
			System.out.println("Not ANAGRAMS");
		else
		    System.out.println("ANAGRAMS");
	   sc.close(); 
	}
}
