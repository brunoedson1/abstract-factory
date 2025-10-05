package br.ufjf.padroesdeciacao.abstractfactory;

public class FabricaFiscal implements FabricaAbstrata {
    public IRelatorio criarRelatorio() {
        return new FiscalRelatorio();
    }
    public IDemonstrativo criarDemonstrativo() {
        return new FiscalDemonstrativo();
    }
}

