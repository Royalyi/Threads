package thread;

public class Deom1 {
	public static void main(String[] args) {
		
		MyThread2 th = new MyThread2();
		/*th.start();*/
		Thread th1 = new Thread(th);
		th1.start();
		
		for(int i=0;i<30000;i++){
			System.out.println("bb");
			}
		
	}
}
class MyThread extends Thread{
	@Override
	public void run(){
		for(int i=0;i<30000;i++){
		System.out.println("aaaaaaaaaaa");
		}
	}
}

class MyThread2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<30000;i++){
			System.out.println("aaaaaaaaaaa");
			}
		
	}
	

}

