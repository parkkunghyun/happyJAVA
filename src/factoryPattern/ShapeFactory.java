package factoryPattern;

public class ShapeFactory {
    // 팩토리 메소드 객체 생성 후 반환
    public Shape getShape(String shapeType) {
        if(shapeType==null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new Circle();
        }
        return null;
    }
}
