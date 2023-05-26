package com.xworkz.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.app.KanthiSweets.Kanthi;
import com.xworkz.app.KanthiSweets.Sweets;
import com.xworkz.app.TeaShop.Category;
import com.xworkz.app.automobile.AutoMobile;
import com.xworkz.app.automobile.SpareParts;
import com.xworkz.app.list.Book;
import com.xworkz.app.list.Library;
import com.xworkz.app.restuarnt.Foods;
import com.xworkz.app.restuarnt.Restuarnt;
@Configuration
@ComponentScan(basePackages = "com.xworkz.app")
public class AllConfig {

	
	
	@Bean
	public AutoMobile getAutoMob() {
		
		
		return new AutoMobile();
	}
	@Bean
	public List<SpareParts> getSpare(){
		List<SpareParts> l = new ArrayList<SpareParts>();
		l.add(new SpareParts(1, "battery", 2400));
		l.add(new SpareParts(2 , "mobileholder" , 1500));
		l.add(new SpareParts(3, "mirror", 500));
		l.add(new SpareParts(5, "fronttyre" , 1200));
		l.add(new SpareParts(6, "backtyre", 2000));
		l.add(new SpareParts(7 , "cylencer" , 5000));
		l.add(new SpareParts(8, "sparkplug", 100));
		l.add(new SpareParts(9 , "carborator" , 400));
		l.add(new SpareParts(10, "mask", 500));
		l.add(new SpareParts(11, "headlight" , 1500));
		l.add(new SpareParts(12, "airfilter", 500));
		l.add(new SpareParts(13, "seatcover" , 700));
		l.add(new SpareParts(14, "deiseltank", 24000));
		l.add(new SpareParts(15, "petroltank" , 1500));
		
		return l;
		
	}
	
	@Bean
	public Kanthi getKanthi() {
		return new Kanthi(); 
	}
	List<Sweets> l = new ArrayList<Sweets>();
	
	@Bean(value = "b")
	//@Order
	public List<Sweets> getSweets() {
		l.add(new Sweets(1 , "Jilebi" , 20));
		l.add(new Sweets(2, "Anarkali", 82));
		l.add(new Sweets(3, "Badusha ", 60));
		l.add(new Sweets(4 , "Holige" , 20));
		l.add(new Sweets(5, "Jamoon", 72));
		l.add(new Sweets(6, "Paysam", 80));
		l.add(new Sweets(7 , "halwa" , 45));
		l.add(new Sweets(8, "Badusha ", 60));
		l.add(new Sweets(9 , "Holige" , 20));
		l.add(new Sweets(10, "Jamoon", 72));
		l.add(new Sweets(11, "Paysam", 80));
		l.add(new Sweets(12 , "carothalwa" , 45));
		l.add(new Sweets(13 , "gulkan" , 67));
		l.add(new Sweets(14, "ladoo", 60));
		l.add(new Sweets(15 , "shavige" , 90));
		return l;
	}
		
		
	@Bean
	public Library getLibrary() {
		
		return new Library();
	}
    @Bean
	public List<Book> getBook() {
		List<Book> l =  new ArrayList<Book>();
		l.add(new Book(1, "Darabendre", "MokajiyaKanasugalu"));
		l.add(new Book(2 , "Aspire" , "Stark"));
		l.add(new Book(3, "Dandi" , "Marcile"));
		l.add(new Book(4, "ThorBiography", "Thor"));
		l.add(new Book(5 , "Gulaal" , "Laala"));
		l.add(new Book(6, "Nakuthanthi" , "GirishKarnad"));
		l.add(new Book(7, "dubare", "kja"));
		l.add(new Book(8 , "ew" , "Evil"));
		l.add(new Book(9, "will" , "Williams"));
		l.add(new Book(10, "bang", "jaja"));
		l.add(new Book(11 , "Kumpa" , "zampa"));
		l.add(new Book(12, "bandil" , "Marcile"));
		l.add(new Book(13 , "bandana" , "vishnu"));
		l.add(new Book(14 , "belbottom" , "rishab"));
		l.add(new Book(15, "hangon" , "william"));
		return l ;
	}
	  
    @Bean
	public Restuarnt getRestaurnt() {
		return new Restuarnt();
		
	}
	@Bean
	public List<Foods> getFood(){
		List<Foods> l = new ArrayList<Foods>();
		l.add(new Foods(1, "Biriyani", 225));
		l.add(new Foods(2, "MuttonBiriyani", 400));
		l.add(new Foods(3, "RotiCurry", 245));
		l.add(new Foods(4, "shawarma", 400));
		l.add(new Foods(5, "chickencurry", 400));
		l.add(new Foods(6, "chickenfry", 78));
		l.add(new Foods(7, "thale mamsa", 500));
		l.add(new Foods(8, "liver", 200));
		l.add(new Foods(9, "barbeque", 190));
		l.add(new Foods(10, "boti", 450));
		l.add(new Foods(11, "pannerbuttermasala", 77));
		l.add(new Foods(12, "RotiCurry", 90));
		l.add(new Foods(13, "mushroom",100));
		l.add(new Foods(14, "maggie", 50));
		l.add(new Foods(15, "mutton", 200));
		return l;
		
	}
	
	
	
	
@Bean
	public List<Category> getCategory(){
		List<Category> k = new ArrayList<Category>();
		k.add(new Category(1, "Tea", 10));
		k.add(new Category(2, "bistuit", 10));
		k.add(new Category(3, "Samosa", 20));
		k.add(new Category(4, "chinikaini", 50));
		k.add(new Category(5, "vimal", 10));
		k.add(new Category(6, "panmasala", 20));
		k.add(new Category(7, "ginger Tea", 10));
		k.add(new Category(8, "goodaybiscuit", 10));
		k.add(new Category(9, "oreo", 10));
		k.add(new Category(10, "mangojuice", 10));
		k.add(new Category(11, "moms magic", 10));
		k.add(new Category(12, "kit kat", 10));
		k.add(new Category(13, "banana", 5));
		k.add(new Category(14, "cocount", 30));
		k.add(new Category(15, "oreo", 10));
		
		return k;
		
	}
	
	
	
}
