class Theater{

public int id;
public String name;
public String location;
public int noOfScreens;
public String screenTypes[];

public Theater(int id , String name , String location , int noOfScreens , String screenTypes[]){
System.out.println("theater object is created");
this.id= id;
this.name = name;
this.location = location;
this.noOfScreens= noOfScreens;
this.screenTypes = screenTypes; 

}




public void detailsOfTheater(){
System.out.println("the detailsOfTheater  method is created");
System.out.println("the id of the theater is " + id);
System.out.println("the name of theater" + name);
System.out.println("the location of theater is" + location);
System.out.println("the number of screens are" + noOfScreens);
System.out.println("the screenTypes is");
for(int i = 0 ; i<screenTypes.length ; i++){
System.out.println(screenTypes[i]);
}
}

}