package com.xworkz.abbapp;

import com.xworkz.abbapp.areaname.Ac;
import com.xworkz.abbapp.areaname.Fan;
import com.xworkz.abbapp.areaname.HawaiFan;
import com.xworkz.abbapp.areaname.HomeThaeter;
import com.xworkz.abbapp.areaname.Switch;
import com.xworkz.abbapp.areaname.TubeLight;
import com.xworkz.abbapp.areaname.Tv;

public class SwitchTester {

	
	public static void main(String[] args) {
		
		//abstract a = 10;
		
		HawaiFan aa = new HawaiFan();
		
	System.out.println(aa.lcd());
	System.out.println(aa.threeWings());
		
		
		/*System.out.println(aa.toOnOrOff());
		Switch bb = new TubeLight();
		System.out.println(bb.toOnOrOff());
		Switch cc = new HomeThaeter();
		System.out.println(cc.toOnOrOff());
		Switch dd = new Tv();
		System.out.println(dd.toOnOrOff());
		Switch ee = new Ac();
		System.out.println(ee.toOnOrOff());*/
	}
}
