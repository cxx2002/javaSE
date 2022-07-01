package experiment5;
import java.text.Collator;
import java.util.*;

public class Book {
	
	public static void main(String[] args)throws Exception{   
		BookDemo bookDemo=new BookDemo();
    	bookDemo.byebye();
	}

public static class book {
	private int id;//���
	private String name = new String();//����
	private String ISBN = new String();//ISBN
	private String writer = new String();//����
	private String press = new String();//������
	private String presstime = new String();//��������
	private double price;//����
	private String classify = new String();//����
	
	book() {super();}

	book(int id,String name,String ISBN,String writer,String press,String presstime,double price,String classify) {
		this.id=id;this.name = name;this.ISBN = ISBN;this.writer = writer;this.press = press;
		this.presstime = presstime;this.price = price;this.classify = classify;
	}
	
	public void show() {
		System.out.println("���:"+this.id+"    ����:��"+this.name+"��     ISBN:"+this.ISBN+"    ����:"
				+this.writer+"    ������:"+this.press+"    ����ʱ��:"+this.presstime+"    �۸�:"+this.price+"    ����:"+this.classify);
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
		
		private int count=7;//���������
		
		BookList() {
			book a=new book(1, "�ߵ���ѧ", "98022131337", "������", "�ɶ���ѧ������", "2020-02-12", 65, "�̲�");
			book b=new book(2, "��ѧӢ��", "98046934689", "����3", "3������", "2013-01-23", 55, "�̲�");
			book c=new book(3, "��������", "62804773137", "����2", "2������", "1910-05-17", 39, "С˵");
			book d=new book(4, "Java�������", "98368734662", "������", "�ɶ���ѧ������", "2019-04-15", 88, "�̲�");
			book e=new book(5, "ʮ���Ϊʲô", "68231454309", "����1", "1������", "2014-07-18", 35, "����");
			book f=new book(6, "���ݽṹ", "98378804853", "����4", "4������", "2018-12-02", 78, "�̲�");
			this.Booklist.add(a);this.Booklist.add(b);this.Booklist.add(c);
			this.Booklist.add(d);this.Booklist.add(e);this.Booklist.add(f);

		}
		
		public int compare(book o1, book o2) {
			// TODO �Զ����ɵķ������
				return o1.getId()-o2.getId();
		}
	
		
		public void show() {
			Iterator<book> it=this.Booklist.iterator();
			while(it.hasNext()) {
				book a=it.next();
				System.out.println("���:"+a.id+"    ����:��"+a.name+"��     ISBN:"+a.ISBN+"    ����:"
				+a.writer+"    ������:"+a.press+"    ����ʱ��:"+a.presstime+"    �۸�:"+a.price+"    ����:"+a.classify);
			}
			System.out.println("�鿴�ɹ���");
		}
		
		public void add() {
			Scanner sc=new Scanner(System.in);
			label:
				for(;;) {
					System.out.println("������ͼ��ģ�������ISBN�����ߣ������磬����ʱ�䣬�۸�����");
					try {
						
//						int id=sc.nextInt();sc.nextLine();
//						Iterator<book> it=this.Booklist.iterator();
//						for(;it.hasNext();) {
//							int a=it.next().id;
//							if(a==id) {
//								System.out.println("ͼ��ı����ͼ���Ψһ�������Ѵ��ڱ��Ϊ"+id+"��ͼ�飡���������룡");								
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
						System.out.println("���������Ϣ��ʽ�������������룡");
						sc.nextLine();
						continue label;
					}
					finally {
					}
				}
			System.out.println("��ӳɹ���");
			//sc.close();
		}
		
		public void delete() {
			Scanner sc=new Scanner(System.in);
			System.out.println("������Ҫɾ��ͼ���������");
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
				System.out.println("δ�ҵ���Ϊ"+name+"��ͼ�飡");
			else 
				System.out.println("ɾ���ɹ���");
		}		
		
		public void alter() {
			Scanner sc=new Scanner(System.in);
			System.out.println("������Ҫ�޸�ͼ���������");
			String name=sc.nextLine();
			int count1=0,count2=0;
			Iterator<book> it = this.Booklist.iterator();

			while (it.hasNext() ) {
				count1++;count2++;
				book a = it.next();
				if(a.name.equals(name)) {
					a.show();
					count2--;
					System.out.println("������Ҫ�޸ġ�"+a.name+"��������");
					Label:
						for(;;) {
							try {
								System.out.println("1���޸�����   2���޸�ISBN  3���޸�����   4���޸ĳ�����  5���޸ĳ���ʱ��   6���޸ļ۸�   7���޸�����   0������");
								int choice=sc.nextInt();
								sc.nextLine();
									switch(choice) {
										case 1:
											System.out.println("�������µ�������");
											String newnameString=sc.nextLine();
											a.name=newnameString;
											count2--;
											a.show();
											break;
										case 2:
											System.out.println("�������µ�ISBN��");
											String newISBNString=sc.nextLine();
											a.ISBN=newISBNString;
											count2--;
											a.show();
											break;
										case 3:
											System.out.println("�������µ����ߣ�");
											String newwriterString=sc.nextLine();
											a.writer=newwriterString;
											count2--;
											a.show();
											break;
										case 4:
											System.out.println("�������µĳ����磺");
											String newpressString=sc.nextLine();
											a.press=newpressString;
											count2--;
											a.show();
											break;
										case 5:
											System.out.println("�������µĳ���ʱ�䣺");
											String newpresstimeString=sc.nextLine();
											a.presstime=newpresstimeString;
											count2--;
											a.show();
											break;
										case 6:
											System.out.println("�������µļ۸�");
											Double newpressDouble=sc.nextDouble();
											sc.nextLine();
											a.price=newpressDouble;
											count2--;
											a.show();
											break;
										case 7:
											System.out.println("�������µ����ͣ�");
											String newclassifyString=sc.nextLine();
											a.classify=newclassifyString;
											count2--;
											a.show();
											break;
										default:
											System.out.println("���سɹ���");
											return;
									}
									break Label;
							}
							catch (Exception e) {
								System.out.println("���������Ϣ��ʽ�������������룡");
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
				System.out.println("δ�ҵ���"+name+"��!");
			else 
				System.out.println("�޸ĳɹ���");
			//sc.close();
		}
		
		public void findname(){
			Scanner sc=new Scanner(System.in);
			System.out.println("������Ҫ����ͼ���������");
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
				System.out.println("δ�ҵ���Ϊ"+name+"��ͼ��");
			else 
				System.out.println("���ҳɹ���");
			//sc.close();
		}
		public void findclassify(){
			Scanner sc=new Scanner(System.in);
			System.out.println("������Ҫ����ͼ������ͣ�");
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
				System.out.println("δ�ҵ�����Ϊ"+classify+"��ͼ��");
			else 
				System.out.println("���ҳɹ���");
			//sc.close();
		}
		public void findwriter(){
			Scanner sc=new Scanner(System.in);
			System.out.println("������Ҫ����ͼ������ߣ�");
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
				System.out.println("δ�ҵ�����Ϊ"+writer+"��ͼ��");
			else 
				System.out.println("���ҳɹ���");
			//sc.close();
		}
		public void findpress(){
			Scanner sc=new Scanner(System.in);
			System.out.println("������Ҫ����ͼ��ĳ����磺");
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
				System.out.println("δ�ҵ�������Ϊ"+press+"��ͼ��");
			else 
				System.out.println("���ҳɹ���");
			//sc.close();
		}
		public void findISBN(){
			Scanner sc=new Scanner(System.in);
			System.out.println("������Ҫ����ͼ���ISBN��");
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
				System.out.println("δ�ҵ�ISBNΪ"+ISBN+"����");
			else 
				System.out.println("���ҳɹ���");
			//sc.close();
		}
		
		public void sort() {
			// TODO �Զ����ɵķ������
			Scanner sc=new Scanner(System.in);
			System.out.println("������Ҫ��ͼ���ʲô����������");
			System.out.println("1������     2��ISBN  3��������    4������ʱ��     5���۸�     6������    0������");
			int choice=sc.nextInt();
			sc.nextLine();
			List<book> a=new LinkedList<>(this.Booklist);
			switch(choice) {
				case 1:
					Collections.sort(a,new Comparator<book>() {
						@Override
						public int compare(book o1, book o2) {
							// TODO �Զ����ɵķ������
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
							// TODO �Զ����ɵķ������
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
							// TODO �Զ����ɵķ������
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
							// TODO �Զ����ɵķ������
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
							// TODO �Զ����ɵķ������
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
							// TODO �Զ����ɵķ������
							if(o1.getClassify().equals(o2.getClassify()))
								return o1.getId()-o2.getId();
							else 
								return Collator.getInstance(Locale.CHINA).compare(o1.getClassify(), o2.getClassify());
						}
					});
					break;
				default:
					System.out.println("���سɹ���");
					return;
			}
			for (book book : a) 
				book.show();
			System.out.println("����鿴�ɹ���");
			//sc.close();
		}
	}
    
	public static class BookDemo extends BookList{
	    	
	    private	BookList BookList=new BookList();
	    
	    public BookDemo() {	
	    	this.Init();
	    }    
	    
	    public void byebye() {
	    	System.out.println("�˳��ɹ���");
	    	System.out.println("-----------------------------��ӭ�ٴ�ʹ�ã�------------------------------------------------------------------");
	    }
	    
	    public void Find() {
	    	Scanner sc=new Scanner(System.in);
			System.out.println("���ṩͼ�����Ϣ��1������2������3������4��������5��ISBN  0��������һ��");
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
					System.out.println("���سɹ���");
					return;
			}
			}
			catch (Exception e) {
				System.out.println("��������");
				sc.nextLine();
			}
			finally {
				
			}
			//sc.close();
		}
	    
	    public void Init() {
			
			System.out.println("-----------------------------��ӭ����ͼ�����ϵͳ------------------------------------------------------------------");
			Scanner sc=new Scanner(System.in);
			boolean flag = true;
			while(flag) 
			{
			System.out.println("������ѡ�1���鿴����ͼ��2������ͼ��3������ͼ��4��ɾ��ͼ��5������ͼ��6���޸�ͼ��0���˳�");		
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
				System.out.println("��������");
				sc.nextLine();
			}
			finally {	
			}
			}
			sc.close();
		}
	 }
    
}
