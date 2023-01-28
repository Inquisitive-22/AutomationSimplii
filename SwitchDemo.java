
public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int month=Integer.parseInt(args[0]);
		var season="";
		switch(month)
		{
		
		case 1:
		case 2:
			season="Winter";
		break;
		
		case 3:
		case 4:
		case 5:
			season="Summer";
		break;
		case 6:
			season="Spring";
		break;
		case 7:
		case 8:
		case 9:
			season="Rainy";
		break;
		case 10:
		case 11:
			season="Autumn";
		break;
		case 12:
			season="Winter";
		break;
		default:
			season="Invalid month";
			
		}
		
		System.out.println("Season is"+season);
	}

}
