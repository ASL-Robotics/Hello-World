package main;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		// This is a comment. Java comments are preceded by "//". Remove the
		// "//" in the line bellow to uncomment it.

		Scanner sc = new Scanner(System.in);
		System.out.print("Whats your name? > ");
		String name = sc.next();
		System.out.println("Hello, " + name + ".");
		sc.close();

		// Run the program by pressing the green play button in the tool bar.
	}
}
