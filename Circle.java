import java.util.*;

public class Circle {
public static void main(String args[]) {
System.out.println("                                                                 Calculator for finding the area of the following shapes ");	
System.out.println("Area of circle      type: 1 ");
System.out.println("Area of cube        type: 2 ");
System.out.println("Area of rectangle   type: 3 ");
System.out.println("Area of triangle    type: 4 ");
System.out.println("Area of sphere      type: 5 ");
System.out.println("Area of cylinder    type: 6 ");
System.out.println("Area of square      type: 7 ");
System.out.println("Area of cone        type: 8 ");
System.out.println("Area of rhombus     type: 9 ");
Scanner sc=new Scanner(System.in);	
int a=sc.nextInt();
	if(a==1) {
	double pi=3.14,area1;

System.out.println("Enter the Radius of a circle: ");
int r = sc.nextInt();
area1 = pi*r*r;
System.out.println("Area of the circle is: "+area1);
}
	else if(a==2)	{
		int area2;
		System.out.println("Enter the side of the cube: ");
		int s=sc.nextInt();
		area2 = 6*s*s;
		System.out.println("Area of cube is: "+area2);
	}
	else if(a==3) {
		int w,h,area3;
		System.out.println("Enter the width of a rectangle: ");
		w=sc.nextInt();
		System.out.println("Enter the height of a rectangle: ");
		h=sc.nextInt();
		area3=w*h;
		System.out.println("Area of Rectangle is: "+area3);
	}
	else if(a==4) {
		int b,h;
		float area4;
		System.out.println("Enter the base of a triangle: ");
		b=sc.nextInt();
		System.out.println("Enter the height of a triangle: ");
		h=sc.nextInt();
		area4=(float) (0.5*b*h);
		System.out.println("Area of the triangle is: "+area4);
		}
	else if(a==5) { 
		double pi=3.14,area5;
		System.out.println("Enter the radius of a sphere: ");
		int r=sc.nextInt();
		area5=4*pi*r*r;
		System.out.println("Area of the sphere is: "+area5);
	
}
	else if(a==6) {
		double pi=3.14,area6;
		System.out.println("Enter the radius of a cylinder: ");
		int r=sc.nextInt();
		System.out.println("Enter the height of a cylinder: ");
		int h=sc.nextInt();
		area6=2*pi*r*r+h*(2*pi*r);
		System.out.println("Area of the cylinder is: "+area6);
	}
	else if(a==7) {
		System.out.println("Enter the side of a square: ");
		int s=sc.nextInt();
		int area7=s*s;
		System.out.println("Area of the square is: "+area7);
	}
	else if(a==8) {
		double pi=3.14,area8;
		System.out.println("Enter the radius of a cone: ");
		int r=sc.nextInt();
	    System.out.println("Enter the length of a cone: ");
	    int l=sc.nextInt();
	    area8=pi*r*l +pi*r*r;
	    System.out.println("Area of the cone is: "+area8);
	}
	else if(a==9) {
		System.out.println("Enter the length of a rhombus: ");
		int l=sc.nextInt();
		System.out.println("Enter the height of a rhombus: ");
		int h=sc.nextInt();
		int area9=l*h+2;
		System.out.println("Area of the rhombus is: "+area9);
	}
	else {
		System.out.println("your no. is not found ");
	}

}
}
