class BigBasket{

   public static double findItem(String item){
     System.out.println("inside the find item method");
	 if(item == "Danya Powder"){
	 return 40.00;
	 }
	 if(item == "tooth paste"){
		 return 100.00;
		 
	 }
	 if (item == "chilli powder"){
		 return 110.00;
	 }
	 if (item == "pepper powder"){
		 return 200.00;
		 
	 }
	 
	 if (item == "sun flower"){
		 return 167.98;
	 }
	 if (item == "rice"){
		 return 2548.98;
	 }
	 if (item == "lizol"){
		 return 700.99;
	 }
	 if (item == "bread"){
		 return 48.78;
	 }
	 if (item == "cookies"){
		 return 30.00;
	 }
   else {
    System.out.println("the item not aailabel");
   }
   return 0.0 ;
   
   }






}