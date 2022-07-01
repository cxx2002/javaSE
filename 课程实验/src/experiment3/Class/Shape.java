package experiment3.Class;

public class Shape {

	public static abstract class shape{
		public double width,length,erea,perimeter;
		public double ereashape() {
			return erea;
		}
		public double perimetershape() {
			return perimeter;
		}
	}
	
	public static class Rectangle extends shape{
		private double cha;
		public double ereashape() {
			erea=width*length;
			return erea;
		}
		public double perimetershape() {
			perimeter=(width+length)*2;
			return perimeter;
		}
		public double differ() {
			cha=width-length;
			return cha<0?-cha:cha;
		}
	}
	public static class Circle extends shape{
		private double r;
		public double ereashape() {
			erea=r*3.14*r;
			return erea;
		}
		public double perimetershape() {
			perimeter=r*3.14*2;
			return perimeter;
		}
	}
	public static class Triangle extends shape{
		private double side1,side2,side3;
		public double ereashape() {
			if (side1+side2>side3 && side1+side3>side2 && side2+side3>side1)  //�ж��Ƿ���Թ��������Ρ�
		     {
		         double p=(side1+side2+side3)/2; //������ܳ�
		         erea= Math.sqrt (p*(p-side1)*(p-side2)*(p-side3)); //���ú��׹�ʽ���������
		     }
		     else  System.out.println("�޷����������Σ�"); //���벻�Ϸ�����ʾ��
			return erea;
		}
		public double perimetershape() {
			perimeter=side1+side2+side3;
			return perimeter;
		}
	}
	public static class Square extends Rectangle{
		private double side;
		public double ereashape() {
			erea=side*side;
			return erea;
		}
		public double perimetershape() {
			perimeter=side*4;
			return perimeter;
		}
	}
	
	
	public static void main(String[] args) {
		Rectangle a=new Rectangle();
		Circle b=new Circle();
		Triangle c=new Triangle();
		Square d=new Square();
		shape[] n= {a,b,c,d};
		a.width=3;a.length=4;
		b.r=2;
		c.side1=6;c.side2=8;c.side3=10;
		d.side=7;
		System.out.println("���������"+n[0].ereashape()+"�����ܳ���"+n[0].perimetershape()+"����"+a.differ());
		System.out.println("Բ�������"+n[1].ereashape()+"Բ���ܳ���"+n[1].perimetershape());
		System.out.println("�����ε������"+n[2].ereashape()+"�����ε��ܳ���"+n[2].perimetershape());
		System.out.println("�����ε������"+n[3].ereashape()+"�����ε��ܳ���"+n[3].perimetershape());
	}
}
