package wrapper;

public class Box {

	public static void main(String[] args) {
		//rectangle area
		CalculateObjects<Integer> rectobj=new CalculateObjects<>();
		rectobj.setLength(10);
		rectobj.setBreadth(5);
		int area = rectobj.getLength() * rectobj.getBreadth();
		System.out.println("Area of Rectangle : " +area);
		
		//circle area
		CalculateObjects<Double> circleobj=new CalculateObjects<>();
		circleobj.setRadius(5.5);
		Double circleArea = Math.PI * circleobj.getRadius() * circleobj.getRadius();
		System.out.println("Area of Circle: " + circleArea);
		
		//perimeter
		CalculateObjects<Integer> square=new CalculateObjects<>();
		square.setLength(10);
		int perimeter=4*square.getLength();
		System.out.println("Perimeter of square :"+perimeter);
		
		//trainagle
		CalculateObjects<Integer> triobj=new CalculateObjects<>();
		triobj.setLength(10);
		triobj.setBreadth(5);
		int area1 = (int) (0.5* triobj.getLength() * triobj.getBreadth());
		System.out.println("Area of traingle : " +area1);

	}

}
