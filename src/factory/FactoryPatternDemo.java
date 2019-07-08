package factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory=new ShapeFactory();
		//获取Circle的对象，并获得draw的方法
		Shape shape1=shapeFactory.getShape("CIRCLE");
		shape1.	draw();
		
		//获取Rectangle 的对象，调用它的draw方法
		Shape shape2=shapeFactory.getShape("RECTANGLE");
		shape2.	draw();
		
		//获取square 的对象，并获得其draw方法
		Shape shape3=shapeFactory.getShape("SQUARE");
		shape3.	draw();
		
	}
	
}
