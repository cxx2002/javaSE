package experiment3.Class;
import java.util.*;


public class Employee1 {
	public static void main(String[] args) {
//		Employee e1 = new SalariedEmployee("张三", 6, 9000);
//		e1.getSalary(6);
//		
//		Employee e2 = new HourlyEmployee("李四", 7, 60, 200);
//		e2.getSalary(6);
//		
//		Employee e3 = new HourlyEmployee("王五", 2, 60, 150);
//		e3.getSalary(6);
//		
//		Employee e4 = new SalesEmployee("赵六", 11, 70000.0, 0.15);
//		e4.getSalary(6);
//		
//		Employee e5 = new BasePlusSalesEmployee("孙子", 4, 10000, 0.10, 8000.0);
//		e5.getSalary(6);
		Date date=new Date(1996, 06, 19);
		Employee[] cel = {
				new SalariedEmployee("张三", date, 9000),	//姓名，几月的生日，月薪
				//new HourlyEmployee("李四", 7, 60, 200),	//姓名，几月的生日，时薪，工作总的小时数
				//new HourlyEmployee("王五", 2, 60, 150),	//姓名，几月的生日，每小时的工资，每月工作的小时数
				//new SalesEmployee("赵六", 11, 70000.0, 0.15),	//姓名，几月的生日，月销售额，提成率
				//new BasePlusSalesEmployee("孙子", 4, 10000, 0.10, 8000.0)	//姓名，几月的生日，销售额，提成率，底薪
		};
		for (int i = 0; i < cel.length; i++) {
			cel[i].getSalary(6);
		}
	}
	
}


/*
 * Employee：这是所有员工总的父类，属性：员工的姓名,员工的生日月份。 方法：getSalary(int month)
 * 根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100元。
 * 
 */
/**
 * @author 陈喜喜
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
 * SalariedEmployee：Employee的子类，拿固定工资的员工。 属性：月薪
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
			System.out.println("本月工资为：" + (monthSalary + 100));
		} else {
			System.out.println("本月工资为：" + (monthSalary));
		}*/
		Calendar cal=Calendar.getInstance();
		cal.setTime(getBirthdayMonth());
		System.out.println(getName()+"本月工资为：" +(month == cal.get(Calendar.MONTH)+1 ? (monthSalary + 100) : monthSalary));
	}

}

/*
 * HourlyEmployee：Employee的子类，按小时拿工资的员工，每月工作超出160小时的部分按照1.5倍工资发放。
 * 属性：每小时的工资、每月工作的小时数
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
		System.out.println(getName()+"本月工资为：" +(month == cal.get(Calendar.MONTH) ? (salary + 100) : salary));
	}
}

/*
 * SalesEmployee：Employee的子类，销售人员，工资由月销售额和提成率决定。 属性：月销售额、提成率
 */

class SalesEmployee extends Employee {
	private double saleroom;// 销售额
	private double rate;// 提成率

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
		System.out.println(getName()+"本月工资为：" +(month == cal.get(Calendar.MONTH)+1 ? (saleroom * rate + 100) : saleroom * rate));
	}

}

/*
 * BasePlusSalesEmployee：SalesEmployee的子类，有固定底薪的销售人员，工资由底薪加上销售提成部分。 属性：底薪。
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
		System.out.println(getName()+"本月工资为：" +(month == cal.get(Calendar.MONTH)+1 ? (salary + 100) : salary));
	}
	
}
