class ZomatoTester{


    public static void main(String zomato[]){
	 
	 double price = Zomato.findItem("Biriyani");
	 System.out.println("the price of the biriyani is " + price);
	  double withQuantity = Zomato.findItem ("Biriyani" , 3);
	  System.out.println("the price of the item with quantity " + withQuantity);
	  
	  double price1 = Zomato.findItem("maggie");
	  System.out.println("the price of maggie is " + price1);
	 double withQuantity1 = Zomato.findItem("maggie" , 3);
	 System.out.println("the price of maggie with quantity " + withQuantity1);
	 
	 double price2 =Zomato.findItem("parota");
	 System.out.println("the price of parota is "+ price2);
	 double withQuantity2 = Zomato.findItem("parota" , 6 );
	 System.out.println("the price of parota withQuantity is " + withQuantity2); 
	 
	 double price3 = Zomato.findItem("Shawarma");
	 System.out.println("the price of shawarma is " + price3);
	  double withQuantity3 = Zomato.findItem("Shawarma", 4);
	  System.out.println("the price of shawarma withQuantity is  " + withQuantity3);
		 
		   
	 
	
	}











}