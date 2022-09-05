public class Rectangle {
    		
	//Fill your code
	
	private int a,b;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int a, int b) {
		this.a = a;
		this.b=b;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public Integer area() {		
		//Fill your code
		return a*b;	

	}
	public void display(){
		//Fill your code
		System.out.println("Rectangle Dimension");
		System.out.println("Length:"+a);
		System.out.println("Width:"+b);
	}
	
	Rectangle dimensionChange(Integer newDimension){

		//Fill your code	
		Rectangle rectangleObject = new Rectangle();
		
		if (rectangleObject instanceof Rectangle) {
			rectangleObject.setA(a * newDimension);
			rectangleObject.setB(b * newDimension);
		}
		else {
			rectangleObject = null; 
		}
		return rectangleObject;
	}
	

}
