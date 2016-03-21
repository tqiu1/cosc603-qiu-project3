package edu.towson.cis.cosc603.project4.rectangle;


//TODO: Auto-generated Javadoc
/**
* The Class Rectangle.
*/
public class RectangleModified {
	
	/** The p2. */
	private Point p1, p2;
	
	/**
	 * Instantiates a new rectangle.
	 *
	 * @param p1 the p1
	 * @param p2 the p2
	 */
	RectangleModified(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	/**
	 * Gets the area.
	 *
	 * @return the area
	 */
	public Double getArea() {
		Double area=Math.abs((p2.x - p1.x) * (p2.y - p1.y));
		System.out.println("p1.x = "+p1.x);
		System.out.println("p1.y = "+p1.y);
		System.out.println("p2.x = "+p2.x);
		System.out.println("p2.y = "+p2.y);
		System.out.println("Area = "+area);
		return area;
	}
	
	/**
	 * Gets the diagonal.
	 *
	 * @return the diagonal
	 */
	public Double getDiagonal() {
		Double diagonal=Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
		System.out.println("p1.x = "+p1.x);
		System.out.println("p1.y = "+p1.y);
		System.out.println("p2.x = "+p2.x);
		System.out.println("p2.y = "+p2.y);
		System.out.println("Diagonal = "+diagonal);
		return diagonal;
	}
}