package experiment2;

public class SpecialNumber {
    //���ݣ���Ա������
    private int number;

    SpecialNumber(){
    	number=12345;
    }
    
    SpecialNumber(int i){
    	number = i;
    }
    
    //��������Ա������
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
        System.out.println(sn.number+"��"+sn.countNumber()+"λ��");
        if (flag){
            System.out.println(sn.number+"�ǻ�����");}
            else{
                System.out.println(sn.number+"���ǻ�����");
            }
    }
}