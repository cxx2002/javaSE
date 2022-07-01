package hu;

import java.util.*;

public class lianxi {
	
	public static class name {
		
		
	
	Integer id;
	public name(Integer id) {
		// TODO 自动生成的构造函数存根
		this.id=id;
	}
	}
	    public static void main(String[] args) {
	    	List<name> list = new LinkedList<>();
	    	list.add(new name(2));list.add(new name(5));
	    	list.add(new name(3));list.add(new name(9));
	    	

	    	//System.out.println(Collections.binarySearch(list, 3));
	    	
	    	
	    	Set<String> set=new HashSet<>();
	    	set.add("a1");
	    	set.add("b2");
	    	System.out.println(set.toString());
	    	System.out.println(set.getClass());
	    	System.out.println(set.iterator().next().charAt(1)+"\t"+set.hashCode());
	    	
	    	Map<String, String> map = new HashMap<String,String>(); 
			map.put("1", "aa");
			map.put("9", "bb");
			map.put("3", "cc");
			map.put("4", "dd");
			System.out.println(map.get("1"));
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {				
				System.out.println(it.next());}
			Set<String> keyset = map.keySet();
			Iterator<String> its = keyset.iterator();
			while(its.hasNext()) {
				System.out.println(its.next());
			}
			 HashSet<String> hashset=new HashSet<>();
			 hashset.add("kdasdas");
			 hashset.add("jhgg");
			 Iterator<String> itss = hashset.iterator();			 
			 while(itss.hasNext())
				 System.out.println(itss.next());
	        //创建Map对象
	        Map<String, String> map2 = new HashMap<String,String>();
	        //给map中添加元素
	        map2.put("邓超", "孙俪");
	        map2.put("李晨", "范冰冰");
	        map2.put("刘德华", "柳岩");
	        //获取Map中的所有key与value的对应关系
	        Set<Map.Entry<String,String>> entrySet = map2.entrySet();
	        //遍历Set集合
	        Iterator<Map.Entry<String,String>> it2 =entrySet.iterator();
	        while(it2.hasNext()){
	            //得到每一对对应关系
	            Map.Entry<String,String> entry = it2.next();
	            //通过每一对对应关系获取对应的key
	            String key = entry.getKey();
	            //通过每一对对应关系获取对应的value
	            String value = entry.getValue();
	            System.out.println(key+"="+value);
	            
	        }
	    }
	
}
