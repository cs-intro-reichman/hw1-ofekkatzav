// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentVal = Integer.parseInt(args[0]);
        double rate = Double.parseDouble(args[1]);
        int years = Integer.parseInt(args[2]);
        double futureVal = currentVal * Math.pow(1+(rate/100),years);
        double Mispar = Math.pow(2,4);
        System.out.println("After "+years+"years , " +currentVal+"$ saved at "+rate+"% will yield "+futureVal+"$");
        System.out.println(Mispar);
	}
}