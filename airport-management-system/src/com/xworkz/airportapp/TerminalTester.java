package com.xworkz.airportapp;

import java.util.Scanner;

import com.xworkz.airportapp.terminal.Terminal;

public class TerminalTester {

	
	public static void main(String[] args) {
		Terminal ter = new Terminal();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of the termina");
		ter.setName(sc.next());
		System.out.println("enter the size of the terminal");
		ter.setSizee(sc.nextInt());
		System.out.println("enter the type of terminal");
		ter.setType(sc.next());
		System.out.println(ter.getName() + " " + ter.getSizee() + " "+ ter.getType());
	}
}
