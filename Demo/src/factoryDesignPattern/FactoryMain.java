package factoryDesignPattern;

public class FactoryMain {

	public static void main(String[] args) {
		
		//OS obj = new Android();
       // obj.spec();
		
		 OperatingSysFac osf = new OperatingSysFac();
		 OS os = osf.getInstance("open");
		 os.spec();
	}

}



/* here we are hidding the object creation. instead of doing direct object creation like this OS obj = new Android();. 
 Here we are using operatingSysFac class to get the particular object based on certain condition. This way will help like if in case in future 
 some more os will came means we need to provide implementations for that also so at that time we have to do changes in operatingSysFac class
 only, we don't need to change in main class. */
