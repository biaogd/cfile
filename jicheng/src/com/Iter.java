package com;

import biao.Person;

public class Iter extends Person {
	public String language;
	public Iter(String name,int age,int height,String language) {
		super(name,age,height);
		this.language=language;
	}
	public Iter() {}
	public int getAge() {
		return this.age;
	}
}
