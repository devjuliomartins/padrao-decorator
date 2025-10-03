package decorator;

public class Processador extends ComputadorDecorator {

    public Processador(Computador computador) {
        super(computador);
    }

    public float getPercentualPrecoPeca() {
        return 5.0f;
    }

    public String getNomeEstrutura() {
        return "Processador";
    }
}
