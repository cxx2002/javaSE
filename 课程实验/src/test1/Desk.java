package test1;

public class Desk{
    public static void main(String[] args) {
        TableInfo tb = new TableInfo("Rect",4,80,1200);
      /*  tb.setShape("Rect");
        tb.setLegs(4);
        tb.setHigh(80);
        tb.setArea(1200);*/
        System.out.println("Shape:"+tb.getShape());
        System.out.println("Legs:"+tb.getLegs());
        System.out.println("Hight:"+tb.getHigh());
        System.out.println("Area:"+tb.getArea());
    }
}

 class TableInfo{
    private String shape;
    private int legs;
    private int high;
    private int area;

     public String getShape() {
         return shape;
     }

     public void setShape(String shape) {
         this.shape = shape;
     }

     public int getLegs() {
         return legs;
     }

     public void setLegs(int legs) {
         this.legs = legs;
     }

     public int getHigh() {
         return high;
     }

     public void setHigh(int high) {
         this.high = high;
     }

     public int getArea() {
         return area;
     }

     public void setArea(int area) {
         this.area = area;
     }

     public TableInfo(String shape, int legs, int high, int area) {
         this.shape = shape;
         this.legs = legs;
         this.high = high;
         this.area = area;
     }

     public TableInfo() {
     }
 }