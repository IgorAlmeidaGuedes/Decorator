public abstract class HamburguerDecorator implements Hamburguer{

    private Hamburguer hamburguer;
    public float preco;

    public HamburguerDecorator(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public abstract float getCustoAdicional();

    public float getPreco() {
        return this.hamburguer.getPreco() + this.getCustoAdicional() ;
    }

}
