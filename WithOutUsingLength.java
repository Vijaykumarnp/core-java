class WithOutUsingLength{
// or using for loop

public static void main(String a[]){

String name = "vijay";
int count = 0;
for(char c : name.toCharArray()){ //for each method 
 System.out.println(c);
 // printing c is counts space also because the defalut value of  char is <space>
 count = count +1 ;
}
System.out.println("count of word :" + count);

}





}