public class Rectangle {

    private int base;
    private int height;
    
    public Rectangle(){
    
    }
    
    public Rectangle(int base, int height){
    this.base = base;
    this.height = height;
    }
    
    public int getBase() {
        return this.base;
    }
    
    public void setBase(int base) {
        this.base = base;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public double calculateAreaOfRectangle() {
        return this.base * this.height;
    }
    
    public double calculatePerimeterOfRectangle() {
        return 2 * (this.base + this.height);
        //return 2 * this.base + 2 * this.height;        
    }
    
    @Override
    public String toString() {
        return "Base : " + this.base
             + "\nAltura : " + this.height
             + "\nÁrea: " + calculateAreaOfRectangle()
             + "\nPerímetro: " + calculatePerimeterOfRectangle();
    }

}