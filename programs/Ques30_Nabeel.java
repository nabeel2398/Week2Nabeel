package com.week2;

public class Ques30_Nabeel
{ 
    public static void concat(String s1) 
    { 
        s1 = s1 + "Khan"; 
    } 
  
    public static void concat(StringBuilder s2) 
    { 
        s2.append("Nabeel"); 
    } 
  
    public static void concat(StringBuffer s3) 
    { 
        s3.append("Khan"); 
    } 
  
    public static void main(String[] args) 
    { 
        String s1 = "Nabeel"; 
        concat(s1); 
        System.out.println("String: " + s1); 
  
        StringBuilder s2 = new StringBuilder(s1); 
        concat(s2); 
        System.out.println("StringBuilder: " + s2); 
  
        StringBuffer s3 = new StringBuffer(s1); 
        concat(s3); 
        System.out.println("StringBuffer: " + s3); 
    } 
} 