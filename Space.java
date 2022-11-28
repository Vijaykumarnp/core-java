class  Space{

   static  String name = "MI"   ;
  static boolean isConnected ;
  static  int maxVolume = 10 ;
  static  int minVolume ;
  static int currentVolume = 3 ;
   public static void onOrOff(){
    System.out.println("inside the onOrOff method");
	if(isConnected == false ){
		isConnected = true ;
		System.out.println("the Tv is on");
	}
	else if (isConnected == true){
		     isConnected = false ;
		System.out.println("Tv on mado B** magane");
		System.out.println("onOrOff method ended");
	}
	
	
	
	  }
	public static void increaseVolume (){
		System.out.println("inside the increase volume method");
		if(currentVolume <maxVolume){
			currentVolume = currentVolume +1;
			System.out.println(currentVolume);
		}
		else {
			System.out.println("maximum volume reached");
		}
	  System.out.println("increaseVolume method ended");	
	}  
	public static void decreaseVolume(){
		System.out.println("inside  the decreaseVolume method");
		if (currentVolume>minVolume){
			currentVolume = currentVolume - 1 ;
			System.out.println(currentVolume);
			
		}
		else {
		     System.out.println("min volume reached");
		}
		System.out.println("decreaseVolume method ended");
		
		
	}
   
    public static void main (String a[]){
		onOrOff();
		increaseVolume();
		increaseVolume();
		decreaseVolume();
		decreaseVolume();
		decreaseVolume();
		decreaseVolume();
		decreaseVolume();
		decreaseVolume();
		}





}