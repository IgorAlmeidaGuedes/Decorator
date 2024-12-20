public class BatataFrita extends HamburguerDecorator{
    public BatataFrita(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getCustoAdicional() {
        return 15.0f;
    }
}
