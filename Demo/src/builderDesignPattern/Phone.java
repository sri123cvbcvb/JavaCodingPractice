package builderDesignPattern;

public class Phone {
      private String name;
      private String os;
      private String brand;
      private double screenSize;
      private int battery;
      
	public Phone(String name, String os, String brand, double screenSize, int battery) {
		super();
		this.name = name;
		this.os = os;
		this.brand = brand;
		this.screenSize = screenSize;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", os=" + os + ", brand=" + brand + ", screenSize=" + screenSize + ", battery="
				+ battery + "]";
	}
      
      
}
