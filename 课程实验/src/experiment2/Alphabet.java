package experiment2;

public class Alphabet {

	private int width;
	private boolean isLowerCase;
	
	Alphabet() {
		width=5;
		isLowerCase=true;
	}
	
	Alphabet(int i,boolean j){
		width=i;
		isLowerCase=j;
	}
	
	public void outputAlphabet() {
		char startchar = isLowerCase ? 'a' : 'A';
		char endchar = isLowerCase ? 'z' : 'Z';
		int count = 0;
		for(;startchar <= endchar;startchar++) {
			System.out.print(startchar+" ");
			count++;
			if(count % width == 0) {
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Alphabet alphabet = new Alphabet(5,true);
		alphabet.outputAlphabet();
		
	}

}
