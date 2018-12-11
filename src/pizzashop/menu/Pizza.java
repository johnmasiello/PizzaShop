package pizzashop.menu;

import java.util.Arrays;

public class Pizza {
    int size;
    String crust;
    String[] toppings;

    /*
    access modifiers: public, (default), protected, private
    prviate: only accessible within the class
    (default) only accessible within the package
    protected: same as default and with members accessible to child classes
    public: accessible anywhere
    */
    public Pizza(int size, String crust, String ...toppings) {
        this.size = 2 * size;
        this.crust = crust;
        Arrays.sort(toppings);
        this.toppings = toppings;
    }

    public Pizza() {

    }

    public String toString() {
        return "Pizza Size: " + size + "\nPizza Crust: " + crust
            + "\nPizza Toppings: " + Arrays.toString(toppings);
    }
}