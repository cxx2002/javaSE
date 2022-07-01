package experiment7;
import java.util.Comparator;

public class Job {
//短作业优先
	private int id;
	private String name;
	private int priority;//优先级//DAG有向不连通图
	//...
	private long executiontime;//执行时间WCET(最坏情况)
	private long arrivaltime;//到达时间
//实时性调度	private long dealine;//截止时间,EDF,RM
//	            private long peroid;//周期,deline<==peroid
//              private long wcrt;//最坏响应时间
	public Job() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public long getExecutiontime() {
		return executiontime;
	}

	public void setExecutiontime(long executiontime) {
		this.executiontime = executiontime;
	}

	public long getArrivaltime() {
		return arrivaltime;
	}

	public void setArrivaltime(long arrivaltime) {
		this.arrivaltime = arrivaltime;
	}

	public Job(int id,String name,int priority,long executiontime,long arrivaltime) {
		this.id=id;
		this.name=name;
		this.priority=priority;
		this.executiontime=executiontime;
		this.arrivaltime=arrivaltime;
	}
	
	//按进入队列时间排序
	public static class FIFOComparator implements Comparator<Job>{
		public int compare(Job job1,Job job2) {
			long rs = job1.arrivaltime-job2.arrivaltime;
			if(rs==0)
				rs=job1.id-job2.id;
			return (int)rs;
		}
	}
	
	//按执行时间排序
		public static class SJFComparator implements Comparator<Job>{
			public int compare(Job job1,Job job2) {
				long rs = job1.executiontime-job2.executiontime;
				if(rs==0)
					rs=job1.id-job2.id;
				return (int)rs;
			}
		}
		
	//按优先级排序
		public static class PriorityComparator implements Comparator<Job>{
			public int compare(Job job1,Job job2) {
				long rs = job1.priority-job2.priority;
				if(rs==0)
					rs=job1.id-job2.id;
				return (int)rs;
			}
		}
}
