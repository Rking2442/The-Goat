package Java 102; 

public class Point{ 
    public final double x;
	public final double y;  
    
    public static Point a; 
    public static Point b; 
public Point(double x, double y) { 
        this.x = x; 
        this.y = y; 
        Point point = new Point(4, 3); 
 System.out.println("x: " + point.x + "y " + point.y); 

    }
   Point point; 
    public Point translateX(double t) { 
        return new Point (x + t, y); 

    }
    public Point translateY(double t) { 
        return new Point (x, y + t); 

    }
    Point xTranslation = point.translateX(3);
Point yTranslation = point.translateY(-7); // should be (4, -4)
Point xyTranslation = point.translateX(-4).translateY(-3); // should be (0, 0)

@Override 
public String toString() { 
    return "(" + x + ", " + y + ")"; 

}
public static double distance(Point p1, Point p2) { 
    return Math.sqrt(Math.pow(p1.x-p2.x, 2) + Math.pow(p1.y-p2.y, 2)); 
    System.out.println(Point.distance(a, b)); 

}
public static Point centerOfMass(Point[] points) { 
int length = points.length; 
double X = 0; 
double Y = 0; 

double x; 
double y; 

public double getX() {
  return x;
}

public double getY() {
        return y;
    }


for(Point point : points) { 
    X += point.getX(); 
    Y += Point.getY(); 


double centerX = X / length; 
double centerY = Y / length
return new Point(CenterX, Center Y); 

}
} 


}