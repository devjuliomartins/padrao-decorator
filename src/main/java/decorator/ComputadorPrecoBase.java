package decorator;

public class ComputadorPrecoBase implements Computador {

    public float precoPeca;

    public ComputadorPrecoBase() {
    }

    public ComputadorPrecoBase(float precoPeca) {
        this.precoPeca = precoPeca;
    }

    public float getPrecoPeca() {
        return precoPeca;
    }

    public String getEstrutura() {
        return "ComputadorBase";
    }

}
