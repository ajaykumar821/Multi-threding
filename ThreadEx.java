package college;

class Ex extends Thread{
	Ex(String name){
		super(name);
	}
public void run() {
	for(int i=0;i<40;i++) {
		System.out.println("thread 1");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
}


class Ex1 extends Thread{
public void run() {
	for(int i=0;i<40;i++) {
		System.out.println("thread 2..............");
	}
	}
}

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex a1 = new Ex("First class constructor");
		Ex a1x = new Ex("ob 2");
		Ex1 a2 = new Ex1();
		a1.setPriority(Thread.MAX_PRIORITY);
		a1.start();
		a1x.setPriority(Thread.MIN_PRIORITY);
		a2.setPriority(Thread.NORM_PRIORITY);
		a2.start();
		//System.out.println("constructor name is "+a1.getName());
//		System.out.println(a1.equals(a2));
//		System.out.println(a2.getClass());
//		System.out.println(a1.getContextClassLoader());
//		System.out.println(a1.getId());
//		System.out.println(a2.getPriority());
//		System.out.println(a1.getStackTrace());
//		System.out.println(a1.getState());
//		System.out.println(a2.getThreadGroup());
//		System.out.println(a2.getUncaughtExceptionHandler());
//		System.out.println(a1.hashCode());
//		//System.out.println(a1.interrupt());
//		System.out.println(a2.isAlive());
//		System.out.println(a2.isDaemon());
//		System.out.println(a1.toString());
//		System.out.println(a2.isInterrupted());

	}

}
