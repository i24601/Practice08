package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();

		while (true) {
			System.out.print(">> ");
			str = sc.nextLine();

			String sArray[] = str.split(" ");
			if (sArray[0].equals("/q")) {
				break;
			}

			switch (sArray[1]) {
			case "+":
				add.setValue(Integer.parseInt(sArray[0]), Integer.parseInt(sArray[2]));
				System.out.println(">> "+add.calculate());
				break;
			case "-":
				sub.setValue(Integer.parseInt(sArray[0]), Integer.parseInt(sArray[2]));
				System.out.println(">> "+sub.calculate());
				break;
			case "*":
				mul.setValue(Integer.parseInt(sArray[0]), Integer.parseInt(sArray[2]));
				System.out.println(">> "+mul.calculate());
				break;
			case "/":
				div.setValue(Integer.parseInt(sArray[0]), Integer.parseInt(sArray[2]));
				System.out.println(">> "+div.calculate());
				break;
			default:
				System.out.println("알수없는 연산입니다");
				break;

			}
		}
		sc.close();
		System.out.println("종료합니다");
	}
}
