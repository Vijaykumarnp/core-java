
public class ShoppingMall {
Shop shop[] = new Shop[1];
int ind;
public ShoppingMall() {
	System.out.println("the object shopping mall is created");
}

public void addShop(Shop shop) {
	if(shop.name != null) {
		this.shop[ind++]=shop;
	}
}
public void getShop() {
	for(int i=0 ; i <shop.length ; i++) {
		System.out.println(shop[i].name + " " + shop[i].shopNumber + " " +shop[i].type);
	}
	
}


}
