public class Chapter_9 {
/*
1.  Create a class Cylinder ans use getters and setters to set it's radius and height;

2.  Use 1 to calculate surface area and volume of the cylinder

3.  Use a constructor and repeat 1

4.  Overload a constructor used to initialize a rectangle of length 4 breadth 5 for using custom parameters
 */
}

// Solution 1 & 2
class Cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea(){
        return (2 * Math.PI * radius * (radius + height));
    }

    public double getVolume(){
        return (Math.PI * radius * radius * height);
    }
}

class Sol_9_1 {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setRadius(9);
        myCylinder.setHeight(12);
        System.out.println("Radius\t:\t" + myCylinder.getRadius());
        System.out.println("Height\t:\t" + myCylinder.getHeight());
        System.out.println("Area\t:\t" + myCylinder.getArea());
        System.out.println("Volume\t:\t" + myCylinder.getVolume());
    }
}




// Solution 3
class Cylinder83 {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public Cylinder83(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public double getArea() {
        return (2 * Math.PI * radius * (radius + height));
    }

    public double getVolume() {
        return (Math.PI * radius * radius * height);
    }
}

class Sol_9_3 {
    public static void main(String[] args) {
        Cylinder83 myCylinder83 = new Cylinder83(9,12);
        System.out.println("Radius\t:\t" + myCylinder83.getRadius());
        System.out.println("Height\t:\t" + myCylinder83.getHeight());
        System.out.println("Area\t:\t" + myCylinder83.getArea());
        System.out.println("Volume\t:\t" + myCylinder83.getVolume());
    }
}




// Solution 4
class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

class Sol_9_4 {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();

        System.out.println("Lenght\t:\t" + myRectangle.getLength());
        System.out.println("Breadth\t:\t" + myRectangle.getBreadth());
    }
}