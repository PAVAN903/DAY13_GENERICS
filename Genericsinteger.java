package com.generics;

import java.util.Scanner;

public class Genericsinteger <T extends Comparable<T>> {
	T a;
	T b;
	T c;
	
	public Genericsinteger(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public T Max() {
	return Genericsinteger.Max(a,b,c);
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
		System.out.println("maximum interger value is:: "+Max);  //to print maximum value
		}
		
    public static void main(String[] args) {
    	 int a;int b;int c;
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter first integer value");
    	  a=sc.nextInt();
    	  System.out.println("enter second  integer value");
    	  b=sc.nextInt();
    	  System.out.println("enter third integer value");
    	  c=sc.nextInt();
		  
    	  new Genericsinteger( a, b, c).Max();  //comparing with 3 int max value
    	  }
          }
