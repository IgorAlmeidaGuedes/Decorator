public class Salada extends HamburguerDecorator{

    public Salada(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getCustoAdicional() {
        return 3.0f;
    }
}
