public class Check{
	public static void main (String [] args){
		System.out.print("Method used ");
		int ranndom = (int)(( Math.random()*10 ) % 2 );
		if ( ranndom == 1) {
			System.out.print("CompareTo :");
			System.out.println();
			Comparison.CompareLine();
		}
		else {
			System.out.print("Equals :");
			System.out.println();
			LineEquality.LineEqual();
		}
	}
}