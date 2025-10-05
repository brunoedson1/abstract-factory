package br.ufjf.padroesdeciacao.abstractfactory;

public class BalancoRelatorio implements IRelatorio {
    public String gerar() {
        return "Relatório de Balanço gerado";
    }
}