package assignment3;

public class Burger {
    private int size;
    private String bread;
    private String meat;
    private boolean sauce;
    private boolean lettuce;
    private boolean cheese;

    private Burger(Builder builder) {
        this.size = builder.size;
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.sauce = builder.sauce;
        this.lettuce = builder.lettuce;
        this.cheese = builder.cheese;
    }

    public static class Builder {
        private int size;
        private String bread;
        private String meat;
        private boolean sauce;
        private boolean lettuce;
        private boolean cheese;

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder sauce(boolean sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder lettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder size(int size){
            this.size = size;
            return this;
        }

        public Burger build() {
            Burger burger = new Burger(this);
            this.reset();
            return burger;
        }

        private void reset(){
            this.size = 10;
            this.bread = "white";
            this.meat = "beef";
            this.cheese = true;
            this.sauce = true;
            this.lettuce = true;
        }

    }

    @Override
    public String toString() {
        return "Burger (size=" + this.size + ", bread=" + bread + ", meat=" + meat + ", sauce=" + sauce
                + ", lettuce=" + lettuce + ", cheese=" + cheese + ")";
    }
}