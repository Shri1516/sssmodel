package CONSTRUSTERS;

public class Doublecounstruster {
int id,roll,pin;

public Doublecounstruster(int a, int b)
{
	id=a;
	roll=b;
	System.out.println(a+" "+b);
}
 public Doublecounstruster(int c )
{
	pin=c;
	System.out.println(c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doublecounstruster s = new Doublecounstruster(10,23);
		Doublecounstruster m=new Doublecounstruster(234);
	}

}
