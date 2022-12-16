class Stationery{

public int id ; 
public String name;
public String noteBooks[];
public String pens[];
public String charts[];

public Stationery(int id , String name , String noteBooks[] , String pens[] , String charts[]){
System.out.println("the object stationery object is created ");

this.id = id ;
this.name = name ; 
this.noteBooks = noteBooks ;
this.pens =pens ;
this.charts = charts ;  

}


public void toBuyThings(){
System.out.println("to buy things method is created");
System.out.println("the id of stationery store is " +  this.id);
System.out.println("the stationery name is " + this.name);
System.out.println("the note books of stationery are");
for(int f = 0 ; f<noteBooks.length ; f++){
System.out.println(noteBooks[f]);	
}
System.out.println("the pens of stationery are" );
for(int i = 0 ; i<pens.length ; i++){
	System.out.println(pens[i]);
}

System.out.println("the charts of stationery are " );
for(int j = 0; j<charts.length ; j++){
	System.out.println(charts[j]);
}

}








}