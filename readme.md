# Abstrair Bootcamp

## Desfaio de Projeto

### Bootcamp Java Beginners - iFood / DIO



**Parte do curso Java Básico - Programação Orienta a Objetos**

---

### Apresentação Desafio de Projeto


        Desafio - Abstrair um Bootcamp
        ------------------------------

    1   Objetivo do Desafio
    2   Pré-requisitos
    3   Passo-a-passo
    4   Programação Orientada a Objetos (POO)
    5   Conceitos fundamentais POO
    6   Linguagens de programação
    7   Paradigma da linguagem de programação

-----

### 1.   Objetivo do desafio


    - aprender na prática
        - principais pilares da POO
            - conceitos mais importantes
                - abstração
                - encapsulamento
                - herança
                - polimorfismo
        - com exemplos desenvolvidos em Java

    - a partir do exemplo "Bootcamp"
    - desenvolver um programa em Java
        - abstrair o domínio Bootcamp
            - criação de objetos / classes

    - trabalhar e conhecer
        - pilares da POO
            - servem para outras linguagen orientada objetos
                - reservadas as particularidades das linguagens


----

### 2.   Pré-requisitos


    - Conhecer sintaxe Java
    - Java JDK 11 instalado
    - IDE para desenvolvimento Java (IntelliJ)
    - Git
    - GitHub


------------------------------------------------------------------

### 3.   Passo-a-passo


    - Abstrair o domínio Bootcamp
    - Modelar Atributos e Métodos
    - Criar e relacionar Classes
        - bootcamp
        - cursos
        - mentorias
        - devs
    - Modelar Classes
        - criar atributos / métodos
            - das classes
                - curso
                - mentoria
                - devs
    - ferramentas POO
        - deixar código mais legível / fácil manutenção
            - abstração
            - encapsulamento
            - herança
            - polimorfismo


----

### 4.   Programação Orientada a Objetos (POO)


**- Paradigma POO**


        - Paradigma
            - modelo
            - exemplo a ser seguido

        - Programação
            - desenvolvimento de uma aplicação

        - Orientada
            - aquiilo que é regido
            - segue uma orientação

        - Objeto
            - um molde que representa uma determinada classe


    ------------------------------------------------------

        - Paradigma de Programação Orientada a Objetos
            - modelo de desenvlvimento de aplicações
            - construído acerca de conceitos de objetos

    ------------------------------------------------------


        - mundo de objetos que interagem
            - modelo de análise / projeto / programação
            - com base na aproximação entre mundo real / virtual
                - criação e interação entre
                    - classes
                    - atributos
                    - métodos
                    - objetos
                    - outros


        - 4 pilares da POO
            - abstração
            - encapsulamento
            - herança
            - polimorfismo


    - Abstração
    -----------
        - habilidade
            - concentrar nos aspectos essenciais de um domínio
            - ignorar características menos importantes / acidentais
        - objetos
            - são abstrações de entidades existentes no domínio em questão


    - Encapsulamento
    ----------------
        - esconder a implementação dos objetos
            - favorece aspectos do sistema
                - manutenção
                - evolução

    - Herança
    ---------
        - classe base (classe pai)
            - comportamentos definifos
        - classe derivada (classe filha)
            - recebe comportamentos da classe base
                - reutilizar (herança)


    - Polimorfismo
    --------------
        - capacidade
            - referenciar objeto de várias formas
                - objeto não fica se transformando
        - objeto
            - nasce e morre com mesmo tipo
            - altera maneira como é tratado

        - objetos criados de classes específicas
        - tratados como objetos de classe genérica


------

### 5.   Conceitos fundamentais POO



    - Domínio
    ---------

        - camada do código
        - onde ficam as classes
        - que descrevem o problema

        - quando quer falar sobre o problema
            - classes subdvidem problema
            - levam problema para mundo virtual

        - Domínio da aplicação
            - camada de negócio
            - objeto de negócio
        - onde estão localizadas as classes do domínio do problema
            - classes correspndentes a objetos
            - fazem parte da descrição do problema


        - Domínio será o Bootcamp
            - descrever suas características principais (atributos)

            - tipos de atributos
            --------------------

                - classes que já existem no Java (JDK)
                --------------------------------------

                    - nome (String)
                    - descrição (String)
                    - data inicial (local date)
                    - data final (local date)


                - classes que precisam ser craidas
                ----------------------------------

                    - não são apenas String
                    - possuem diversas características

                    - devs / participantes
                        - atributos
                            - nome
                            - mentorias
                            - cursos / atividades
                        - métodos (outras ações possíveis)
                            - participar de Bootcamp
                            - progredir no Bootcamp
                            - ganhar XP
                            - calcular XP
                            - exibir cursos

                    - cursos/atividades
                        - atributos
                            - título
                            - descrição
                            - carga horária
                        - métodos
                            - calcular XP

                    - mentorias
                        - atributos
                            - título
                            - descrição
                            - datas
                        - métodos
                            - calcular XP


     --------------------------------------------------------------
     Bootcamp
     --------
        |
        |---> Nome         --|
        |                    |---> String      --|
        |---> Descrição    --|                   |     Classes que
        |                                        |---> já existem
        |---> Data inicial --|                   |     no Java
        |                    |---> LocalDate   --|
        |---> Data Final   --|
        |
        |
        |----> Devs        --|
        |                    |
        |----> Mentorias     |     Não são --|     Possuem
        |                    |---> apenas    |---> diversas
        |----> Atividades    |     Strings --|     características
        |                    |
        |----> Cursos      --|
    --------------------------------------------------------------


                ----------------------------------
                    Dica de curso:
                        Dominando IDEs Java
                            - Instalação
                            - Primeiros passos
                ----------------------------------



    - Classe
    --------
        - elemento do código
        - representa objetos do mundo real
        - possuem declarações
            - atributos
                - características do objeto
            - métodos
                - comportamentos do objeto

    - Atributo
    ----------
        - estrutura de dados
        - representa a classe
            - características do objeto
        - também conhecido como
            - variável de classe
        - 2 tipos básicos
            - atributo de instância
            - atributo de classe

    - Variável
    ----------
        - armazena em regioões da memória
            - dados
            - informações de programa
        - por tempo determinado

    - Método
    --------
        - comportamentos do objeto
        - representam (dos objetos e classes)
            - estados
            - ações

    - Objeto
    --------
        - molde de determinada classe
        - existe a partir de uma instância da classe
        - classe define comportamento do objeto
            - usando
                - atributos (propriedades)
                - métodos (ações)
        - pode ser
            - variável
            - função
            - estrutura de dados
        - objeto em ciência da computação
            - é referência a um local da memória que possui um valor

    - Instância
    -----------
        - instância de uma classe
            - é um novo objeto criado dessa classe
                - ex.: operador "new"
        - instanciar classe
            - criar um novo objeto do mesmo tipo dessa classe
        - classe só pode ser utilizada
            - após ser instanciada


----

### 6.   Linguagens de programação


    - linguagem formal
        - instruções em série
            - conjunto de ordens
                - ações consecutivas
                - dados
                - algoritmos
        - para criar programas
            - controlar comportamento da máquina
                - físico
                - lógico


    - Classificaçao das linguagens de programação
    ---------------------------------------------

        - nível de abstração
        --------------------

            - baixo nível
                - Assembly

            - médio nível
                - C
                - C++
                - D
                - Objective C

            - alto nível
                - Java
                - C#
                - PHP
                - Javascript

            - altíssimo nível
                - Python
                - Ruby
                - Elixir

        - paradigma de programação
        --------------------------

            - programação estruturada
                - C
                - Pascal
                - Ada

            - programação orientada a objetos
                - Java
                - C#
                - C++
                - Objective C
                - D

            - programação funcional
                - Lisp
                - Scheme
                - Erlang
                - Elixir

        - arquitetura da aplicação
        --------------------------

            - desktop
                - C
                - C++
                - Pascal
                - D
                - GO

            - web
                - PHP
                - Ruby
                - Javascript
                - Java

        - tipos de execução
        -------------------

            - compiladas
                - C
                - C++
                - Pascal
                - D
                - GO

            - interpretadas
                - Python
                - Ruby
                - PHP
                - Javascript

            - hibridas
                - Java
                - Erlang
                - Elixir

-----

### 7.   Paradigma da linguagem de programação


    - Conjunto de características
    - categoriza grupos de linguagens
    - oferece técnicas apropriadas para aplicação específica


    - Principais Paradigmas e seus subparadigmas
    --------------------------------------------

        1 Paradigma Imperativo
        ----------------------

            - programa descreve processamento
                - solucionar problema
            - caracterizado por
                - execução sequencial de instruções
                    - por meio de
                        - variáveis
                            - representam posições de memória
                        - instruções de atribuição
                            - alteram valores das variáveis


            Principais Subparadigmas Imperativos
            ------------------------------------

                Paradigma Estruturado
                ---------------------
                    - ALGOL 58
                    - ALGOL 60

                Paradigma Concorrente
                ---------------------
                    - Java
                    - Ada

                Paradigma Orientado a Objetos
                -----------------------------
                    - Java
                    - Smalltalk


        2 Paradigma Declarativo
        -----------------------

            - resultados são descritos
            - não estabelece passos para chegar no resultado


            Principais Subparadigmas Declarativos
            -------------------------------------

                Paradigma Funcional
                -------------------
                    - Lisp
                    - Haskel

                Paradigma Lógico
                ----------------
                    - Prolog

-----
