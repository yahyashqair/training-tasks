package Example3;
interface Vehicle {
    void setPrice(double price);
    void setColor(String color);
    void start();
    void stop();
    void fly();
}

class Car implements Vehicle {
    double price;
    String color;
    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public void setColor(String color) {
        this.color=color;
    }
    @Override
    public void start(){}
    @Override
    public void stop(){}
    @Override
    public void fly(){}
}
