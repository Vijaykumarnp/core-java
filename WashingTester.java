class WashingTester{



public static void main(String a[]){
WashingMachine towash = new WashingMachine();
towash.name ="LG";
towash.capacity = "20KG"; 
towash.type="wash + dryer";
towash.price = 34256;
System.out.println(towash.name + " "+ towash.price + " " + towash.type + " " + towash.capacity);



WashingMachine torash = new WashingMachine();
	


System.out.println(torash.name + " " + torash.capacity + " " + torash.type + " " + torash.price);	




WashingMachine tWash = new WashingMachine();

tWash.name = "LG";
tWash.capacity = "40Kg";
tWash.type = "wash + dryer";
tWash.price = 78999;
System.out.println(tWash.name + " " + tWash.capacity + " " + tWash.type + " " + tWash.price);

WashingMachine twsh = new WashingMachine();

twsh.name = "ONIDA";
twsh.type = "wash";
twsh.price = 15499;

twsh.capacity = "15kg";
System.out.println(twsh.name + " " + twsh.type + " " + twsh.price + "  " + twsh.capacity );

} 


}

