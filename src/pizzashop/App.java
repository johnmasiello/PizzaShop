package pizzashop;

import pizzashop.menu.Pizza;

public class App {
    public static void main(String[] args) {
        int size = 12;
        String crust = "Thin";
        String[] toppings = {"Cheese", "Tomato Sauce", "Pepperoni"};

        Pizza cheesePizza; // only in stack
        cheesePizza = new Pizza(size, crust, "Cheese", "Tomato Sauce", "Pepperoni"); // now in heap
        System.out.println(cheesePizza);
    }
}