package com.xworkz.application;

import java.io.File;

public class Daily extends Facto {
	
public static void main(String[] args) {
	
	File ff = new File("C:\\Users\\lenovo\\Documents");
	
	if(ff.exists()) {
	System.out.println(ff.canRead());
	System.out.println(   ff.canExecute());
	System.out.println(   ff.canWrite());
	System.out.println(   ff.delete());
	}
	else {
		System.out.println("cannot exist");
	}
}	
	
}
