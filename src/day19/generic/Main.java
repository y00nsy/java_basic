package day19.generic;

public class Main {
    public static void main(String[] args) {

        System.out.println("=========================================");

        Basket<Apple> appleBasket = new Basket<Apple>();
        appleBasket.setF(new Apple());

        Apple aa = appleBasket.getF();
        System.out.println("aa = " + aa);

        Basket<Banana> bananaBasket = new Basket<>();
        bananaBasket.setF(new Banana());

        Basket<Grape> grapeBasket = new Basket<>();
        grapeBasket.setF(new Grape()
        );
    }
}
