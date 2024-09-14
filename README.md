
# Sistema de Quiz em Java

## Sumário

-   [Introdução](#introdu%C3%A7%C3%A3o)
-   [Funcionalidades](#funcionalidades)
-   [Tecnologias Utilizadas](#tecnologias-utilizadas)
-   [Estrutura do Sistema](#estrutura-do-sistema)
-   [Fluxo do Quiz](#fluxo-do-quiz)
-   [Assuntos e Perguntas](#assuntos-e-perguntas)
-   [Cálculo do Score e Dicas](#c%C3%A1lculo-do-score-e-dicas)
-   [Execução do Sistema](#execu%C3%A7%C3%A3o-do-sistema)
-   [Considerações Finais](#considera%C3%A7%C3%B5es-finais)

## Introdução

O sistema de quiz é uma aplicação desenvolvida em Java, utilizando componentes da biblioteca Swing, como `JLabel`, `JRadioButton`, `ButtonGroup` e `JButton`. O objetivo é fornecer um quiz com quatro tópicos diferentes, cada um contendo dez questões, onde o jogador deve selecionar a resposta correta. O sistema calcula o score final e exibe dicas ao longo do jogo.

## Funcionalidades

-   Seleção de tópicos (T.I., Hardware, Software, Sistema Operacional).
-   Cada tópico possui 10 questões, cada uma com 4 alternativas.
-   Soma do score ao responder corretamente.
-   Exibição de dicas durante o jogo.
-   Entrada do nome do usuário para personalizar a experiência.
-   Exibição do score final ao término do quiz.

## Tecnologias Utilizadas

-   **Linguagem de Programação**: Java
-   **Bibliotecas**:
    -   `Swing`: para criação da interface gráfica (`JLabel`, `JRadioButton`, `ButtonGroup`, `JButton`).
-   **Ambiente de Desenvolvimento**: Qualquer IDE com suporte a Java (Eclipse, IntelliJ, NetBeans, etc.).

## Estrutura do Sistema

O sistema é composto por várias partes principais:

-   **Interface Gráfica (GUI)**: Desenvolvida utilizando Swing, com rótulos (`JLabel`), botões de rádio (`JRadioButton`), agrupados por `ButtonGroup` para a escolha de alternativas, e botões (`JButton`) para avançar nas questões e finalizar o quiz.
    
-   **Controle do Quiz**: A lógica de controle armazena as questões e as alternativas em arrays ou estruturas adequadas. O sistema rastreia as respostas corretas e atualiza o score do jogador.
    
-   **Dicas**: Durante o quiz, o sistema pode fornecer dicas em algumas questões para ajudar o jogador.
    
-   **Entrada do Nome do Usuário**: O nome do jogador é solicitado no início, permitindo uma experiência personalizada ao longo do jogo.
    

## Fluxo do Quiz

1.  **Entrada do Nome**: O jogador deve inserir seu nome para iniciar o quiz.
2.  **Seleção do Tópico**: O jogador escolhe um dos quatro tópicos disponíveis (T.I., Hardware, Software, Sistema Operacional).
3.  **Perguntas**: Para cada tópico, o jogador responderá 10 questões, cada uma com 4 alternativas.
4.  **Score e Dicas**: O sistema calcula o score baseado nas respostas corretas e pode fornecer dicas para ajudar em questões difíceis.
5.  **Resultado Final**: Após responder todas as perguntas, o jogador recebe seu score total.

## Assuntos e Perguntas

### 1. Tópico: **T.I.**

Este tópico aborda questões gerais sobre Tecnologia da Informação.

### 2. Tópico: **Hardware**

Este tópico aborda questões relacionadas a componentes físicos de um computador.

### 3. Tópico: **Software**

Aqui, o jogador encontrará perguntas relacionadas ao desenvolvimento e utilização de softwares.

### 4. Tópico: **Sistema Operacional**

As perguntas deste tópico focam em sistemas operacionais e seus conceitos.

Cada tópico contém 10 perguntas de múltipla escolha com 4 alternativas. O jogador deve selecionar a resposta correta antes de avançar para a próxima questão.

## Cálculo do Score e Dicas

-   **Score**: O sistema soma 10 ponto para cada resposta correta.
-   **Dicas**: Durante o quiz, se o jogador encontrar dificuldades, o sistema pode exibir dicas, fornecendo uma breve explicação para ajudá-lo a escolher a resposta correta.

## Execução do Sistema

1.  **Inicialização**: O sistema inicia com uma tela solicitando o nome do usuário.
2.  **Escolha de Tópico**: O usuário seleciona o tópico desejado.
3.  **Quiz**: As questões são exibidas uma a uma, com botões de rádio para seleção de respostas.
4.  **Finalização**: Ao término do quiz, o sistema exibe o score final e agradece a participação do jogador.

## Considerações Finais

Este sistema de quiz é uma excelente ferramenta para testar conhecimentos em várias áreas de T.I., hardware, software e sistemas operacionais. A interface amigável e as dicas tornam a experiência interativa e educativa.

----------

### Exemplo de Tela

-   **Tela de Entrada do Nome**
-   **Tela de Perguntas**
-   **Tela de Resultados**

### Melhorias Futuras

-   Implementar níveis de dificuldade.
-   Oferecer um banco de perguntas mais dinâmico, permitindo a inclusão de novas questões.
