package college;
import java.util.*;
class Th extends Thread{
	public void run() {
		int i=0;
		for(i=0;i<50;i++) {
		System.out.println("Good Morning");
		}
	}
}

class Th1 extends Thread{
	public void run() {
		int i=0;
		for(i=0;i<50;i++) {
		System.out.println("Welcome");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
public class ThreadMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Th sc = new Th();
//		Th1 sc1 = new Th1();
//		sc1.setPriority(Thread.MAX_PRIORITY);
//		sc.setPriority(8);
//		System.out.println("Priority is "+ sc1.getPriority());
//		System.out.println("Priority is "+ sc.getPriority());
//		System.out.println("State is "+sc.getState());
//		System.out.println("Current thread is "+sc.currentThread());
//		sc.start();
//		System.out.println("State is "+sc.getState());
//		sc1.start();
		 Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        try{
	           int ans= x/y;
	            System.out.println(ans);
	        }catch(Exception e){
	            System.out.println(e.getMessage());
	        }

	}

}
