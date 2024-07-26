package creational.factory;

public class StaticShapeFactory {
    public static Shape getShape(String shapeType) {
        if(shapeType==null) return null;
         else if(shapeType.equalsIgnoreCase("CIRCLE")) {
             return new Circle();
         }
         else if (shapeType.equalsIgnoreCase("OVAL")) 
             return new Oval();
             else if(shapeType.equalsIgnoreCase("RECTANGLE")) 
             return new Rectangle();
             else return null;
    } 
}
