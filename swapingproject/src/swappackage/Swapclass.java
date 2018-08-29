package swappackage;

public class Swapclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=13,y=20;
System.out.println("before swapping values of x and y:\nx=");
System.out.print(x);
System.out.print("\ty=");System.out.print(y);
y=x+y;
x=y-x;
y=y-x;
System.out.println("after swapping values of x and y:\nx=");
System.out.print(x);
System.out.println("y=");System.out.print(y);

	}

}
