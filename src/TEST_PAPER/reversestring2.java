package TEST_PAPER;

public class reversestring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="SHRIVIGNESH";
		String b=" ";
		for (int i=a.length() -1; i>=0; i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println(b);	
	}

}
