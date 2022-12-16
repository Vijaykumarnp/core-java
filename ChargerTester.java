class ChargerTester{

public static void main(String a[]){

Charger toCharge = new Charger();
toCharge.name ="1+";
toCharge.input = "1.7V";
toCharge.output = "3.5V";
toCharge.type = "Cpin";
System.out.println(toCharge.name + " " + toCharge.input + " " + toCharge.output + " " + toCharge.type);

Charger toBoost = new Charger();
toBoost.name = "Nothing";
toBoost.input = "2V";
toBoost.output = "4V";
toBoost.type = "wireless";
System.out.println(toBoost.name + " " + toBoost.input + " " +toBoost.output + " " + toBoost.type);

Charger toPlug = new Charger();
toPlug.name = "Mi";
toPlug.input = "1.2V";
toPlug.output = "3V";
toPlug.type = "Bpin";
System.out.println(toPlug.name + " " + toPlug.input + " " + toPlug.output + " " + toPlug.type);


Charger  toFillTheBattery = new Charger();
toFillTheBattery.name = "NOKIA";
toFillTheBattery.input = "1V";
toFillTheBattery.output = "1.6V";
toFillTheBattery.type = "Normal";
System.out.println(toFillTheBattery.name + " " + toFillTheBattery.input + " " + toFillTheBattery.output + " " + toFillTheBattery.type);

}






}