package com.xworkz.app.application;

public class Hysy {

	
	
	public static void main(String[] args) {
		
	String st = "liki";
	String str = "LIKITHA";
	String a =  new String("likki");
	String st2 = "liki";
	
	System.out.println(st == a);
	System.out.println(a.equals(st2));
 	
	st = st .concat("tha") ;
	System.out.println(st);
	
	System.out.println(st.substring(1,4));
	System.out.println(st.equalsIgnoreCase(str));
	System.out.println(st.length());
	System.out.println(st.contains("tha"));
	System.out.println(st.indexOf('t'));
	
	StringBuffer tt = new StringBuffer("");
	tt.append("vijay").append("kumar");
	System.out.println(tt);
	
	
	int i = 10;
	Integer j = i;
	long u = 8929288292l; 
	Long ii = u; // long is a class ii is a type
	short h = 9899;
	Short iu = h;
	byte o = 89;
	Byte oi = o;
	char t = 'f';
	Character y = t;
	boolean ui = false;
	
	
	String jdd = "45";
	int gg =  Integer.parseInt(jdd);
	System.out.println(gg);
	
	String e = "89";
	boolean hh = Boolean.parseBoolean(e);
	System.out.println(hh);
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
