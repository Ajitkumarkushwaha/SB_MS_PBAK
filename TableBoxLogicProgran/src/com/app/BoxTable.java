package com.app;

public class BoxTable {
	
	public static void main(String[] args) {
		int noOfTable = 25;
		int box=0;
		box = ((noOfTable%4)>0 && ((noOfTable%4))<4) ? (noOfTable/4)+1: (noOfTable/4) ;
	// box =	(noOfTable>0 && noOfTable<4)?noOfTable/4:(noOfTable/4)+1;
	 System.out.println(box);
	}

}
