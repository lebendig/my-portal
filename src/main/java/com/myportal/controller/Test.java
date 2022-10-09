package com.myportal.controller;

import java.util.ArrayList;
import java.util.List;

public class Test {

	private List<String> list; 
	
	
	
	public Test() {
		list = new ArrayList();
	}



	public List<String> getList() {
		return list;
	}



	public void setList(List<String> list) {
		this.list = list;
	}

	public void addList(String str) {
		list.add(str);
	}

	public void printList(){
		list.stream().forEach(a -> System.out.println(a.toString()));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
	}

}

