public class Shape {

        //fill your code here
	public static Double value1, value2;
	
	
	

	public static class Rectangle {
	    //fill your code here
		public void setValue1(Double value1) {
			Shape.value1 = value1;
		}

		public void setValue2(Double value2) {
			Shape.value2 = value2;
		}
		public Double computeRectangleArea() {
			return value1*value2;
		}
	}
	
	public static class Triangle {
	    //fill your code here

		public void setValue1(Double value1) {
			Shape.value1 = value1;
		}

		public void setValue2(Double value2) {
			Shape.value2 = value2;
		}
		public Double computeTriangleArea() {
			return 0.5*value1*value2;
		}
	}	
}