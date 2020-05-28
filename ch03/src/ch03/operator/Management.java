package ch03.operator;

import java.util.Scanner;

public class Management {

	public static void main(String[] args) {
        int []score = new int[10];
        Scanner in = new Scanner(System.in);
        for(int i=0; i<10; i++)
        	score[i]= in.nextInt();
        
        double sum =0;
        for(int i=0; i<10; i++) {
        	sum += score[i];
        }
        System.out.println("ÃÑÇÕÀº : "+sum);
        
       double avg = sum/10;
        
        System.out.println("Æò±ÕÀº : "+avg);
	}

}
