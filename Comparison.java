public class Comparison {
	public static void main(String[] args) {
	System.out.println("Welocme to line Comparison computation program");
	int x1,x2,y1,y2;
	x1=2;
	y1=3;
	x2=4;
	y2=2;
	double lenght1= Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1,2)));
	String lenght12 = Double.toString(lenght1);
	int x3,y3,x4,y4;
	x3=2;
	y3=3;
	x4=4;
	y4=2;
	double lenght2= Math.sqrt((Math.pow(x4-x3, 2))+(Math.pow(y4-y3,2)));
	String lenght22= Double.toString(lenght2);
	System.out.println("compariosn for two lines are:"+ ""+lenght12.compareTo(lenght22));
    }

}