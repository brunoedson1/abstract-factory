package br.ufjf.padroesdeciacao.abstractfactory;

public class FiscalRelatorio implements IRelatorio {
    public String gerar() {
        return "Relatório Fiscal gerado";
    }
}

