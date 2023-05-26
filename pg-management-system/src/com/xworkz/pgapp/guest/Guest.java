package com.xworkz.pgapp.guest;

import java.io.Serializable;

import lombok.Data;

@Data
public class Guest implements Serializable , Comparable<Guest>{
	
	
private String name ;
private int roomNo;
private int age;
private String floorName;
@Override
public int compareTo(Guest o) {
	// TODO Auto-generated method stub
	return this.age - o.age;
}


}
