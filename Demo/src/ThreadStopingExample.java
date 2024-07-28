
//using flag variable to stop the thread:

/*class Mythread extends Thread {
	
	private boolean flag =true;
	
	void stopRun(){
		flag = false;
	}
	public void run() {
		while(flag){
			System.out.println("thread running");
		}
		System.out.println("thread stoped");
	}
} 
	

public class ThreadStopingExample {
	public static void main(String[] args) {
		Mythread myt = new Mythread();
		
		myt.start();
		
		try {
			myt.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		myt.stopRun();
	}
}*/

//using interrupt() Method to stop the thread:

class Mythread extends Thread {
	
	
	public void run() {
		while(!Thread.interrupted()){
			System.out.println("thread running");
		}
		System.out.println("thread stoped");
	}
} 
	

public class ThreadStopingExample {
	public static void main(String[] args) {
		Mythread myt = new Mythread();
		
		myt.start();
		
		try {
			myt.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		myt.interrupt();
	}
}
