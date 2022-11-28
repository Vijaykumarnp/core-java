class Swiggy{


  public static double searchItem(String item){
    System.out.println("inside the searchItem method");
	if (item == "Donne Biriyani" ){
	    return 280.00 ;
	}
	 if (item== "pav Bhajji"){
		 return 40.00;
		 
	 }
	 if (item == "Dhal Kichdi"){
		 return 130.00;
	 }
	 if (item == "palav"){
		 return  70.00;
		 
	 }
	 if (item == "pepper chicken"){
		 return 200.00;
		 
	 }
	 if (item == "griled chicken"){
		 return 370.00;
		 
	 }
	 if (item == "kabab"){
		 return 150.00;
	 }
	 if (item == "kalmi kabab"){
		 return 200.00;
	 }
	 if (item ==  "chicken tikka"){
		 return 300.00;
		 
	 }
      else{
	    System.out.println("can't find the item");
		return 0.0 ;
	  }
  
  
  }






}