package SSS;

public class NESTED_SWITCH {
	public static void main(String[] args) {
		// TODO AUTO generated method stub
char branch='e';
int collegeyear=3;
switch(collegeyear)
	{
case 1:System.out.println("english,maths,science"); break;
case 2:
 switch(branch)
{
case 'c': System.out.println("os,java,ds");break;
case 'm': System.out.println("drawing'menu,mach");break;
case 'e': System.out.println("mp,1st");break;
}
break;
case 3:
switch(branch)
{
case 'c' : System.out.println("co,mm"); break;
case 'm' : System.out.println("ic,mv"); break;
case 'e' : System.out.println("fold,me"); break;
} 
break;
case 4:
	switch(branch)
	{
	case 'c' :System.out.println("dcn,mm");break;
	case 'm' :System.out.println("pt,teng");break;
	case 'e' :System.out.println("es,ip"); break;
	}
	break;
	}
	
}		
}
