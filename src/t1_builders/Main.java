package t1_builders;

import static t1_builders.NyPizza.Size.LARGE;
import static t1_builders.NyPizza.Size.SMALL;
import static t1_builders.Pizza.Topping.ONION;
import static t1_builders.Pizza.Topping.SAUSAGE;

public class Main {
    public static void main(String[] args) {

        NyPizza nyPizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();

        Calzone calzone = new Calzone.Builder().addTopping(ONION).sauceInside().build();
    }
}
