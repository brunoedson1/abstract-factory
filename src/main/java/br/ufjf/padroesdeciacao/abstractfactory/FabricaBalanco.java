package br.ufjf.padroesdeciacao.abstractfactory;

public class FabricaBalanco implements FabricaAbstrata {
    public IRelatorio criarRelatorio() {
        return new BalancoRelatorio();
    }
    public IDemonstrativo criarDemonstrativo() {
        return new BalancoDemonstrativo();
    }
}

