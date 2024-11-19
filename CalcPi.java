// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int TermNum=Integer.parseInt(args[0]);
		double start=1;
		double newnum=0;
		int cnt=0;

		while(TermNum>0)
		{
			if(cnt%2==0)
			{
				newnum=newnum+(1/start);
				cnt++;
			}
			else
			{
				newnum=newnum-(1/start);
				cnt++;
			}
			TermNum--;
			start=start+2;


		}
		double piaccordingtojava=Math.PI;
		double piapproximated=4*newnum;
		System.out.println("pi according to Java: "+piaccordingtojava);
		System.out.println("pi, approximated:     "+piapproximated);
	}
}
