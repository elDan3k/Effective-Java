package t2_builders;

import static t2_builders.NyPizza.Size.SMALL;
import static t2_builders.Pizza.Topping.ONION;
import static t2_builders.Pizza.Topping.SAUSAGE;

public class Main {
    public static void main(String[] args) {

        NyPizza nyPizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();

        Calzone calzone = new Calzone.Builder().addTopping(ONION).sauceInside().build();
    }
}
