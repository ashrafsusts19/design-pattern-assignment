package assignment3;

public class Client {
    public static void main(String[] args) {
        Burger burger = new Burger.Builder().size(12)
                .bread("White")
                .meat("Chicken")
                .sauce(false)
                .cheese(true)
                .lettuce(true)
                .build();
        System.out.println(burger);
    }
}
