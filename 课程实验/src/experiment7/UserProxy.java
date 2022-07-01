package experiment7;
import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

public class UserProxy extends Thread{
	private String username;
	private static Integer jobid;
	private PriorityBlockingQueue<Job> queue;
	
	static {
		jobid = new Integer(0);
	}
	
	public UserProxy(String userString,PriorityBlockingQueue<Job> queue) {
		this.username=userString;
		this.queue=queue;
	}
	
	public void run() {
		while(true) {
			Random random = new Random();
			int priority = random.nextInt(16);
			long executiontime = random.nextInt(60*60*1000)+1;
			long arrivaltime = Calendar.getInstance().getTimeInMillis();
			Job job = null;
			synchronized (jobid) {
				jobid+=1;
				job = new Job(jobid,"job"+jobid,priority,executiontime,arrivaltime);
				queue.add(job);//submit job...
				System.out.println(username+ "submits job("+job+")");
			}
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
