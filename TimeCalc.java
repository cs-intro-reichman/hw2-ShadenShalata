public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // Replace this comment with the rest of your code
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalminutes= (hours*60)+minutes+minutesToAdd;
        int totalhours=totalminutes/60;
        int newhours=totalhours%24;
        int newminutes=totalminutes-(totalhours*60);
        if(newhours<10)
        {
            if(newminutes<10)
            {
                System.out.println("0"+newhours+":0"+newminutes);
            }
            else
            {
                System.out.println("0"+newhours+":"+newminutes);
            }
        }
        else
        {
            if(newminutes<10)
            {
                System.out.println(newhours+":0"+newminutes);
            }
            else
            {
                System.out.println(newhours+":"+newminutes);
            }
        }
    }
}
