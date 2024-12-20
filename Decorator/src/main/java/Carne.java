public class Carne extends HamburguerDecorator{

    public Carne(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getCustoAdicional() {
        return 8.0f;
    }
}
