package experiment7;
import java.util.Comparator;

public class Job {
//����ҵ����
	private int id;
	private String name;
	private int priority;//���ȼ�//DAG������ͨͼ
	//...
	private long executiontime;//ִ��ʱ��WCET(����)
	private long arrivaltime;//����ʱ��
//ʵʱ�Ե���	private long dealine;//��ֹʱ��,EDF,RM
//	            private long peroid;//����,deline<==peroid
//              private long wcrt;//���Ӧʱ��
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
	
	//���������ʱ������
	public static class FIFOComparator implements Comparator<Job>{
		public int compare(Job job1,Job job2) {
			long rs = job1.arrivaltime-job2.arrivaltime;
			if(rs==0)
				rs=job1.id-job2.id;
			return (int)rs;
		}
	}
	
	//��ִ��ʱ������
		public static class SJFComparator implements Comparator<Job>{
			public int compare(Job job1,Job job2) {
				long rs = job1.executiontime-job2.executiontime;
				if(rs==0)
					rs=job1.id-job2.id;
				return (int)rs;
			}
		}
		
	//�����ȼ�����
		public static class PriorityComparator implements Comparator<Job>{
			public int compare(Job job1,Job job2) {
				long rs = job1.priority-job2.priority;
				if(rs==0)
					rs=job1.id-job2.id;
				return (int)rs;
			}
		}
}
