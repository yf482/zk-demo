package bigdata.zkdist;


public class Test {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("主线程开始了");
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("线程开始了");
				while(true){
					System.out.println("线程running");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread.setDaemon(true);
		thread.start();
		Thread.sleep(5000);
		System.out.println(" main thread end!");
	}
	
	

}
