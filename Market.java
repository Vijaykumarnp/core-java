class Market{

    static String fruits[] = {"kiwi","apple","pineapple","jack"}; 
	static String vegitables [] = {"chilli","ginger", "cabage" , "garlic"};
	 
	
	public static void getFruits(){
	   System.out.println("inside the getFruits method");
	   System.out.println(fruits.length);
	   for( int i=0;i<fruits.length ; i++){
	   System.out.println(fruits[i]);
	    
	   }
	   
	System.out.println("inside the getFruits method ended");
	
	
	
	}
	
	 public static void getVegitables(){
		 System.out.println("inside the getVegitables");
		 System.out.println(vegitables.length);
		 for(int j=0;j<vegitables.length;j++){
			 System.out.println(vegitables[j]);
			 
			 
			 
			 
		 }
		 System.out.println("inside the getVegitables ended");
		 
		 
		 
		 
		 
		 
	 }
	
	public static void main(String a[]){
	System.out.println("inside the main method");
	      getFruits();
		  getVegitables();
	System.out.println("main method is ended");
	}

                                                                                                                                                                                                                                                                                                                                                                                                                                         



} 
	 















