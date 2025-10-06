package br.ufjf.padroesdeciacao.abstractfactory;

public interface FabricaAbstrata {
    IRelatorio criarRelatorio();
    IDemonstrativo criarDemonstrativo();
}