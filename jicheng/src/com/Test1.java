package com;


import biao.Person;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {

	int[] fun(int[] jsp){
		for(int i=0;i<jsp.length;++i){
			jsp[i]++;
		}
		return jsp;
	}
	public void swap(int c,int d){

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(Person.buffer);
	System.out.println(Person.class);
//	for(int i=0;i<20;++i) {
//		System.out.println(Math.floor(Math.random()*10));
//	}
	String s="www-ahut-edu-cn";
	for(String str:s.split("-")){
		System.out.println(str);
	}
		String as= s.substring(5);
		System.out.println(as);
		Date now=new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd EEE HH:mm:ss");
		System.out.println(simpleDateFormat.format(now));
	}
}
