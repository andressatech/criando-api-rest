# Santander Dev Week 2023
Java RESTful API criada para a Santander Dev Week.

## Diagrama de Classes
```mermaid
classDiagram
    Imovel <|-- Endereco
    Imovel <|-- Descricao
    Imovel <|-- Valor
    Imovel : int id
    Imovel : String nome
    Imovel: String chamada
    Imovel: Endereco endereco
    Imovel: Descricao descricao
    Imovel: Valor valor

    class Descricao{
      -int quarto
      -int suíte
      -int vagas
      -int metragem
      -bool mobilia
    }
    class Endereco{
      -String bairro
      -String cidade
    }
    class Valor{
      -float valor
    }
```
