package hu;
import java.util.*;;

public class ff {

	public static void main(String args[]) {
		List<Phone> phone = new ArrayList<Phone>();
		phone.add(new Phone(1000));
		phone.add(new Phone(2000));
		List<HuaWei> huaWei = new ArrayList<HuaWei>();
		huaWei.add(new HuaWei(3000));
		huaWei.add(new HuaWei(4000));
		binarySearch1(phone);// 编译通过
		binarySearch2(phone);// 编译通过
		
		/*
		 * Bound mismatch: The generic method binarySearch1(List<T>) of type Test 
		 * is not applicable for the arguments (List<HuaWei>). 
		 * The inferred type HuaWei is not a valid substitute for the bounded parameter <T extends Comparable<T>>
		 */
//binarySearch1(huaWei);// 编译不通过
		
		
		binarySearch2(huaWei);// 编译通过
	}
	
	public static <T extends Comparable<T>> void binarySearch1(List<T> list){
		Collections.sort(list);
	}
	
	public static <T extends Comparable<? super T>> void binarySearch2(List<T> list){
		Collections.sort(list);
	}
}
class Phone implements Comparable<Phone> {
	public int price;
	
	public Phone(int price) {
		super();
		this.price = price;
	}
 
	public int compareTo(Phone other) {
		return this.price - other.price;
	}
}
 
class HuaWei extends Phone{
 
	public HuaWei(int price) {
		super(price);
	}
	
}

