package com.week2;

import java.util.Scanner;

public class Ques28_Nabeel {
   public static void main(String[] args) {
 		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		sb.append(s.charAt(0));
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==' ')
				sb.append(s.charAt(i+1));
		}
		System.out.println(sb.toString());
		sc.close();
   }
}
