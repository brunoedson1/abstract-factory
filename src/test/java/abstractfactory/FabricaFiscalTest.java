package abstractfactory;

import br.ufjf.padroesdeciacao.abstractfactory.FabricaAbstrata;
import br.ufjf.padroesdeciacao.abstractfactory.FabricaFiscal;
import br.ufjf.padroesdeciacao.abstractfactory.IDemonstrativo;
import br.ufjf.padroesdeciacao.abstractfactory.IRelatorio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FabricaFiscalTest {

    @Test
    public void testCriarRelatorioFiscal() {
        FabricaAbstrata fabrica = new FabricaFiscal();
        IRelatorio relatorio = fabrica.criarRelatorio();
        assertEquals("Relatório Fiscal gerado", relatorio.gerar());
    }

    @Test
    public void testCriarDemonstrativoFiscal() {
        FabricaAbstrata fabrica = new FabricaFiscal();
        IDemonstrativo demonstrativo = fabrica.criarDemonstrativo();
        assertEquals("Demonstrativo Fiscal analisado", demonstrativo.analisar());
    }
}

