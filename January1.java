class January1
{
	public static void main(String [] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter the year :");
		int yr = sc.nextInt();
		int pryr = yr-1;
		int tnd = pryr*365;
		int tld = pryr/4 - pryr/100 + pryr/400;
		int td = tnd + tld;
		int d=td%7;
		String result = "Day on 1 January "+yr+" :";
		switch(d)
		{
			case 0 : result+="Monday"; break;
			case 1 : result+="Tuesday"; break;
			case 2 : result+="Wednesday"; break;
			case 3 : result+="Thursday"; break;
			case 4 : result+="Friday"; break;
			case 5 : result+="Saturday"; break;
			case 6 : result+="Sunday"; break;
		}
		System.out.println(result);
	}
}