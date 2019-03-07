package thread;

public class Demo3 {
	/*
	 * * join(), 当前线程暂停, 等待指定的线程执行结束后, 当前线程再继续
	 * join(int), 可以等待指定的毫秒之后继续
	 * */
public static void main(String[] args) {
	final Thread th1 = new Thread(){
		public void run(){
			for(int i=0;i<100;i++){
				try {
					sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"aaaaaaaaa");
			}
		}
	};
	
	new Thread(){
		public void run(){
			for(int i=0;i<100;i++){
				if(i==2){
					try {
						th1.join(30);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName()+"bb");
			}
		}
	}.start();
	
	th1.start();
}
}
