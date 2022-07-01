package experiment7;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

//import experiment7.Job.FIFOComparator;
//import experiment7.Job.PriorityComparator;
import experiment7.Job.SJFComparator;

public class Scheduler extends Thread{
	private PriorityBlockingQueue<Job> queue;
	
	public Scheduler(PriorityBlockingQueue<Job> queue) {
		this.queue=queue;
	}
	
	public void run() {
		
		while(true) {
			try {
				Job job = queue.take();
				System.out.println("scheduler schedules job("+job+")");
				Thread.sleep(300);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		
		//FIFOComparator fifComparator = new FIFOComparator();
		SJFComparator sjfComparator = new SJFComparator();
		//PriorityComparator priorityComparator = new PriorityComparator();
		PriorityBlockingQueue<Job> queue = new PriorityBlockingQueue<>(10,sjfComparator);
		UserProxy user1 = new UserProxy("zhangsan",queue);
		UserProxy user2 = new UserProxy("wangwu",queue);
		Scheduler scheduler1 = new Scheduler(queue);
		user1.start();
		user2.start();
		scheduler1.start();
	}
}
