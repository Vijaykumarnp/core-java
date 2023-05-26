package com.xworkz.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.app.KanthiSweets.Kanthi;
import com.xworkz.app.KanthiSweets.SweetConfig;
import com.xworkz.app.KanthiSweets.Sweets;
import com.xworkz.app.TeaShop.Category;
import com.xworkz.app.TeaShop.Configuration;
import com.xworkz.app.TeaShop.TeaShop;
import com.xworkz.app.automobile.AutoMobile;
import com.xworkz.app.automobile.AutoMobileCon;
import com.xworkz.app.automobile.SpareParts;
import com.xworkz.app.list.Book;
import com.xworkz.app.list.Library;
import com.xworkz.app.list.SpringConfigu;
import com.xworkz.app.restuarnt.Foods;
import com.xworkz.app.restuarnt.RestaurntCon;
import com.xworkz.app.restuarnt.Restuarnt;

public class AllTester {

public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(AutoMobileCon.class);
		AutoMobile m = con.getBean(AutoMobile.class);
		List<SpareParts> l = new AutoMobileCon().getSpare();
		m.setSpare(l);
		System.out.println(m);
		
		
		
		Kanthi lis= con.getBean( Kanthi.class);
		List<Sweets> li=lis.getSweets() ;
		
		System.out.println(li);
		
		
		Library list = con.getBean( Library.class);
		List<Book> la = new SpringConfigu().getBook();
		
		list.setBooks(la);
		System.out.println(lis);
		
		Restuarnt r = con.getBean(Restuarnt.class);
		List<Foods> lj = new RestaurntCon().getFood();
		r.setFoods(lj);
		
		System.out.println(lj);
		
		
		TeaShop h =  con.getBean(TeaShop.class);
		List<Category> ls = new Configuration().getCategory();
		h.setCategory(ls);
		System.out.println(h);
		
	}
	
}
