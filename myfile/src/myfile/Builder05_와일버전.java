package myfile;

public class Builder05_와일버전 {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		
		int b = 3;
		while(b < a.length()) {
			a.deleteCharAt(b);
			System.out.println(a);
			b += 3;
		}

	}

}
