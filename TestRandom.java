// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    // Replace this comment with your code
		int N=Integer.parseInt(args[0]);
		int countabove=0;
		int countbelow=0;
		while(N>0)
		{
			double a=(double)(Math.random()*1);
			
			if(a>0.5)
			{
				countabove++;
			}
			else
			{
				countbelow++;
			}
			N--;
			
	    }
		if(countabove==0||countbelow==0)
		{
			System.out.println("> 0.5: "+countabove+" times");
			System.out.println("<= 0.5: "+countbelow+" times");
		}
		else {
			System.out.println("> 0.5: "+countabove+" times");
			System.out.println("<= 0.5: "+countbelow+" times");
			if(countabove>countbelow)
			{
				System.out.println("Ratio: "+(((double)countbelow)/countabove)+" times");
			}
			else
			{
				System.out.println("Ratio: "+(((double)countabove)/countbelow)+" times");
			}


		}

		}
		
}
