class MaxDaysInMonth
{
	public static void main(String [] args)
	{
		java.util.Scanner kbin = new java.util.Scanner(System.in);
		System.out.print("Enter a month number :");
		int m = kbin.nextInt();
		switch(m)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: System.out.println("Max.days are 31");
			         break;
			case 4:
			case 6:
			case 9:
			case 11: System.out.println("Max.days are 30");
			         break;
			case 2:  System.out.println("Max.days are 28 or 29");
			         break;
			default: System.out.println("Invalid month number");
		}
	}
}