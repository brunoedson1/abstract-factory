package abstractfactory;

import br.ufjf.padroesdeciacao.abstractfactory.FabricaAbstrata;
import br.ufjf.padroesdeciacao.abstractfactory.FabricaBalanco;
import br.ufjf.padroesdeciacao.abstractfactory.IDemonstrativo;
import br.ufjf.padroesdeciacao.abstractfactory.IRelatorio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FabricaBalancoTest {

    @Test
    public void testCriarRelatorioBalanco() {
        FabricaAbstrata fabrica = new FabricaBalanco();
        IRelatorio relatorio = fabrica.criarRelatorio();
        assertEquals("Relatório de Balanço gerado", relatorio.gerar());
    }

    @Test
    public void testCriarDemonstrativoBalanco() {
        FabricaAbstrata fabrica = new FabricaBalanco();
        IDemonstrativo demonstrativo = fabrica.criarDemonstrativo();
        assertEquals("Demonstrativo de Balanço analisado", demonstrativo.analisar());
    }
}