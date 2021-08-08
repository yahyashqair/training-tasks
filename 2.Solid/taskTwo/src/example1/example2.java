package example1;

class Circle {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}

class Square {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
}

class DrawShapes {

    public void draw(Object[] shapes) {

        for (Object shape : shapes) {
            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                System.out.println("Drawing Circle with radius " + c.getRadius());
            } else if (shape instanceof Square) {
                Square s = (Square) shape;
                System.out.println("Drawing Square with side " + s.getSide());
            }
        }
    }
}