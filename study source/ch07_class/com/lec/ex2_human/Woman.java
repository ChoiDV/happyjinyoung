package com.lec.ex2_human;

public class Woman {
	private static final String String = null;
	private int age; // 나이
	private int height; // 키
	private double weight; // 몸무게
	private String phoneNum; // 핸드폰 번호
	private String name; // 이름
	
	public Woman() {}; 		// 디폴트 생성자 함수
	public Woman(int age) {
		this.age = age;     	// 매개변수가 1개인 생성자 함수
	}
	public Woman(int age, int height) {
		this.age = age;
		this.height = height;		// 매개변수가 2개인 생성자 함수
	}
	public Woman(int age, int height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight; 	// 매개변수가 3개인 생성자 함수
	}
	public Woman(int age, int height, double weight, String phoneNum) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.phoneNum = phoneNum;  
		}	// 매개변수가 4개인 생성자 함수
	public Woman(int age, int height, double weight , String phoneNum , String name) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.phoneNum = phoneNum;
		this.name = name;	
		}
	// setter&getter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getString() {
		return String;
	}
	
	
}
	 
	
	
	
	