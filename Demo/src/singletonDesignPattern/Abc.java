package singletonDesignPattern;
// This is an Eager object creation for singleton pattern:
public class Abc {

	
   static Abc obj = new Abc(); //while we creating an instance using static means at the time of class loading the object will be created.  wheather we are using the object or not. if suppose we are not using object anymore means the object will be created always so it consumes meamory as well. so it is called eager object creation. 
   
   private Abc (){
	   
   }
   
   public static Abc getInstance(){
	    return obj;
   }
}
