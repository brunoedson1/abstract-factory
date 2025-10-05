# 🏗️ Padrão Abstract Factory – Relatórios e Demonstrativos Financeiros

Este projeto demonstra o uso do **padrão de projeto Abstract Factory** em **Java**, aplicado ao contexto de **geração de relatórios e demonstrativos financeiros empresariais**.  
O objetivo é mostrar como criar **famílias de objetos relacionados** (relatórios e demonstrativos) **sem expor suas classes concretas**, mantendo a aplicação **flexível, extensível e com baixo acoplamento**.

---

## 📝 O que é o Abstract Factory?

O **Abstract Factory** é um **padrão de criação** que fornece **uma interface para criar famílias de objetos relacionados**, sem especificar suas classes concretas.  

Principais vantagens:
- 🔹 Permite **adicionar novos produtos** facilmente sem alterar o código cliente.
- 🔹 **Isola a criação de objetos** em fábricas específicas.
- 🔹 Garante **consistência** entre objetos de uma mesma família.

> ✅ Ideal para sistemas que precisam trabalhar com **múltiplas famílias de produtos** (por exemplo: relatórios e demonstrativos financeiros).

---

## 💼 Cenário: Relatórios e Demonstrativos Financeiros

Neste projeto, o Abstract Factory é utilizado para gerar **duas famílias de produtos financeiros**:

- **Relatórios** 📊 – Ex.: Relatório de Balanço
- **Demonstrativos** 📈 – Ex.: Demonstrativo de Balanço

Cada família de produto possui suas **interfaces e implementações concretas**, permitindo que a aplicação trabalhe de forma uniforme com diferentes tipos de relatórios e demonstrativos.

---


### 🔑 Principais componentes:
- **`FabricaAbstrata`** – Interface da fábrica abstrata, define os métodos de criação de **relatórios** e **demonstrativos**.
- **`FabricaBalanco`** – Implementação concreta que cria **relatórios e demonstrativos de balanço**.
- **`IRelatorio` e `IDemonstrativo`** – Interfaces para as famílias de produtos.
- **`RelatorioBalanco` e `BalancoDemonstrativo`** – Implementações concretas das famílias de produtos.
- **Testes (`FabricaBalancoTest` e `FabricaFiscalTest`)** – Validam a criação e comportamento dos objetos produzidos pela fábrica.
