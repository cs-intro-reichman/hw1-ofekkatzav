// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);
		int a = (int)(range * Math.random());
		int b = (int)(range * Math.random());
		int c = (int)(range * Math.random());

		int sumAll = a + b + c;

		int minNum = (int)Math.min(Math.min(a,c),Math.min(a,b));
		int maxNum = (int)Math.max(Math.max(a,c),Math.max(a,b));
		int middleNum = sumAll - minNum - maxNum;
		System.out.println(a+" "+b+" "+c);
		System.out.println(minNum+" "+middleNum+" "+maxNum);	}
}
