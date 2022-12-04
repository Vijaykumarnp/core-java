class  Pattren9{

public static void main(String a[]){
for(int i = 1 ; i<=10 ; i++){
for(int j = 1 ; j<=10 ; j++){
	if(i == 1 || j == 1 || i == 10 || j == 10){
System.out.print("*");
}
else{
	System.out.print(" ");
	
}
if(i == 3 || j == 3 || i == 8 || j == 8){
	System.out.print("*");
	
}
else{
	System.out.print(" ");
	
}
if(i == 3 && j == 2){
	System.out.print(" ");
}
else{
	System.out.print("");
}






}
System.out.println();


}






}
}