class BottleTester{

   public static void main(String a[]){
   
                    //refVariable
   TupperWareBottle tupperWareBottle = new TupperWareBottle();
   
   
     tupperWareBottle .color  = "Green ";
	 tupperWareBottle.shape = "Cylinder";
	 tupperWareBottle.price = 89.00 ;
	 tupperWareBottle .type = " plastic "; 

System.out.println(tupperWareBottle.color + " " + tupperWareBottle.shape + " " + tupperWareBottle .price + " " + tupperWareBottle.type);

      TupperWareBottle tupperWare = new TupperWareBottle() ; 
      tupperWare.color = "red" ;
      tupperWare.shape = "Square" ;
      tupperWare.price = 78.00;
	  tupperWare.type = "steel" ;

System.out.println(tupperWare.color + " "+ tupperWare.shape + " " + tupperWare.price + " " + tupperWare .type);

	  
	  TupperWareBottle tupper = new TupperWareBottle();
	  
	  
	  tupper.color = "green"; 
	  tupper . shape = " round" ; 
	  tupper. price = 67.00 ;
	  tupper.type = "aluminimum";
	  
	  System.out.println(tupper.color + " " + tupper.shape + " " + tupper.price + " " + tupper.type );
	  
	  TupperWareBottle bottle = new TupperWareBottle();
	  bottle.color = "white";
	  bottle.shape = "Cylindrical";
	  bottle.price = 367.00 ;
	  bottle.type = "bronze";
	  
	  System.out.println(bottle.color + " " + bottle.shape + " " + bottle.price + " " + bottle.type);
   }
}