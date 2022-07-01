package experiment3.Class;
import java.util.*;


public class Employee1 {
	public static void main(String[] args) {
//		Employee e1 = new SalariedEmployee("����", 6, 9000);
//		e1.getSalary(6);
//		
//		Employee e2 = new HourlyEmployee("����", 7, 60, 200);
//		e2.getSalary(6);
//		
//		Employee e3 = new HourlyEmployee("����", 2, 60, 150);
//		e3.getSalary(6);
//		
//		Employee e4 = new SalesEmployee("����", 11, 70000.0, 0.15);
//		e4.getSalary(6);
//		
//		Employee e5 = new BasePlusSalesEmployee("����", 4, 10000, 0.10, 8000.0);
//		e5.getSalary(6);
		Date date=new Date(1996, 06, 19);
		Employee[] cel = {
				new SalariedEmployee("����", date, 9000),	//���������µ����գ���н
				//new HourlyEmployee("����", 7, 60, 200),	//���������µ����գ�ʱн�������ܵ�Сʱ��
				//new HourlyEmployee("����", 2, 60, 150),	//���������µ����գ�ÿСʱ�Ĺ��ʣ�ÿ�¹�����Сʱ��
				//new SalesEmployee("����", 11, 70000.0, 0.15),	//���������µ����գ������۶�����
				//new BasePlusSalesEmployee("����", 4, 10000, 0.10, 8000.0)	//���������µ����գ����۶����ʣ���н
		};
		for (int i = 0; i < cel.length; i++) {
			cel[i].getSalary(6);
		}
	}
	
}


/*
 * Employee����������Ա���ܵĸ��࣬���ԣ�Ա��������,Ա���������·ݡ� ������getSalary(int month)
 * ���ݲ����·���ȷ�����ʣ��������Ա�������գ���˾����⽱��100Ԫ��
 * 
 */
/**
 * @author ��ϲϲ
 *
 */
abstract class Employee {
	private String name;
	private Date birthdayMonth;

	public Employee() {
		super();
	}

	public Employee(String name, Date birthdayMonth) {
		super();
		this.name = name;
		this.birthdayMonth = birthdayMonth;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthdayMonth() {
		return birthdayMonth;
	}


	public void setBirthdayMonth(Date birthdayMonth) {
		this.birthdayMonth = birthdayMonth;
	}
	
	public abstract void getSalary(int month);
}

/*
 * SalariedEmployee��Employee�����࣬�ù̶����ʵ�Ա���� ���ԣ���н
 * 
 */
class SalariedEmployee extends Employee {
	private double monthSalary;

	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(String name, Date birthdayMonth, double monthSalary) {
		super(name, birthdayMonth);
		this.monthSalary = monthSalary;
	}

	public double getMonthSalary() {
		return monthSalary;
	}

	public void setMonthSalary(double monthSalary) {
		this.monthSalary = monthSalary;
	}

	@Override
	public void getSalary(int month) {
		/*if(month == getBirthdayMonth()) {
			System.out.println("���¹���Ϊ��" + (monthSalary + 100));
		} else {
			System.out.println("���¹���Ϊ��" + (monthSalary));
		}*/
		Calendar cal=Calendar.getInstance();
		cal.setTime(getBirthdayMonth());
		System.out.println(getName()+"���¹���Ϊ��" +(month == cal.get(Calendar.MONTH)+1 ? (monthSalary + 100) : monthSalary));
	}

}

/*
 * HourlyEmployee��Employee�����࣬��Сʱ�ù��ʵ�Ա����ÿ�¹�������160Сʱ�Ĳ��ְ���1.5�����ʷ��š�
 * ���ԣ�ÿСʱ�Ĺ��ʡ�ÿ�¹�����Сʱ��
 */
class HourlyEmployee extends Employee {
	private double hourlySalary;
	private int hours;

	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(String name, Date birthdayMonth, double hourlySalary, int hours) {
		super(name, birthdayMonth);
		this.hourlySalary = hourlySalary;
		this.hours = hours;
	}

	public double getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void getSalary(int month) {
		
		double salary = 0;
		
		if(hours <= 160) {
			salary = hourlySalary * hours;
		} else {
			salary = ((hours - 160) * 1.5  + 160) * hourlySalary;
		}
		Calendar cal=Calendar.getInstance();
		cal.setTime(getBirthdayMonth());
		System.out.println(getName()+"���¹���Ϊ��" +(month == cal.get(Calendar.MONTH) ? (salary + 100) : salary));
	}
}

/*
 * SalesEmployee��Employee�����࣬������Ա�������������۶������ʾ����� ���ԣ������۶�����
 */

class SalesEmployee extends Employee {
	private double saleroom;// ���۶�
	private double rate;// �����

	public SalesEmployee() {
		super();
	}

	public SalesEmployee(String name, Date birthdayMonth, double saleroom, double rate) {
		super(name, birthdayMonth);
		this.saleroom = saleroom;
		this.rate = rate;
	}

	public double getSaleroom() {
		return saleroom;
	}

	public void setSaleroom(double saleroom) {
		this.saleroom = saleroom;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	
	@Override
	public void getSalary(int month) {
		Calendar cal=Calendar.getInstance();
		cal.setTime(getBirthdayMonth());
		System.out.println(getName()+"���¹���Ϊ��" +(month == cal.get(Calendar.MONTH)+1 ? (saleroom * rate + 100) : saleroom * rate));
	}

}

/*
 * BasePlusSalesEmployee��SalesEmployee�����࣬�й̶���н��������Ա�������ɵ�н����������ɲ��֡� ���ԣ���н��
 */
class BasePlusSalesEmployee extends SalesEmployee {
	private double basicSalary;

	public BasePlusSalesEmployee() {
		super();
	}

	public BasePlusSalesEmployee(String name, Date birthdayMonth, double saleroom, double rate, double basicSalary) {
		super(name, birthdayMonth, saleroom, rate);
		this.basicSalary = basicSalary;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public void getSalary(int month) {
		double salary = getSaleroom() * getRate() + basicSalary;
		Calendar cal=Calendar.getInstance();
		cal.setTime(getBirthdayMonth());
		System.out.println(getName()+"���¹���Ϊ��" +(month == cal.get(Calendar.MONTH)+1 ? (salary + 100) : salary));
	}
	
}
