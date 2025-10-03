package decorator;

public class SSD extends ComputadorDecorator {

    public SSD(Computador computador) {
        super(computador);
    }

    public float getPercentualPrecoPeca() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "SSD";
    }
}
