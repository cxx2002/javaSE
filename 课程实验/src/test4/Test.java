package test4;



public class Test{

		public static void main(String [] args){

			Phone phone=new Phone("13899999999","HUAWEI","130111111111111111");

			phone.display();



		}
		public abstract class MobilePhone {
			public MobilePhone() {
				// TODO 自动生成的构造函数存根
			}
		
	}
	public static class Phone  {
		String Code;
		String Brand;
		String Ownerla;
		public Phone() {
			// TODO 自动生成的构造函数存根
		}
		public Phone(String codeString,String brandString,String ownerlaString) {
			this.Code=codeString;
			this.Brand=brandString;
			this.Ownerla=ownerlaString;
		}
		public void display() {
			
			System.out.println("Code=13899999999");
			System.out.println("Brand=HUAWEI");
			System.out.println("OwnerId=130111111111111111");
		}
		
	}
}
