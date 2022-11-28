class Zomato{

   public static double findItem(String item){
     System.out.println("invoked find item method");
	     if (item ==  "Biriyani"){
		 
		   return 225.00 ;
		 }
		 if (item == "maggie"){
			 
			 return 45.00 ; 
		 }
		 if (item == "parota"){
		 
		 return 30.00 ;
		 }
		 
		 if (item == "veg biriyani"){
			 
		return 150;
		 }
		 
		 if (item == "shawarma"){
			 return 100.00;
		 }
		 
		 if (item == "manchurian"){
			 
			 return 80.00;
		 }
		 
		 if (item == "pani puri"){
			 
			return 60.00;
		 }
		 if (item == "alu parata"){
			 return 100.00;
		 }
		 if (item == "chilli chicken"){
			 return 160.00;
		 }
		 if (item == "butter scotch"){
			 return 50.00;
		 }
         else{
		      System.out.println("Item not availabel");
			  }
		 System.out.println("end of findIten");
		 
		 return 0.0;
		 
		 }
   
   
   
   }







