class BlueTooth{

static String name = "Redmi";
static boolean isConnected = true ;
static boolean wireLess = false ; 
static int maxVolume = 10 ;
static int minVolume = 0 ; 
static int currentVolume = 4 ;

      public static void onOrOff(){
	    System.out.println("inside the onOrOff method");
		 
		 if (isConnected =true){
		 System.out.println("the bluetooth is on..");}
		 else if (isConnected = false){
		 System.out.println("the bluetooth is off..");
		 System.out.println("inside the onOrOff method ended");
	  }
	  }
	  
	  
	  public static void type(){
		  System.out.println("inside the type method");
		  if (wireLess == false){
			  wireLess = true;
			
		  System.out.println("the Blue tooth is wireLess");}
		  else if (wireLess == true){
			  wireLess = false;
		
			  System.out.println("the blue tooth is not wireLess");
		  }
			  
			  
		  }
		   
		    public static void increaseVolume(){
				System.out.println("inside the increaseVolume method");
				if(isConnected == true){

				
				if (currentVolume<maxVolume){
					currentVolume = currentVolume+1;
				System.out.println("the current volume is" + currentVolume);}
					else  {
					System.out.println("max volume reached");}
				
				}
					else  { 
					System.out.println("bluetooth on mado" );}
								
				
			
		  
		  
			}
			
			public static void decreaseVolume(){
				System.out.println("inside decreaseVolume method");
				if (currentVolume>minVolume){
					currentVolume = currentVolume - 1 ;
					System.out.println("the currentVolume is" + currentVolume);
				}
				
				else {  
				System.out.println("mini volume reached");}
				
				
			}
		  
	  
	  
	  public static void main(String s[]){
	  System.out.println("inside main method");
           onOrOff();
		   type();
		    increaseVolume();
			decreaseVolume();
			decreaseVolume();
			
			
	   System.out.println("inside the main method ended");}










}