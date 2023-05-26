package com.xworkz.rev.revise;

import java.util.ArrayList;
import java.util.List;

public class RepoImpl implements Repo {

	List<Employe> l =  new ArrayList<Employe>();
	
	
	@Override
	public boolean getEmployee() {
		
		l.stream().forEach(s -> System.out.println(s));
	
		return true;
	}

	@Override
	public boolean addEmploye(Employe e) {
		if(e != null) {
			l.add(e);
		}else {
			System.out.println("dto is null");
		}
		
		return true;
	}

}
