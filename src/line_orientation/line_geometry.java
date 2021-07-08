package line_orientation;

public class line_geometry {
	public static void main(String[] args)
	{
		int x1 = 10;
		int x2 = 20;
		int y1 = 30;
		int y2 = 40;
		int x3 = 50;
		int x4 = 60;
		int y3 = 70;
		int y4 = 80;
		double length1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("length1= "+length1);
		
		double length2 = Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
		System.out.println("length2= "+length2);
		Double l1 = length1;
		Double l2 = length2;
	    
		int l3 = l1.compareTo(l2);
		if(l3 == 0)
		{
	      System.out.println("Two lengths are equal");
	      
		}
		else
		{
		 System.out.println("Two lengths are not equal");
		 
		}
				
		
		
		
	}
}