package decorator;

public abstract class ComputadorDecorator implements Computador {

    private Computador computador;
    public String estrutura;

    public ComputadorDecorator(Computador computador) {
        this.computador = computador;
    }

    public Computador getCurso() {
        return computador;
    }

    public void setCurso(Computador computador) {
        this.computador = computador;
    }

    public abstract float getPercentualPrecoPeca();

    public float getPrecoPeca() {
        return this.computador.getPrecoPeca() * (1 + (this.getPercentualPrecoPeca() / 100));
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.computador.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}


