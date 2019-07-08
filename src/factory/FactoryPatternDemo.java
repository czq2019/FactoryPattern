package factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory=new ShapeFactory();
		//��ȡCircle�Ķ��󣬲����draw�ķ���
		Shape shape1=shapeFactory.getShape("CIRCLE");
		shape1.	draw();
		
		//��ȡRectangle �Ķ��󣬵�������draw����
		Shape shape2=shapeFactory.getShape("RECTANGLE");
		shape2.	draw();
		
		//��ȡsquare �Ķ��󣬲������draw����
		Shape shape3=shapeFactory.getShape("SQUARE");
		shape3.	draw();
		
	}
	
}
