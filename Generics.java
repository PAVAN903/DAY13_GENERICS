package com.generics;

import java.util.Scanner;

public class Generics <T extends Comparable<T>> {
	T a;
	T b;
	T c;
	
	public Generics(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public T Max() {
	return Generics.Max(a,b,c);
	}
	public static <T extends Comparable <T>>T Max(T a,T b,T c){
		T Max=a;    //deafult a is max value
		
		if(b.compareTo(Max)>0) {  //max value b
			Max=b;
		}
		if(c.compareTo(Max)>0) {  //max value c
			Max=c;
		}
		printMax(Max);
		return Max;
	    }	
	public static <T> void printMax(T Max) {
		System.out.println("maximum string value is:: "+Max);  //to print maximum value
		}
		
    public static void main(String[] args) {
    	// int a;int b;int c;
    	 //Scanner sc=new Scanner(System.in);
    	 //System.out.println("enter first integer value");
    	 // a=sc.nextInt();
    	  //System.out.println("enter second  integer value");
    	  //b=sc.nextInt();
    	  //System.out.println("enter third integer value");
    	  //c=sc.nextInt();
    	
    	//  float a;float b;float c;
    	 // Scanner sc=new Scanner(System.in);
    	 // System.out.println("enter first float value");
    	 // a=sc.nextFloat();
    	//  System.out.println("enter second float value");
    	//  b=sc.nextFloat();
    	//  System.out.println("enter third float value");
    	//  c=sc.nextFloat();
    	
    	
    	  String a; String b; String c;
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("enter first string ");
    	  a=sc.nextLine();
    	  System.out.println("enter second string ");
    	  b=sc.nextLine();
    	  System.out.println("enter third string ");
    	  c=sc.nextLine();
    	  
    	  
		  
    	  new Generics( a, b, c).Max();  //comparing with 3 int max value
    	  }
          }
