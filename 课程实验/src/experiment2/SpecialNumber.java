package experiment2;

public class SpecialNumber {
    //数据（成员变量）
    private int number;

    SpecialNumber(){
    	number=12345;
    }
    
    SpecialNumber(int i){
    	number = i;
    }
    
    //方法（成员方法）
    public boolean isSpecialNumber() {
        String str = Integer.toString(number);
        int i=0;
        int j=str.length()-1;
        for(;i<j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                return  false;
            }
        }
        return true;
    }
    public int countNumber(){
        return Integer.toString(number).length();
    }

    public static void main(String[] args) {
        SpecialNumber sn = new SpecialNumber(12345);
        boolean flag=sn.isSpecialNumber();
        System.out.println(sn.number+"是"+sn.countNumber()+"位数");
        if (flag){
            System.out.println(sn.number+"是回文数");}
            else{
                System.out.println(sn.number+"不是回文数");
            }
    }
}