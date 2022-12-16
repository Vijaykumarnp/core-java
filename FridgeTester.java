class FridgeTester{


public static void main(String a[]){

Fridge store = new Fridge();
store.name = "LG";
store.color = "blue";
store.type = "double door";
store.price = 34568.67;

System.out.println(store.name + " " + store.color + " " + store.type+ " " + store.price);

Fridge cold = new Fridge();
cold.name = "hawaie";
cold.color = "black";
cold.type = "single door";
cold.price = 45768.67;

System.out.println(cold.name + " " + cold.color + "  " +cold.type + " " + cold.price);


Fridge  box = new Fridge();
box.name = "Hi-Fi";
box.color= "white";
box.type = "double door";
box.price = 56987.00;
System.out.println(box.name + " " + box.color + " " + box.type + " " + box.price);


Fridge  bunk = new Fridge();
bunk.name = "HP";
bunk.color = "purpel";
bunk.type = "single";
bunk.price = 45938.00;
System.out.println(bunk.name + " " + bunk.color + " " + bunk.type + " " + bunk.price);
}



}