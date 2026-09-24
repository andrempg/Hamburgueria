public class Queijo extends AdicionalDecorator {

    public Queijo(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String getDescricao() {
        return sanduiche.getDescricao() + ", queijo";
    }

    @Override
    public double getPreco() {
        return sanduiche.getPreco() + 2.50;
    }
}