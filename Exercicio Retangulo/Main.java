public class Main {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Rectangle rectangle = new Rectangle();
        
        rectangle.setBase(3);
        rectangle.setHeight(3);
        
        System.out.println(rectangle);
        
        
        Rectangle rectangle2 = new Rectangle(3,5);
        
        rectangle.setBase(3);
        rectangle.setHeight(5);
        
        System.out.println(rectangle);
        
        
    }
}