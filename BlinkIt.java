class BlinkIt{

   public static void searchItem(String item){
     System.out.println("invoking searchItem method");
	 if (item == "Horlicks"){
		 System.out.println("the price of horlicks is 366.00");
	       return ; 
	 }
	 if (item == "boost"){
		 System.out.println("the price of boost is 425.89");
		 return ;
	 }
	 if (item == "nutrition"){
		 System.out.println("the price of nutrition is 700");
		 return ;
	 }
	 if (item == "bourn vita"){
		 System.out.println("the price of the bourn vita is 500 ");
		 
		 return ;
		 
	 }
	 else {
	    System.out.println("thr item is not availabel");
	 }
     return ;
   
   }




}