# Trabalho 02 de POO - Etapa 1

Ideia de projeto: Gerenciador de Software, tipo Steam da Valve.
No programa é possível baixar software, instalar, desinstalar, ver quais estão baixados.

A estratégia é pensar no sistema como um conjunto de entidades do mundo real que interagem entre si.

0. Requisitos do Trabalho:

- 6 Classes relacionadas;
- Aplicar Herança e Interface;
- Mínimo 3 objetos do tipo Vetores
- Minimo 01 CRUD (relacionado a um dos Vetores)
- Menu Gerenciamento (modo texto no console)


========================
========================

1. Ideias de Classes para o seu Sistema

Diagrama UML pode contar com as seguintes classes organizadas por responsabilidades:

## Núcleo do Software e Catálogo

### Software (Classe Abstrata): 

- Representa o conceito genérico de um programa.
- Contém atributos como:
    -`id`
    -`nome`
    -`versao`
    -`tamanho_mb`
    -`desenvolvedor`

### Jogo (Subclasse de Software):

- Subclasse de `Software`. 
- Contem atributos como:
    - `genero`
    - `requisitos_minimos`

### Aplicativo (Subclasse de Software):

- Outra especialização (ex: ferramentas de produtividade).
- Adiciona atributos como `categoria`.

### Catalogo (vetor):

- Gerencia a lista de todos os softwares disponíveis no "servidor" para download.
- Possui métodos como buscarSoftware(), adicionarAoCatalogo() e removerDoCatalogo().

========================

## Gestão de Usuários e Biblioteca

### Usuario:

- Classe que representa o cliente do sistema.
- Contém atributos como:
    - `id`
    - `nome`
    - `email`
    - `senha`
    - associação com a sua própria Biblioteca.

### Biblioteca (vetor):

A classe que conecta o `Usuario` aos softwares que ele possui.
Ela guarda uma lista (vetor) de objetos do tipo `SoftwareAdquirido` ou `SoftwareInstalado`.

========================

## Processos e Execução (Ações do Sistema)

### GerenciadorDownloads:

- Responsável pela lógica de baixar os programas.
- Métodos:
    - `iniciarDownload(Software s)`
    - `pausarDownload()`
    - `cancelarDownload()`

- Contém um atributo `status` (Baixando, Pausado, Concluído).

### GerenciadorInstalacao:

- Controla o ciclo de vida do software na máquina do usuário.
- Métodos:
    - `instalar(Software s)`
    - `desinstalar(Software s)`
    - `verificarIntegridade()`

- HistoricoAtividades / Launcher: Registra o tempo de uso de cada software (ex: "Você jogou/utilizou por 3 horas de Jogo/Aplicativo ABC").

========================
========================

2. Roteiro de engenharia de software:

# 1. Definir os Requisitos Básicos (Escopo)

Antes de escrever código, escreva em tópicos simples o que o sistema deve fazer na primeira entrega:

- O usuário pode se cadastrar e fazer login.
- O usuário pode visualizar uma lista de softwares disponíveis no catálogo.
- O usuário pode "adquirir" um software (adicionar à sua biblioteca).
- O usuário pode clicar em "Instalar" (mudar o status para instalado).
- O usuário pode ver a lista apenas dos softwares que ele já tem instalados.
- O usuário pode enviar um software para o catálogo

# 2. Mapear os Relacionamentos no UML

Pense em como as classes conversam entre si usando os conceitos de POO:

- **Composição**: Um Usuario tem uma Biblioteca. Se o usuário for deletado, a biblioteca dele deixa de existir.
- **Agregação**: A Biblioteca tem vários Softwares. Se a biblioteca for apagada, os softwares ainda existem no catálogo geral do sistema.
- **Herança**: Jogo é um Software. Ele aproveita tudo da classe mãe e adiciona regras específicas.

# 3. Criar um Protótipo de Interface (Texto)

- Desenvolver interface usando o terminal (modo texto) 
- Planeje o menu principal:

1. Cadastrar Novo Usuario
    (Novo Usuario)
    1. Cadastrar
    0. Voltar

2. Fazer Login
    (Usuario Logado)
    1. Ver Catálogo de Softwares
    2. Minha Biblioteca
    3. Gerenciar Downloads
    4. Voltar

0. Sair

(Novo Usuario)
1. Cadastrar
0. Voltar

(Usuario Logado)
1. Ver Catálogo de Softwares
2. Minha Biblioteca
3. Gerenciar Downloads
4. Sair