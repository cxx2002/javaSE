package Date.tomorrow;
import java.util.*;

public class Tomorrow {

	public static class Date{
		private int day,month,year;
		Date(){
			day=1;month=1;year=2022;
		}
		Date(int i,int j,int k){
			year=i;month=j;day=k;
		}
		Date(Date a){
			day=a.day;
			month=a.month;
			year=a.year;
		}
		public void show() {
			System.out.println("明天是"+year+"年"+month+"月"+day+"日");			
		}
	}
	
	public static int maxday(Date a) {
		int b=31;
		if(a.month==4||a.month==6||a.month==9||a.month==11)
			b=30;
		if(a.year%4==0&&a.year/400!=0) {
			if(a.month==2)
				b=29;
		}
		else if(a.month==2) 
			b=28;		
		return b;
	}
	
	public static Date tomorrow(Date a) {
		Date d=a;
		d.day++;
		if(d.day>maxday(d)){
			d.day=1;
			d.month++;
			if(d.month>12) {
				d.month=1;
				d.year++;
			}
		}
		return d;
	}
	
	public static void main(String[] args) {
		
		int a,b,c;
		System.out.println("请输入年月日：");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();		
		Date d=new Date(a,b,c);
		Date t=tomorrow(d);
		t.show();
		//System.out.println("hello world");
		scan.close();
	}

}
