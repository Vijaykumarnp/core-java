class Slit{

public static void main(String a[]){


String city = "Banglore Mysore Hassan tumkur";
//normal method 
System.out.println(city);
String c[] = city.split(" ");
// split(" ") -- in the place of  < space > as diliminator it print to the next line {<space > can be anything}  spli the words or divid the words
int count = 0 ;
for(int i = 0 ; i<c.length ; i++){

System.out.println(c[i]);
count = count +1;

}
System.out.println("word count :" + count);


}










}