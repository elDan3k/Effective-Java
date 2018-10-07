package t1_builders;

import java.util.Objects;

public class NyPizza extends Pizza{
    public enum Size{SMALL, MMEDIUM, LARGE}
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder){
        super(builder);
        size = builder.size;
    }
}
