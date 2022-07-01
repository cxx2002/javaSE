package test5;

import java.text.Collator;
import java.util.*;




public class ComparatorDemo{
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		List<person> perspnList=new LinkedList<person>();
		for (int i = 0; i < n; i++) {
			int id=scanner.nextInt();
			String name=scanner.nextLine();
			perspnList.add(new person(id,name));
		}
		
//		Set<person> aSet=new HashSet<>(perspnList);
//		List<person> perspnList2=new LinkedList<person>(aSet);
		Collections.sort(perspnList,new Comparator<person>() {
			@Override
			public int compare(person o1, person o2) {
				// TODO 自动生成的方法存根
				if(o1.getName().equals(o2.getName()))
					return o1.getId()-o2.getId();
				else 
					return Collator.getInstance(Locale.CHINA).compare(o1.getName(), o2.getName());
			}
		});
		for (person person : perspnList) {
			person.show();
		}
	}
	
	public static class person{
		private int id;
		private String name;
		
		public person() {
		}
		public person(int id,String name) {
			this.id=id;
			this.name=name;
		}

		public void show() {
			System.out.println(this.id+this.name);
		}
		
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
		
	}
	
}
