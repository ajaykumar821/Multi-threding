package college;

class Xy implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<50;i++) {
		System.out.println("yooooooo");
		}
		
	}
	
}

class Xz implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<50;i++) {
		System.out.println("y!!!!!!!!!!!!");
		}		
	}
	
}

public class ThreadInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xy a1 = new Xy();
		Thread t1 = new Thread(a1,"First");
		Xz a2 = new Xz();
		Thread t2 = new Thread(a2);
		t1.start();
		t2.start();
		System.out.println("first reunnable interface name "+t1.getName());

	}

}
