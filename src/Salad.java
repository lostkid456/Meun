public class Salad implements MenuItem {
    private String name;
    private double price;

    public Salad(double price, String name){
        this.name=name;
        this.price=price;
    }

    public double getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }
}

