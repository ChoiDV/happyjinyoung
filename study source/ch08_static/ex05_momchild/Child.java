package com.lec.ex05_momchild;
// Child first = new Child("ù°");
// first.takeMoney(1000);

public class Child {
	private String name;
	static MomPouch momPouch;
	
	public Child() {		
	}
	
	public Child(String name) {
		this.name = name;
		momPouch = new MomPouch();
		
	}
	public void takeMoney(int money) {
		if(momPouch.money >= money) {
			momPouch.money -= money;
			System.out.println(name + "�� " + money + " �� �������� ���� ������  "+momPouch.money +" �� ����");
		} else {
			System.out.println(name + "�� ���� ������. ���� ���� �������� " + momPouch.money+" ���ۿ� ����");
		}
	}
	
}