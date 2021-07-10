public class IceCream {
    String name;
    Taste taste;
    int numberBall;
    Toping toping;
    double price;

    public IceCream(String name, Taste taste, int numberBall, Toping toping, double price) {
        this.name = name;
        this.taste = taste;
        this.numberBall = numberBall;
        this.toping = toping;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberBall() {
        return numberBall;
    }

    public void setNumberBall(int numberBall) {
        this.numberBall = numberBall;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
