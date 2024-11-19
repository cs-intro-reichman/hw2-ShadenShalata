// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int seed=Integer.parseInt(args[0]);
		int saveseed=seed;
		String Ch = args[1];
		int firstseq=0;
		int startofseq =0;
		int N=1;
		int cntsteps=0;
		if(Ch.charAt(0)=='v')
		{
			while(seed>0)
			{
				
				while(startofseq!=1)
				{
					if(firstseq==0)
					{
						startofseq=N;
						System.out.print(startofseq+" ");
						cntsteps++;
						firstseq++;
					}
				
					
				
				if(startofseq%2==0)
					{
						startofseq=startofseq/2;
						System.out.print(startofseq+" ");
						cntsteps++;
					}
				
				else
				{
					startofseq=startofseq*3+1;
					System.out.print(startofseq+" ");
					cntsteps++;
				}
			    }
				System.out.println("("+cntsteps+")");
				N++;
				seed--;
				startofseq=0;
				cntsteps=0;
			    firstseq=0;

				
			}
			System.out.println("Every one of the first "+saveseed+" hailstone sequences reached 1.");
		}
		else
		{
			System.out.println("Every one of the first "+seed+" hailstone sequences reached 1.");
		}
	}
	
}
