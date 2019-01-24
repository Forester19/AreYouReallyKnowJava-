class Main {
    public static void main(String args[]) {
         Shape d = new Circle(5);
         d.draw();
    }
}

class Shape {
    public Shape() {
        System.out.println(this.getClass() == Shape.class);
        draw();
    }

    public void draw() {
        System.out.println("Drawing Shape...");
    }
}

class Circle extends Shape {

    private int radius = 1;

    public Circle(int r) {
        System.out.println(radius);
        radius = r;
        System.out.println(radius);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius " + radius);
    }
}