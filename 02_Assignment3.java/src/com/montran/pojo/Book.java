package com.montran.pojo;

import java.util.Scanner;

public class Book {
	
	private int bookNo;
	private String bookTitle;
	private double price=0;
	Scanner sc=new Scanner(System.in);
	Scanner in=new Scanner(System.in);
	int N;
	
	private void TOTAL_COST(int N) {
		price=price*N;
		System.out.println("Total Cost To Be Paid :: " +price);
		
	}
	
	public void INPUT() {
		System.out.println("Enter Book Number :");
		bookNo=sc.nextInt();
		System.out.println("Enter Book Title :");
		bookTitle=in.nextLine();
		System.out.println("Enter Book Price :");
		price=sc.nextDouble();
		System.out.println("-----------BookDetails--------\n");
		System.out.println(" Book No : " + bookNo + " \n BookTitle : " + bookTitle + "\n BookPrice : " + price);
		System.out.println("\n--------------------------------\n");
		
	}
	
	public void PURCHASE() {
		System.out.println("Enter the number of copies :");
		N=sc.nextInt();
		TOTAL_COST(N);
	}	
		
}
