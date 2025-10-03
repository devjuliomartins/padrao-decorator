package decorator;

public class PlacaVideo extends ComputadorDecorator {

    public PlacaVideo(Computador computador) {
        super(computador);
    }

    public float getPercentualPrecoPeca() {
        return 20.0f;
    }

    public String getNomeEstrutura() {
        return "PlacaDeVideo";
    }
}
