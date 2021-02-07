package interfaceDemo;

class Rectangle implements Polygon,Line 
{
	   public void getArea() {
	      int length = 6;
	      int breadth = 5;
	      int area = length * breadth;
	      System.out.println("The area of the rectangle is "+area);
	   }

	   public void getSides() {
	      System.out.println("I have 4 sides.");
	   }
	   
	   public void size()
	   {
		   System.out.println("size");
	   }
	}
