package experiment5;
import java.text.Collator;
import java.util.*;

public class Book {
	
	public static void main(String[] args)throws Exception{   
		BookDemo bookDemo=new BookDemo();
    	bookDemo.byebye();
	}

public static class book {
	private int id;//编号
	private String name = new String();//书名
	private String ISBN = new String();//ISBN
	private String writer = new String();//作者
	private String press = new String();//出版社
	private String presstime = new String();//出版日期
	private double price;//单价
	private String classify = new String();//分类
	
	book() {super();}

	book(int id,String name,String ISBN,String writer,String press,String presstime,double price,String classify) {
		this.id=id;this.name = name;this.ISBN = ISBN;this.writer = writer;this.press = press;
		this.presstime = presstime;this.price = price;this.classify = classify;
	}
	
	public void show() {
		System.out.println("编号:"+this.id+"    书名:《"+this.name+"》     ISBN:"+this.ISBN+"    作者:"
				+this.writer+"    出版社:"+this.press+"    出版时间:"+this.presstime+"    价格:"+this.price+"    类型:"+this.classify);
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

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public String getPresstime() {
		return presstime;
	}

	public void setPresstime(String presstime) {
		this.presstime = presstime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getClassify() {
		return classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}
	
	public interface Find {
	    void name(BookList bookList) ;
	}
}

    public static class BookList extends book{
		
		private List<book> Booklist=new LinkedList<book>();
		
		private int count=7;//编号自增器
		
		BookList() {
			book a=new book(1, "高等数学", "98022131337", "韩天勇", "成都大学出版社", "2020-02-12", 65, "教材");
			book b=new book(2, "大学英语", "98046934689", "作者3", "3出版社", "2013-01-23", 55, "教材");
			book c=new book(3, "三国演义", "62804773137", "作者2", "2出版社", "1910-05-17", 39, "小说");
			book d=new book(4, "Java程序设计", "98368734662", "段林涛", "成都大学出版社", "2019-04-15", 88, "教材");
			book e=new book(5, "十万个为什么", "68231454309", "作者1", "1出版社", "2014-07-18", 35, "科普");
			book f=new book(6, "数据结构", "98378804853", "作者4", "4出版社", "2018-12-02", 78, "教材");
			this.Booklist.add(a);this.Booklist.add(b);this.Booklist.add(c);
			this.Booklist.add(d);this.Booklist.add(e);this.Booklist.add(f);

		}
		
		public int compare(book o1, book o2) {
			// TODO 自动生成的方法存根
				return o1.getId()-o2.getId();
		}
	
		
		public void show() {
			Iterator<book> it=this.Booklist.iterator();
			while(it.hasNext()) {
				book a=it.next();
				System.out.println("编号:"+a.id+"    书名:《"+a.name+"》     ISBN:"+a.ISBN+"    作者:"
				+a.writer+"    出版社:"+a.press+"    出版时间:"+a.presstime+"    价格:"+a.price+"    类型:"+a.classify);
			}
			System.out.println("查看成功！");
		}
		
		public void add() {
			Scanner sc=new Scanner(System.in);
			label:
				for(;;) {
					System.out.println("请输入图书的：书名，ISBN，作者，出版社，出版时间，价格，类型");
					try {
						
//						int id=sc.nextInt();sc.nextLine();
//						Iterator<book> it=this.Booklist.iterator();
//						for(;it.hasNext();) {
//							int a=it.next().id;
//							if(a==id) {
//								System.out.println("图书的编号是图书的唯一主键，已存在编号为"+id+"的图书！请重新输入！");								
//								continue label;
//							}
//						}
						String name=sc.nextLine();String ISBN=sc.nextLine();String writer=sc.nextLine();String press=sc.nextLine();
						String presstime=sc.nextLine();double price=sc.nextDouble();sc.nextLine();String classify=sc.nextLine();
						book e=new book(this.count++, name, ISBN, writer, press, presstime, price, classify);
						this.Booklist.add(e);
						break label;
					}
					catch (Exception e) {
						System.out.println("输入书的信息格式有误！请重新输入！");
						sc.nextLine();
						continue label;
					}
					finally {
					}
				}
			System.out.println("添加成功！");
			//sc.close();
		}
		
		public void delete() {
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入要删除图书的书名：");
			String name=sc.nextLine();
//			for (book book : this.Booklist) {
//				if(book.name.equals(name))
//					this.Booklist.remove(Collections.binarySearch(this.Booklist, book));
//			}
			//sc.close();			
			int count1=0,count2=0;
			Iterator<book> it=this.Booklist.iterator();
			
			for (; it.hasNext();count1++,count2++) {
				book book=it.next();
				
				if(book.name.equals(name)) {
					Iterator<book> its=this.Booklist.iterator();
					for (int j = 0; j <= count1; j++) {
						its.next();
					}
					int a=book.id;
					this.count--;
					for(int i=0;i < this.count-a;i++) {
						
						its.next().id--;
						}
					it.remove();
					count2--;
				}
			}
			if(count1==count2)
				System.out.println("未找到名为"+name+"的图书！");
			else 
				System.out.println("删除成功！");
		}		
		
		public void alter() {
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入要修改图书的书名：");
			String name=sc.nextLine();
			int count1=0,count2=0;
			Iterator<book> it = this.Booklist.iterator();

			while (it.hasNext() ) {
				count1++;count2++;
				book a = it.next();
				if(a.name.equals(name)) {
					a.show();
					count2--;
					System.out.println("请输入要修改《"+a.name+"》的属性");
					Label:
						for(;;) {
							try {
								System.out.println("1、修改书名   2、修改ISBN  3、修改作者   4、修改出版社  5、修改出版时间   6、修改价格   7、修改类型   0、返回");
								int choice=sc.nextInt();
								sc.nextLine();
									switch(choice) {
										case 1:
											System.out.println("请输入新的书名：");
											String newnameString=sc.nextLine();
											a.name=newnameString;
											count2--;
											a.show();
											break;
										case 2:
											System.out.println("请输入新的ISBN：");
											String newISBNString=sc.nextLine();
											a.ISBN=newISBNString;
											count2--;
											a.show();
											break;
										case 3:
											System.out.println("请输入新的作者：");
											String newwriterString=sc.nextLine();
											a.writer=newwriterString;
											count2--;
											a.show();
											break;
										case 4:
											System.out.println("请输入新的出版社：");
											String newpressString=sc.nextLine();
											a.press=newpressString;
											count2--;
											a.show();
											break;
										case 5:
											System.out.println("请输入新的出版时间：");
											String newpresstimeString=sc.nextLine();
											a.presstime=newpresstimeString;
											count2--;
											a.show();
											break;
										case 6:
											System.out.println("请输入新的价格：");
											Double newpressDouble=sc.nextDouble();
											sc.nextLine();
											a.price=newpressDouble;
											count2--;
											a.show();
											break;
										case 7:
											System.out.println("请输入新的类型：");
											String newclassifyString=sc.nextLine();
											a.classify=newclassifyString;
											count2--;
											a.show();
											break;
										default:
											System.out.println("返回成功！");
											return;
									}
									break Label;
							}
							catch (Exception e) {
								System.out.println("输入书的信息格式有误！请重新输入！");
								sc.nextLine();
								continue Label;
							}
							finally {
							}
						}
						break;
					}
				}
			
			if(count1==count2)
				System.out.println("未找到《"+name+"》!");
			else 
				System.out.println("修改成功！");
			//sc.close();
		}
		
		public void findname(){
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入要查找图书的书名：");
			String name=sc.nextLine();
			int count1=0,count2=0;
			Iterator<book> it = this.Booklist.iterator();
			while (it.hasNext() ) {
				count1++;count2++;
				book a = it.next();
				if(a.name.equals(name)) {
					a.show();
					count2--;
				}
			}
			if(count1==count2)
				System.out.println("未找到名为"+name+"的图书");
			else 
				System.out.println("查找成功！");
			//sc.close();
		}
		public void findclassify(){
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入要查找图书的类型：");
			String classify=sc.nextLine();
			int count1=0,count2=0;
			Iterator<book> it = this.Booklist.iterator();
			while (it.hasNext() ) {
				count1++;count2++;
				book a = it.next();
				if(a.classify.equals(classify)) {
					a.show();
					count2--;				
				}
			}
			if(count1==count2)
				System.out.println("未找到类型为"+classify+"的图书");
			else 
				System.out.println("查找成功！");
			//sc.close();
		}
		public void findwriter(){
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入要查找图书的作者：");
			String writer=sc.nextLine();
			int count1=0,count2=0;
			Iterator<book> it = this.Booklist.iterator();
			while (it.hasNext() ) {
				count1++;count2++;
				book a = it.next();
				if(a.writer.equals(writer)) {
					a.show();
					count2--;
				}
			}
			if(count1==count2)
				System.out.println("未找到作者为"+writer+"的图书");
			else 
				System.out.println("查找成功！");
			//sc.close();
		}
		public void findpress(){
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入要查找图书的出版社：");
			String press=sc.nextLine();
			int count1=0,count2=0;
			Iterator<book> it = this.Booklist.iterator();
			while (it.hasNext() ) {
				count1++;count2++;
				book a = it.next();
				if(a.press.equals(press)) {
					a.show();
					count2--;
				}
			}
			if(count1==count2)
				System.out.println("未找到出版社为"+press+"的图书");
			else 
				System.out.println("查找成功！");
			//sc.close();
		}
		public void findISBN(){
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入要查找图书的ISBN：");
			String ISBN=sc.nextLine();
			int count1=0,count2=0;
			Iterator<book> it = this.Booklist.iterator();
			while (it.hasNext()) {
				count1++;count2++;
				book a = it.next();
				if(a.ISBN.equals(ISBN)) {
					a.show();
					count2--;
				}
			}
			if(count1==count2)
				System.out.println("未找到ISBN为"+ISBN+"的书");
			else 
				System.out.println("查找成功！");
			//sc.close();
		}
		
		public void sort() {
			// TODO 自动生成的方法存根
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入要按图书的什么属性来排序：");
			System.out.println("1、书名     2、ISBN  3、出版社    4、出版时间     5、价格     6、类型    0、返回");
			int choice=sc.nextInt();
			sc.nextLine();
			List<book> a=new LinkedList<>(this.Booklist);
			switch(choice) {
				case 1:
					Collections.sort(a,new Comparator<book>() {
						@Override
						public int compare(book o1, book o2) {
							// TODO 自动生成的方法存根
							if(o1.getName().equals(o2.getName()))
								return o1.getId()-o2.getId();
							else 
								return Collator.getInstance(Locale.CHINA).compare(o1.getName(), o2.getName());
						}
					});
					break;
				case 2:
					this.Booklist.sort(new Comparator<book>() {
						@Override
						public int compare(book o1, book o2) {
							// TODO 自动生成的方法存根
							if(o1.getISBN().equals(o2.getISBN()))
								return o1.getId()-o2.getId();
							else 
								return Collator.getInstance(Locale.CHINA).compare(o1.getISBN(), o2.getISBN());
						}
					});
					break;
				case 3:
					Collections.sort(a,new Comparator<book>() {
						@Override
						public int compare(book o1, book o2) {
							// TODO 自动生成的方法存根
							if(o1.getPress().equals(o2.getPress()))
								return o1.getId()-o2.getId();
							else 
								return Collator.getInstance(Locale.CHINA).compare(o1.getPress(), o2.getPress());
						}
					});
					break;
				case 4:
					Collections.sort(a,new Comparator<book>() {
						@Override
						public int compare(book o1, book o2) {
							// TODO 自动生成的方法存根
							if(o1.getPresstime().equals(o2.getPresstime()))
								return o1.getId()-o2.getId();
							else 
								return Collator.getInstance(Locale.CHINA).compare(o1.getPresstime(), o2.getPresstime());
						}
					});
					break;
				case 5:
					Collections.sort(a,new Comparator<book>() {
						@Override
						public int compare(book o1, book o2) {
							// TODO 自动生成的方法存根
							if(o1.getPrice()==o2.getPrice())
								return o1.getId()-o2.getId();
							else 
								return new Double(o1.getPrice()).compareTo(new Double(o2.getPrice()));
						}
					});
					break;
				case 6:
					Collections.sort(a,new Comparator<book>() {
						@Override
						public int compare(book o1, book o2) {
							// TODO 自动生成的方法存根
							if(o1.getClassify().equals(o2.getClassify()))
								return o1.getId()-o2.getId();
							else 
								return Collator.getInstance(Locale.CHINA).compare(o1.getClassify(), o2.getClassify());
						}
					});
					break;
				default:
					System.out.println("返回成功！");
					return;
			}
			for (book book : a) 
				book.show();
			System.out.println("排序查看成功！");
			//sc.close();
		}
	}
    
	public static class BookDemo extends BookList{
	    	
	    private	BookList BookList=new BookList();
	    
	    public BookDemo() {	
	    	this.Init();
	    }    
	    
	    public void byebye() {
	    	System.out.println("退出成功！");
	    	System.out.println("-----------------------------欢迎再次使用！------------------------------------------------------------------");
	    }
	    
	    public void Find() {
	    	Scanner sc=new Scanner(System.in);
			System.out.println("需提供图书的信息：1、书名2、类型3、作者4、出版社5、ISBN  0、返回上一层");
			try {
			int choice=sc.nextInt();
			switch(choice) {
				case 1:
					this.BookList.findname();
					break;
				case 2:
					this.BookList.findclassify();
					break;
				case 3:
					this.BookList.findwriter();
					break;
				case 5:
					this.BookList.findpress();
					break;
				case 4:
					this.BookList.findISBN();
					break;
				default:
					System.out.println("返回成功！");
					return;
			}
			}
			catch (Exception e) {
				System.out.println("输入有误！");
				sc.nextLine();
			}
			finally {
				
			}
			//sc.close();
		}
	    
	    public void Init() {
			
			System.out.println("-----------------------------欢迎来到图书管理系统------------------------------------------------------------------");
			Scanner sc=new Scanner(System.in);
			boolean flag = true;
			while(flag) 
			{
			System.out.println("请输入选项：1、查看所有图书2、查找图书3、增加图书4、删除图书5、排序图书6、修改图书0、退出");		
			try {
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				this.BookList.show();
				break;
			case 2:
				this.Find();
				break;
			case 3:
				this.BookList.add();
				break;
			case 4:
				this.BookList.delete();
				break;
			case 5:
				this.BookList.sort();
				break;
			case 6:
				this.BookList.alter();
				break;
			default:
				flag=false;
				sc.close();
				return;
			}
			}
			catch (Exception e) {
				System.out.println("输入有误！");
				sc.nextLine();
			}
			finally {	
			}
			}
			sc.close();
		}
	 }
    
}
