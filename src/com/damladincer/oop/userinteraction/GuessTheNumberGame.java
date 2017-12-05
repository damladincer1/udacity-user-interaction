package com.damladincer.oop.userinteraction;

import java.util.Scanner;

public class GuessTheNumberGame {

	public static void main(String[] args) {
		int guessNumber;
		int random = randomNumber();
		boolean win=false;
		System.out.println("I have randomly choosen a number between [1,100]");
		System.out.println("Try to guess it..");
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			guessNumber = scanner.nextInt();
			System.out.println("You have " + (10 - i) + " guess(es) left");
			System.out.println("Your guess is : " + guessNumber);
			if(guessNumber>random) {
				System.out.println("Your guess is greater than the number");
			}else if(guessNumber<random) {
				System.out.println("Your guess is smaller than the number");
			}else{
				win=true;
				break;
			}
		}
		
		if(win) {
			System.out.println("You win");
		}else {
			System.out.println("The nummber is: " );
			System.out.println("You lost");
		}
		scanner.close();
	}

	public static int randomNumber() {
		double number = Math.random();
		number *= 100;
		number += 1;
		return (int) number;
	}
	
}
