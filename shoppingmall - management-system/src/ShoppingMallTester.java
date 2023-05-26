import com.xworkz.mall.ShoppingMall;
import com.xworkz.shops.Shop;

public class ShoppingMallTester {

	
	public static void main(String a[]) {
		ShoppingMall shops = new ShoppingMall();
		Shop shoop = new Shop("Kfc" , "Non-veg" , 3);
		shops.addShop(shoop);
		//shops.getShop();
	}
	
	
	
}
