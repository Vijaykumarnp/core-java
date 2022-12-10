class RupeesTester{

public static void main(String a[]){
System.out.println("main method started");
IndianRupees.noOfLanguages = 15;
IndianRupees indian = new  IndianRupees(1  , "84P7464" , "100 rupees" , 2019 , "paper" , "parpel" , "Rajan");
System.out.println(indian.indianRupeesId  + " " + indian.noOfLanguages+ " " + indian.serialNo + " " + indian.type + " " + 
indian.rupeeName + " "+ indian.yearOfPrinting+ " " + indian.governorName + " "+ indian.color);


IndianRupees ind = new IndianRupees(2 , "76R87" , "one rupee"   , 2020, "coin" , "silver" , "Rajan");

System.out.println(ind.indianRupeesId + " " + ind.serialNo + " " + ind.type + " "+ ind.rupeeName
+ " " + ind.yearOfPrinting + " "+ ind.governorName + " "+ ind.color );

  




System.out.println("main method ended");
}








}