package factoryDesignPattern;

public class OperatingSysFac {

	
	
	public OS getInstance(String str){
		
		if(str.equalsIgnoreCase("open")){
			return new Android();
		}
		else if(str.equalsIgnoreCase("secure")){
			return new Ios();
		}
		else{
			return new Windows();
		}
		
		
	}
	

}
