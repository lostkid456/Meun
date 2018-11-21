public class Trio implements MenuItem {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName() {
        return this.sandwich.getName() + "/" + this.salad.getName() + "/" + this.drink.getName();
    }

    public double getPrice() {
        if (this.sandwich.getPrice() > this.salad.getPrice() && this.salad.getPrice() > this.drink.getPrice()) {
            return this.sandwich.getPrice() + this.salad.getPrice();
        } else if (this.sandwich.getPrice() > this.drink.getPrice() && this.drink.getPrice() > this.salad.getPrice()) {
            return this.sandwich.getPrice() + this.drink.getPrice();
        } else if (this.salad.getPrice() > this.sandwich.getPrice() && this.sandwich.getPrice() > this.drink.getPrice()) {
            return this.salad.getPrice() + this.sandwich.getPrice();
        } else if (this.salad.getPrice() > this.drink.getPrice() && this.drink.getPrice() > this.sandwich.getPrice()) {
            return this.salad.getPrice() + this.drink.getPrice();
        } else if (this.drink.getPrice() > this.sandwich.getPrice() && this.sandwich.getPrice() > this.salad.getPrice()) {
            return this.drink.getPrice() + this.sandwich.getPrice();
        } else {
            return this.drink.getPrice() + this.salad.getPrice();
        }
    }
}
