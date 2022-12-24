package com.xworkz.manager;

import com.xworkz.manager.manager.Manager;
import com.xworkz.manager.showroom.ShowRoom;

public class ShowRoomTester {

	public static void main(String[] args) {
		ShowRoom room = new ShowRoom();
		Manager mag = new Manager("vikas" , 30 , "Msc" , 8989898989l);
		room.saveManager(mag);
		Manager mag1 = new Manager("vikki" , 34 , "Mcom" , 87464898989l);
		room.saveManager(mag1);
		room.getManager();
		room.getQualification("Mcom");
		room. updateNameByqualification("vikasa" , "Msc");
	}
}
