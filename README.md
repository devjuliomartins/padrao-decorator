# Padrão Decorator

O **padrão Decorator** é um padrão de projeto **estrutural** que permite **adicionar comportamentos** a objetos de forma **dinâmica** e **flexível**, sem alterar o código da classe original.  
Ele é útil quando precisamos estender funcionalidades sem criar diversas subclasses.

No exemplo deste projeto, a interface `Computador` representa o componente base.  
O `ComputadorPrecoBase` é a implementação inicial, e os **decoradores** (`PlacaVideo`, `Processador`, `SSD`) permitem adicionar novos componentes ao computador, incrementando o preço de forma flexível.  
A classe `ComputadorDecorator` garante que os novos recursos possam ser adicionados em **camadas**, sem modificar a estrutura principal.

## Quando usar Decorator
- Para **adicionar responsabilidades** a objetos em tempo de execução.  
- Quando a herança não é prática ou levaria a uma **explosão de subclasses**.  
- Para **estender funcionalidades** de forma flexível, sem alterar código já existente.  

## Como usar este projeto
- Clone o repositório:
  ```bash
  git clone https://github.com/devjuliomartins/padrao-decorator.git
