package thread;
/*
 * 
 * 多线程(获取当前线程的对象)
* Thread.currentThread(), 主线程也可以获取
* Thread.sleep(毫秒,纳秒), 
* 控制当前线程休眠若干毫秒1秒= 1000毫秒 1秒 = 1000 * 1000 * 1000纳秒 1000000000
* 
*  1.获取名字
	* 通过getName()方法获取线程对象的名字
* 2.设置名字
	* 通过构造函数可以传入String类型的名字
	
 * 
 * setDaemon(), 设置一个线程为守护线程, 该线程不会单独执行, 当其他非守护线程都执行结束后, 自动退出
 * */
public class Demo2 {	
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<3000;i++){
				System.out.println(Thread.currentThread().getName()+"...aaaaaaaaaaaa");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				
			}
		};
		 new Thread(){
			public void run(){
				for(int i=0;i<3000;i++){
					System.out.println(Thread.currentThread().getName()+"...bb");				}
				
			}
		}.start();
		
	/*	t1.setName("flowers");
		t2.setName("trees");*/
		
		t1.setDaemon(true);
		t1.start();
		/*t1.start();
		t2.start();*/
		
		Thread.currentThread().setName("我是主线程");
		for(int i=0;i<3000;i++){
		System.out.println(Thread.currentThread().getName());
		}

		
	}
}
