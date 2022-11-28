class Speaker{

     static  String name = "Bose" ;
	 static  String  frequency = "" ;
	static   boolean isWireLess = false;
	  static boolean isConnected;
	  static int minVolume;
	   static int maxVolume = 5;
	   static int currentVolume;
	   
	   
	   public static void onOrOff(){
		   System.out.println("inside onOrOff method");
		   
		   if(isConnected == false){
			   isConnected =true;
		   
		   System.out.println("speaker is turned on..");
		   }
		   else if (isConnected == true){
		     isConnected = false;
		   System.out.println("Speaker is turned off..");}
	   System.out.println("inside onOrOff method ended");}
	   
	   public static void increaseVolume(){
		    System.out.println("invoking increaseVolume method");
		      if (isConnected == true){
			if (currentVolume<maxVolume){
				  currentVolume = currentVolume+1 ;
				  System.out.println("the currentVolume is " + currentVolume);
			}
			else {
				System.out.println("max volume reached");
			}
			  }
			  else{
			  System.out.println("Gube..First Turn on the speaker");
			  
			  
			  }
	   }
	   
	   public static void decreaseVolume(){
		   System.out.println("invoking og decreaseVolume");
		   if (isConnected == true){
			   if (currentVolume>minVolume){
				   currentVolume = currentVolume+1 ;
			   System.out.println("the currentVolume is " +currentVolume);
			   }
		         else {
					 System.out.println("minVolume volume reached");
				 }
		   }
		   else{
		   System.out.println("Gube..First trun on the speaker");}
	   }
	   
	   
	   public static void type(){
		   
		   System.out.println("invoking type method");
		   if (isWireLess == false){
		   isWireLess = true;
		   System.out.println("speaker is  wireless");
		   }
		   
		   else if(isWireLess==true){
		   isWireLess = false;
		   System.out.println("speaker is not wireless");
		   
		   
		   
		   
		   }
		   
		   
	   }
		   public static void main(String a[]){
			   System.out.println("main method started");
			        onOrOff();
				  increaseVolume();
				   decreaseVolume();
				   type();
				  
				  
				  
				 System.out.println("main method ended");
		   
	   }
	   
}
