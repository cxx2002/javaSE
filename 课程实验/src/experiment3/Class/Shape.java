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
			if (side1+side2>side3 && side1+side3>side2 && side2+side3>side1)  //判断是否可以构成三角形。
		     {
		         double p=(side1+side2+side3)/2; //计算半周长
		         erea= Math.sqrt (p*(p-side1)*(p-side2)*(p-side3)); //套用海伦公式，计算面积
		     }
		     else  System.out.println("无法构成三角形！"); //输入不合法，提示。
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
		System.out.println("矩形面积："+n[0].ereashape()+"矩形周长："+n[0].perimetershape()+"长宽差："+a.differ());
		System.out.println("圆的面积："+n[1].ereashape()+"圆的周长："+n[1].perimetershape());
		System.out.println("三角形的面积："+n[2].ereashape()+"三角形的周长："+n[2].perimetershape());
		System.out.println("正方形的面积："+n[3].ereashape()+"正方形的周长："+n[3].perimetershape());
	}
}
