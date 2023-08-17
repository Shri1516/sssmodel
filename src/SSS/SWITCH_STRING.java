package SSS;

public class SWITCH_STRING {
	public static void main(String[] args) {
		// TODO AUTO generated method stub
	String languageproficiency="intremediate";
	int level;
	switch(languageproficiency)
	{
	case "beginner": level=1;
					break;
	case "intremediate": level=2;
					break;
	case "expert": level=3;
					break;
	default: level=0;
	}
	System.out.println("your level is = " + level);
}		
}
