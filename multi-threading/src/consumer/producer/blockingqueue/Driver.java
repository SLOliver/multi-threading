package consumer.producer.blockingqueue;

public class Driver {

	public static void main(String [] args) {
		BlockingQueueWrapper condition=new BlockingQueueWrapper();
		Consumer c=new Consumer(condition);
		Producer p=new Producer(condition);
		Thread t1=new Thread(c,"consumer");
		Thread t2=new Thread(p,"producer");
		t1.start();
		t2.start();
		
	}
	
}
