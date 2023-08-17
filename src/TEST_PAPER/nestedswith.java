package TEST_PAPER;

public class nestedswith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dept="mech";
		int collegeyear=1;
		switch(collegeyear)
			{
		case 1:System.out.println("english,maths,science"); break;
		case 2:
		 switch(dept)
		{
		case "cse": System.out.println("os,java,ds");break;
		case "mech": System.out.println("drawing'menu,mach");break;
		case "civil": System.out.println("mp,1st");break;
		}
		break;
		case 3:
		switch(dept)
		{
		case "cse" : System.out.println("co,mm"); break;
		case "mech": System.out.println("ic,mv"); break;
		case "civil": System.out.println("fold,me"); break;
		} 
		break;
		case 4:
			switch(dept)
			{
			case "cse":System.out.println("dcn,mm");break;
			case "mech":System.out.println("pt,teng");break;
			case "civil":System.out.println("es,ip"); break;
			}
			break;
	}

	}}
