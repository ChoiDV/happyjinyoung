package com.lec.ex2_human;

public class Woman {
	private static final String String = null;
	private int age; // ����
	private int height; // Ű
	private double weight; // ������
	private String phoneNum; // �ڵ��� ��ȣ
	private String name; // �̸�
	
	public Woman() {}; 		// ����Ʈ ������ �Լ�
	public Woman(int age) {
		this.age = age;     	// �Ű������� 1���� ������ �Լ�
	}
	public Woman(int age, int height) {
		this.age = age;
		this.height = height;		// �Ű������� 2���� ������ �Լ�
	}
	public Woman(int age, int height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight; 	// �Ű������� 3���� ������ �Լ�
	}
	public Woman(int age, int height, double weight, String phoneNum) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.phoneNum = phoneNum;  
		}	// �Ű������� 4���� ������ �Լ�
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
	 
	
	
	
	