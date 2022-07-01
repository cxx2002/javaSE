package test5;

import java.util.*;


public class ListDemo {

	private List<String> list = new LinkedList<String>();
	private Set<String> set =new HashSet<>();	
	
	public ListDemo() {
	}
	
	public List<String> getList() {
		return list; 
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void add(String s) {
		this.list.add(s);
	}
	
	public void check() {
		
		this.set=new HashSet<String>(this.list);
		this.list=new LinkedList<>(set);
		Collections.sort(list);
		for (String string : this.list) {
			System.out.println(string);
		}
		
//		ListIterator<String> listIterator=this.list.listIterator();
//		while(listIterator.hasNext()) {
//			String string=listIterator.next();
//			ListIterator<String> listIterator2=this.list.listIterator();
//			while(listIterator2.hasNext())
//				if (string.equals(listIterator2.next())) 
//					this.list.remove(string);				
//		}
	}
	
	
	public void show() {
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();

		
		ListDemo listDemo=new ListDemo();
		for (int i = 0; i < n; i++) {
			String string=scanner.nextLine();
			listDemo.add(string);
		}
		listDemo.check();
		//listDemo.show();
		scanner.close();
	}
	
}
