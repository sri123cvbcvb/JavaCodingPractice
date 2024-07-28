package singletonDesignPattern;
  // in this lazy singleton object creation: the object is not created at the time of class loading. whenever the getInstance method is called at the time only the object is created.so it this method is more effective than the eager method.
  // in this way also one drawback is there that is in multi-threading environment the scenario like i am creating two threads and i am try to access the two object with two diff threads means there is a possibility of both the threads might enter the getInstance block means there is a possibility of creating two diff object. 
  // solution for this drawback is we have to convert the normal getInstance method into synchronized getInstance method. but in this case also one drawback is there that is synchronized method will take more for execution by compare to normal method.(100x times slower the execution)
  
public class AbcLazy {
	
	static AbcLazy obj; 
	   
	   private AbcLazy(){
		   
	   }
	   
	   public static AbcLazy getInstance(){
		   if(obj == null){
		    obj =  new AbcLazy();
		   }
		return obj; 
	   }
	   
	   
	 //using synchronized method:
	   /*public static synchronized AbcLazy getInstance(){
		   if(obj == null){
		    obj =  new AbcLazy();
		   }
		return obj; 
	   }*/
	   
	   
	// double checked Locking:
	   /*public static AbcLazy getInstance(){
		   if(obj == null){
			   synchronized (AbcLazy.class) {
				   if(obj == null){
				   obj =  new AbcLazy();
				   }
			}
		    
		   }
		return obj; 
	   }*/
}
