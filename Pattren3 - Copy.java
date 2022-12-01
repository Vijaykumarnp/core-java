class Pattren3{

public static void main(String a[]){
int element[] = {1,2,3,4,5,6,7,8,9,10};
System.out.println(element.length);
for(int i = 0 ; i<element.length ; i++){
	if(element[i]%2 == 0){
		System.out.println("even number" +element[i]);
	}
	else{
		System.out.println("odd number"+element[i]);
		
	}
//System.out.println(element[i]);
}

}




}