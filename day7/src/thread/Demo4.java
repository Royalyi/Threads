package thread;

public class Demo4 {
	/*
	 *  * ͬ�������
		* ʹ��synchronized�ؼ��ּ���һ��������������һ�δ���, ��ͽ�ͬ�������
		* ���ͬ����������ʹ����ͬ��������, ��ô���Ǿ���ͬ����
		* 
		* /������������������,���Ǳ����Ĵ�����Ҫ��֤��ͬһ����,��������������
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
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("\r\n");
		}
	}
	public void print2() {	
		synchronized(d){
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("\r\n");
		}
		
	}
}
