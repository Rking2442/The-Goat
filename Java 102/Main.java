package Java 102; 
import Java.Point;
import java.util.ArrayList; 

import com.sun.jdi.connect.Connector;
import java.awt.GridBagConstraints;

--enable-preview





public Learn() { 
ArrayList<String> arr = new ArrayList<>(); 
arr.add("Hello"); 
arr.add("World"); 
System.out.println(arr); 
arr.set(0, "bye"); 

ArrayList<Boolean> conditions = new ArrayList<>();
conditions.add(true);
conditions.add(arr.get(0) == "Hello");
conditions.add(conditions.get(0) || conditions.get(1));
ArrayList<Integer> intArr = new ArrayList<>(); 
for(int i = 0; i <5.50; i++) { 
    intArr.add(0); 
} 
System.out.println(intArr.size()); 

import java.util.ArrayList;
public class Grid<T> { 
private final ArrayList<T>> grid; 
public final int sideLength; 
public Grid(int sideLength, T defaultVal) { 
        this.sideLength = sideLength; 
        this.grid = new ArrayList<ArrayList<T>>(sideLength);
        for (int i = 0; i < sideLength; i++) { 
            grid.add(new ArrayList<>(sideLength));
			for (int j = 0; j < sideLength; j++) {
				grid.get(i).add(defaultVal);
                Grid<Integer> grid = new Grid<>(5, 0);
grid.set(2, 2, 4);
System.out.println(grid);
			}
		}
	}
} 
} 
public T get(int row, int col) {
		return grid.get(row).get(col);
	}

	public void set(int row, int col, T val) {
		grid.get(row).set(col, val);
	}

	@Override
	public String toString() {
		String str = "";
		for (ArrayList<T> row : grid) {
			for (T element : row) {
				str += element + " ";
			}
			str += "\n";
		}
		return str;
	}
   
}
public ArrayList<T> diagnol() { 
    ArrayList<T> diagonalElements = new ArrayList<>(); 
    int size = Math.min(grid.length, grid[0].length); 
    for (int i = 0; i < size; i++) { 
        diagonalElements.add(grid[i][i]); 
    
    }
    return diagonalElements; 

}
=
public class Circle {
	public final Point center;
	public final double radius;
    Circle circle = new Circle(5, 10); 

	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	=
	public boolean isInside(Point p) {
		return Point.distance(center, p) < radius;
	}

	public boolean isOn(Point p) {
		return Point.distance(center, p) == radius;
	}
	public Circle translate(double x, double y) {
		return new Circle(center.translateX(x).translateY(y), radius);
	}

	public Circle scale(double k) {
		return new Circle(center, radius * k);
	}

	@Override
	public String toString() {
		return "(center: " + center + "; radius: " + radius + ")";
	}
    scale(5); 
    return circle; 

}
public class Square {
	public final Point corner;
	public final double sideLength;

	/**
	* @param corner The bottom left corner of the square
	* @param sideLength
	*/
	public Square(Point corner, double sideLength) {
		this.corner = corner;
		this.sideLength = sideLength;
	}

	public double area() {
		return Math.PI * Math.pow(sideLength, 2);
	}
	
	public double perimeter() {
return sideLength * 4;	}
	
	/** 
	* @return Whether point p is inside of the square.
	*/
	public boolean isInside(Point p) {
		double xDist = p.x - corner.x;
		double yDist = p.y - corner.y;
		return 0 < xDist && xDist < sideLength &&
			   0 < yDist && yDist < sideLength;
	}

	/** 
	* @return Whether point p part of/on the border of the square.
	*/
	public boolean isOn(Point p) {
		return Point.distance(corner, p) == radius; 
	}
	
	/** 
	* @param x How much to translate the sqaure by in the + x direction.
	* @param y How much to translate the squarer by in the + y direction.
	* @return The sqaure that results from the translation.
	*/
	public Square translate(double x, double y) {
		return new Square(corner.translateX(x).translateY(y)); 
	}

	/** 
	* @return The sqaure that results from scaling the side length and maintaining the bottom left corner
	*/
	public Square scale(double k) {
		return new Square(corner, sideLength * k);
	}

	public Point[] corners() {
	corners[] = [(x, sideLength)(y, sideLength)(sideLength, sideLength)(sideLength - x, sideLength - y)]; 
	}

	@Override
	public String toString() {
		return "(corner: " + corner + "; side length: " + sideLength + ")";
	}
    def sumAreas(vsr shapes) { 
        var sum = 0; 
        for (var shape : shapes) { 
            sum+= shape.area()
        }
        return sum; 
    }
    public class FakeShape implements Shape {
	public double area() { 
        return 0; 
        }

	public Square scale(double k) { 
		return new Square(new Point(0, 0), 1); 
	}
}

}


public class B extends A {
super(field1and2, field1and2);





public class LibraryItem {
    public final String title;
    public final String itemId;
    
    protected boolean isCheckedOut = false;

    public LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
    }
    public static void returnAll(LibraryItem[] items) { 

    for(i = 0; i < items.length; i++) {
      if(  isAvailable(items)) { 
        returnItem(items); 
      }



    }
    }

	public boolean available() {
		return !isCheckedOut;
	}

    public void checkOut() {
        isCheckedOut = true;
    }

    public void returnItem() {
        isCheckedOut = false;
    }
}
public class Book extends LibraryItem {
    public final String author;
    public final int pageCount;

    public Book(String title, String itemId, String author, int pageCount) {
        super(title, itemId);
        this.author = author;
        this.pageCount = pageCount;
    }

	@Override
    public String toString() {
        return "Book: " + title + " by " + author + ", " + 
		        pageCount + " pages";
    }
}
public class DVD extends LibraryItem {
    public final double runtime;

    public DVD(String title, String itemId, double runtime) {
        super(title, itemId);
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return "DVD: " + title + ", Runtime: " + runtime + " minutes";
    }
}









