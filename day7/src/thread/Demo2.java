package thread;
/*
 * 
 * ���߳�(��ȡ��ǰ�̵߳Ķ���)
* Thread.currentThread(), ���߳�Ҳ���Ի�ȡ
* Thread.sleep(����,����), 
* ���Ƶ�ǰ�߳��������ɺ���1��= 1000���� 1�� = 1000 * 1000 * 1000���� 1000000000
* 
*  1.��ȡ����
	* ͨ��getName()������ȡ�̶߳��������
* 2.��������
	* ͨ�����캯�����Դ���String���͵�����
	
 * 
 * setDaemon(), ����һ���߳�Ϊ�ػ��߳�, ���̲߳��ᵥ��ִ��, ���������ػ��̶߳�ִ�н�����, �Զ��˳�
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
		
		Thread.currentThread().setName("�������߳�");
		for(int i=0;i<3000;i++){
		System.out.println(Thread.currentThread().getName());
		}

		
	}
}
