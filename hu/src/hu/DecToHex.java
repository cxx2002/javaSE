package hu;

public class DecToHex{
public static String toHexString(int number){
StringBuffer hexString = new StringBuffer();
String hexStringName = "0123456789ABCDEF";
int num = Math.abs(number);
int index = 0;
while(num > 0){
index = num % 16;
hexString.append(hexStringName.substring(index, index+ 1));
num = num/ 16;
}
// reverse
hexString.reverse();
return hexString.toString();
}
public static void main(String[] args){
int a = 93;
System.out.println(toHexString(a));
}
}
