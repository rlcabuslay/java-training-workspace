package sef.module6.activity;

public class Point2DImpl implements Point2D {
	
	private double x;
	private double y;
	
	/**
	 * Creates a Point2D object at a default location (0,0)
	 */
	public Point2DImpl(){
		
	}
	
	/**
	 * Create a Point2D object that represents a 2D coordinate specified 
	 * by the constructor parameters
	 * 
	 * @param x coordinate of the point along the x-axis
	 * @param y coordinate of the point along the y-axis
	 */
	public Point2DImpl(double x, double y){
		this.x = x;
		this.y = y;
	}
	

	/* (non-Javadoc)
	 * @see sef.module5.activity.Point2D#move(double, double)
	 */
	public final void move(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point2D#setX(double)
	 */
	public void setX(double x){
		this.x = x;
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point2D#setY(double)
	 */
	public void setY(double y){
		this.y = y;
	}
	

	/* (non-Javadoc)
	 * @see sef.module5.activity.Point2D#getX()
	 */
	public double getX(){
		return this.x;
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point2D#getY()
	 */
	public double getY(){
		return this.y;
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point2D#translate(double, double)
	 */
	public final void translate(double dx, double dy){
		this.x += dx;
		this.y += dy;
	}
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object p){
		
		if(p instanceof Point2D) {
			Point2D point = (Point2D) p;
			
			if((this.x == point.getX()) && (this.y == point.getY())) {
				return true;
			}
			else {
				return false;
			}
		} else {
			return false;
		}

	}
	

	/* (non-Javadoc)
	 * @see sef.module5.activity.Point2D#equals(double, double)
	 */
	public boolean equals(double x2, double y2){
		if((this.x == x2) && (this.y == y2)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point2D#getDistance(sef.module5.activity.Point2D)
	 */
	public final double getDistance(Point2D p){
		double distance = Math.sqrt(Math.pow((p.getX() - this.x), 2) + Math.pow((p.getY() - this.y), 2) );
		return distance;
	}
	
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point2D#getDistance(double, double)
	 */
	public final double getDistance(double x2, double y2){
		double distance = Math.sqrt(Math.pow((x2 - this.x), 2) + Math.pow((y2 - this.y), 2));
		return distance;
	}
	
	
	
}
