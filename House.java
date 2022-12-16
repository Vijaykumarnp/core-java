class House{


public String houseName;
public int houseNo;
public String familyMembers[];



public House(String houseName , int houseNo , String familyMembers[] ){
System.out.println("the object house is created");
this.houseName = houseName;
this.houseNo = houseNo ;
this.familyMembers = familyMembers ;

}



public void houseDetails(){
System.out.println("the house name is " +houseName);
System.out.println("the house number  is " + houseNo);
System.out.println("the family members of house");
for(int i = 0 ; i<familyMembers.length ; i++){
System.out.println(familyMembers[i]);

}

}


}