// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String Cheer = args[0];
            Cheer=Cheer.toUpperCase();
            int Times=Integer.parseInt(args[1]);
            int length= Cheer.length();
            int cnt=0;
            while(cnt<=length-1)
            {
                char check=Cheer.charAt(cnt);
                if(check=='A'||check=='E'||check=='F'||
                check=='H'||check=='I'||check=='L'||
                check=='M'||check=='N'||check=='O'||
                check=='R'||check=='S'||check=='X')
                {
                        System.out.println("Give me an "+check+": "+check+"!");
                }
                else
                {
                        System.out.println("Give me a  "+check+": "+check+"!");
                }
        
                
                cnt++;
            }
            System.out.println("What does that spell?");
            while(Times>0)
            {
                System.out.println(Cheer+"!!!");
                Times--;
            }
            

        }
}
