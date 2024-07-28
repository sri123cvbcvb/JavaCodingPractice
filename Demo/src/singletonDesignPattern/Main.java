package singletonDesignPattern;

public class Main {

	public static void main(String[] args) {
	/*	//Eager singleton obj creation:
		Abc ob = Abc.getInstance();
		Abc ob1 = Abc.getInstance();
         System.out.println(ob.hashCode());
         System.out.println(ob1.hashCode());
         
         //Lazy singleton obj creation:
         
         AbcLazy o1 = AbcLazy.getInstance();
         AbcLazy o2 = AbcLazy.getInstance();
         System.out.println(o1.hashCode());
         System.out.println(o2.hashCode());
         System.out.println(o1.equals(o2));*/
         
         
         //In multithreading:
         Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				AbcLazy object1 = AbcLazy.getInstance();
				System.out.println(object1.hashCode());
			}
		});
         Thread t2 = new Thread(new Runnable() {
 			
 			@Override
 			public void run() {
 				
 				AbcLazy object1 = AbcLazy.getInstance();
 				System.out.println(object1.hashCode());
 				
 			}
 		});
         t1.start();
         t2.start();
         
	}

}
