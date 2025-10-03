package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadorTest {

    @Test
    void deveRetornarPrecoPecaComputador() {
        Computador computador = new ComputadorPrecoBase(1000.0f);

        assertEquals(1000.0f, computador.getPrecoPeca());
    }

    @Test
    void deveRetornarPrecoPecaComputadorComSSD() {
        Computador computador = new SSD(new ComputadorPrecoBase(1000.0f));

        assertEquals(1100.0f, computador.getPrecoPeca());
    }

    @Test
    void deveRetornarPrecoPecaComputadorComPlacaDeVideo() {
        Computador computador = new PlacaVideo(new ComputadorPrecoBase(1000.0f));

        assertEquals(1200.0f, computador.getPrecoPeca());
    }

    @Test
    void deveRetornarPrecoPecaComputadorComProcessador() {
        Computador computador = new Processador(new ComputadorPrecoBase(1000.0f));

        assertEquals(1050.0f, computador.getPrecoPeca());
    }

    @Test
    void deveRetornarPrecoPecaComputadorComSSDMaisPlacaDeVideo() {
        Computador computador = new SSD(new PlacaVideo(new ComputadorPrecoBase(1000.0f)));

        assertEquals(1320.0f, computador.getPrecoPeca());
    }

    @Test
    void deveRetornarPrecoPecaComputadorComSSDMaisProcessador() {
        Computador computador = new SSD(new Processador(new ComputadorPrecoBase(1000.0f)));

        assertEquals(1155.0f, computador.getPrecoPeca());
    }

    @Test
    void deveRetornarPrecoPecaComputadorComProcessadorMaisProcessador() {
        Computador computador = new PlacaVideo(new Processador(new ComputadorPrecoBase(1000.0f)));

        assertEquals(1260.0f, computador.getPrecoPeca());
    }

    @Test
    void deveRetornarPrecoPecaComputadorComSSDMaisProcessadorMaisProcessador() {
        Computador computador = new SSD(new PlacaVideo(new Processador(new ComputadorPrecoBase(1000.0f))));

        assertEquals(1386.0f, computador.getPrecoPeca());
    }

    @Test
    void deveRetornarEstruturaComputador() {
        Computador computador = new ComputadorPrecoBase();

        assertEquals("ComputadorBase", computador.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaComputadorComSSD() {
        Computador computador = new SSD(new ComputadorPrecoBase());

        assertEquals("ComputadorBase/SSD", computador.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaComputadorComPlacaDeVideo() {
        Computador computador = new PlacaVideo(new ComputadorPrecoBase());

        assertEquals("ComputadorBase/PlacaDeVideo", computador.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaComputadorComProcessador() {
        Computador computador = new Processador(new ComputadorPrecoBase());

        assertEquals("ComputadorBase/Processador", computador.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaComputadorComSSDMaisPlacaDeVideo() {
        Computador computador = new SSD(new PlacaVideo(new ComputadorPrecoBase()));

        assertEquals("ComputadorBase/PlacaDeVideo/SSD", computador.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaComputadorComSSDMaisProcessador() {
        Computador computador = new SSD(new Processador(new ComputadorPrecoBase()));

        assertEquals("ComputadorBase/Processador/SSD", computador.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaComputadorComPlacaDeVideoMaisProcessador() {
        Computador computador = new PlacaVideo(new Processador(new ComputadorPrecoBase()));

        assertEquals("ComputadorBase/Processador/PlacaDeVideo", computador.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaComputadorComSSDMaisPlacaDeVideoMaisProcessador() {
        Computador computador = new SSD(new PlacaVideo(new Processador(new ComputadorPrecoBase())));

        assertEquals("ComputadorBase/Processador/PlacaDeVideo/SSD", computador.getEstrutura());
    }
}