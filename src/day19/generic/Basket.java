package day19.generic;

//제네릭 클래스
public class Basket<F> {

    private F f;

    public void setF(F f) {
        this.f = f;
    }

    public F getF() {
        return f;
    }

}
