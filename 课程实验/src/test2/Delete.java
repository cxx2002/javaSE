package test2;
import java.util.*;

public class Delete {
	

public static boolean fun(char[] a,char c) {
	for (int i = 0; i < a.length; i++) {	
	if(c==a[i])
	return false;
	}
	return true;
}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] a=new char[str.length()];
		int j=0;
		for (int i = 0; i < str.length(); i++) {
			if(fun(a,str.charAt(i)))
			{a[j++]=str.charAt(i);}
		}
		for (int i = 0; i < j; i++) {
			System.out.print(a[i]);
		}
		
		Map<String, String> map = new HashMap<String,String>(); 
		map.put("1", "aa");
		map.put("2", "bb");
		map.put("3", "cc");
		map.put("4", "dd");
		System.out.println("\n"+map.get("һ"));
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());}
//		for (char c;;)		
//			System.out.print(c);
		in.close();
////		HashSet<Character> newhash = new HashSet<>();
////		char chr;
////		for(int i=0;i<str.length();i++){
////			chr=str.charAt(i);
////			newhash.add(chr);
////		}
////		
////		for (char c : newhash) {
////			System.out.print(c);
//
//
////		sc.close();
	}
}
