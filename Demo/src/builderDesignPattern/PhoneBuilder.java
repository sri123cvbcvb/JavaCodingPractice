package builderDesignPattern;

public class PhoneBuilder {
	
	private String name;
    private String os;
    private String brand;
    private double screenSize;
    private int battery;
    
	public PhoneBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
    
	public Phone getPhone(){
		return new Phone(name, os, brand, screenSize, battery);
	}
    
}
