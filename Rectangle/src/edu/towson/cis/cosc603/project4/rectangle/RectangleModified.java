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
		Double length=p2.x - p1.x;
		Double width=p2.y - p1.y;
		Double area=Math.abs(length * width);
		return area;
	}
	
	/**
	 * Gets the diagonal.
	 *
	 * @return the diagonal
	 */
	public Double getDiagonal() {
		Double length=p2.x - p1.x;
		Double width=p2.y - p1.y;
		Double diagonal=Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
		return diagonal;
	}
}