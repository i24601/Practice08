package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;//p4의 주소값에 p1의 주소값을 대입 (각 객체는 같은 인스턴스의 주소를 가르킴)
		
		System.out.println(p1 == p2);//주소값 다르다 false
		System.out.println(p2 == p3);//주소값 다르다 false
		System.out.println(p3 == p4);//주소값 다르다 false
		System.out.println(p4 == p1);//주소값 같다 true
		System.out.println(p1.equals(p2));//p1, p2의 데이터값은 각 객체의 주소값을 가르키므로 false
		System.out.println(p4.equals(p1));//p1과 p2의 주소의 같으므로 같은 데이터값을 가짐 true
	}

}


