class Pattren11{


   public static void main(String a[]){
   
      String name = "class";
	  System.out.println(name);
	  //character count by using length
     System.out.println("string count is :" +name.length());
	  // character count by using length and toCharArray()
      int count = 0 ;
      char ch[] = name.toCharArray();
	  //toCharArray -- it covert character to array
      for(int i = 0 ; i<ch.length ; i++){
	   count=count +1;
	  }	  
   System.out.println("word count :" + count);
   }

}









