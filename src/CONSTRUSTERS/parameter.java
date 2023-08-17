package CONSTRUSTERS;

public class parameter {
int i;
String name;
parameter(int id,String n)
{
i=id;
	name=n;
}
void display()
{
	System.out.println(i+" "+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
parameter a=new parameter(10,"shri");
parameter b=new parameter(20,"vicky");
a.display();
b.display();
	}

}
