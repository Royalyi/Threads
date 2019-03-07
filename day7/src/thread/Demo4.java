package thread;

public class Demo4 {
	/*
	 *  * 同步代码块
		* 使用synchronized关键字加上一个锁对象来定义一段代码, 这就叫同步代码块
		* 多个同步代码块如果使用相同的锁对象, 那么他们就是同步的
		* 
		* /锁对象可以是任意对象,但是被锁的代码需要保证是同一把锁,不能用匿名对象
	 * */
	public static void main(String[] args) {
		new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					print1();
					try {
						sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					print1();
					try {
						sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
	}
	
	

	static Demo4 d = new Demo4();
	public static void print1() {
		synchronized(d){
			System.out.print("天");
			System.out.print("天");
			System.out.print("向");
			System.out.print("上");
			System.out.print("\r\n");
		}
	}
	public void print2() {	
		synchronized(d){
			System.out.print("快");
			System.out.print("乐");
			System.out.print("大");
			System.out.print("本");
			System.out.print("\r\n");
		}
		
	}
}
