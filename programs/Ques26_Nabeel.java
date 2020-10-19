package com.week2;

import java.util.*;
public class Ques26_Nabeel {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		int flag=0;
		
		HashSet<Character> h=new HashSet<Character>();
		h.add(s.charAt(0));
		
		for(int i=1;i<s.length();i++) {
			if(h.contains(s.charAt(i))) {
				System.out.println("Not Unique characters String");
				flag=1;
				break;
			}
			else {
				h.add(s.charAt(i));
			}
		}
		
		if(flag==0) {
			System.out.println("Unique character string");
		}
		
	   sc.close(); 
	}
}
