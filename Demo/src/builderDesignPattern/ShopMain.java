package builderDesignPattern;

public class ShopMain {

	public static void main(String[] args) {
		
		Phone p = new PhoneBuilder().setName("j3").setBattery(5000).getPhone();
		
		System.out.println(p);

	}

}
