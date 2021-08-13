public class LineEquality {
	public static void LineEqual() {
	
	int x1,x2,y1,y2;
	x1=2;
	y1=3;
	x2=4;
	y2=2;
	double lenght1= Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1,2)));
	String lenght12 = Double.toString(lenght1);
	int x3,y3,x4,y4;
	x3=3;
	y3=4;
	x4=5;
	y4=7;
	double lenght2= Math.sqrt((Math.pow(x4-x3, 2))+(Math.pow(y4-y3,2)));
	String lenght22= Double.toString(lenght2);
	System.out.println("line equality for given end points lines are:"+ ""+lenght12.equals(lenght22));
    }

}