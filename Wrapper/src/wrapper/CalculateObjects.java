package wrapper;

public class CalculateObjects<T> {
	
	private T length;
	private T breadth;
	private T radius;
	private T text;
	
	public CalculateObjects() {
		System.out.println("Default");
	}
	
	public T getLength() {
		return length;
	}
	public void setLength(T length) {
		this.length = length;
	}
	public T getBreadth() {
		return breadth;
	}
	public void setBreadth(T breadth) {
		this.breadth = breadth;
	}
	public T getRadius() {
		return radius;
	}
	public void setRadius(T radius) {
		this.radius = radius;
	}
	public T getText() {
		return text;
	}
	public void setText(T text) {
		this.text = text;
	}
	/*public CalculateObjects(T length, T breadth, T radius, T text) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.radius = radius;
		this.text = text;*/
	}
	
	
	
	


