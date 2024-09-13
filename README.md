
# Desafio de Projeto - POO


## Modelagem e Diagramação de um Componente iPhone

Nesse desafio a proposta foi elaborar um diagrama de classes e interfaces utilizando uma ferramenta UML e implementá-los em .java.

```mermaid
---
title: Diagramação de Classes do iPhone
---

classDiagram
    
    iPhone <|-- ReprodutorMusical
    iPhone <|-- AparelhoTelefonico
    iPhone <|-- NavegadorInternet
    iPhone : +reprodutorMusical
    iPhone : +aparelhoTelefonico
    iPhone : +navegadorInternet 
    class ReprodutorMusical{
       +tocar()
       +pausar()
       +selecionarMusica("Dancing Queen - ABBA")
    
    }
    class AparelhoTelefonico{
        +ligar(99 9999-9999)
        +atender()
        +iniciarCorreioVoz()
    
    }
    class NavegadorInternet{
        +exibirPagina(https://www.coffee.com)
        +adicionarNovaAba()
        +atualizarPagina()
    }
```
