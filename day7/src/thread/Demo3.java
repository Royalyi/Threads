package thread;

public class Demo3 {
	/*
	 * * join(), ��ǰ�߳���ͣ, �ȴ�ָ�����߳�ִ�н�����, ��ǰ�߳��ټ���
	 * join(int), ���Եȴ�ָ���ĺ���֮�����
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
