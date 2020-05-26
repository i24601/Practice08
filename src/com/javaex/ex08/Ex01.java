package com.javaex.ex08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 3;
		String name[] = new String[size], hp[] = new String[size], school[] = new String[size];

		System.out.println("친구를 " + size + "명 등록해 주세요");

		String friend;
		String data[] = new String[3];

		for (int i = 0; i < size; i++) {
			friend = sc.nextLine();
			data = friend.split(" ");

			name[i] = data[0];
			hp[i] = data[1];
			school[i] = data[2];
		}

		for (int i = 0; i < size; i++) {
			System.out.printf("이름:%s  핸드폰:%s  학교:%s\n", name[i], hp[i], school[i]);
		}

		sc.close();
	}
}
