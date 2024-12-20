public class Refrigerante extends HamburguerDecorator{

    public Refrigerante(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getCustoAdicional() {
        return 10.0f;
    }

}
