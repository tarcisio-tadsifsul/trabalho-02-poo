# Trabalho 02 de POO - Etapa 1

Ideia de projeto: Catálogo de Receitas

## Arquitetura do Sistema (6 Classes + 1 Interface)

1. `Filtravel` (Interface): Define métodos de busca, como boolean contemIngrediente(String nome).
2. `Receita` (Classe Abstrata/Base): Contém o nome da receita, tempo de preparo e o criador.
3. `ReceitaDoce` (Herança): Herda de Receita e adiciona atributos específicos (ex: nível de açúcar ou necessidade de geladeira).
4. `ReceitaSalgada` (Herança): Herda de Receita e adiciona atributos específicos (ex: tipo de ponto de sal ou se vai ao forno).
5. `Ingrediente` (Classe Relacionada): Representa um ingrediente (nome, quantidade, unidade de medida). Cada receita terá uma lista deles.
6. `Chef` (Classe Relacionada): Representa o autor da receita (nome, especialidade, anos de experiência).
7. `GerenciadorCatalogo` (Classe Principal/Controle): Contém o menu interativo e gerencia os dados na memória.

## Atendimento aos Requisitos Específicos

- Mínimo de 6 classes e herança: Atendido com Receita, ReceitaDoce, ReceitaSalgada, Ingrediente, Chef e GerenciadorCatalogo.
- Interface: Atendido com Filtravel implementada nas receitas.
- Ao menos 3 objetos do tipo lista (ArrayList):
    1. Vetor[Receita] catalogo: Lista global de receitas cadastradas.
    2. Vetor[Chef] chefs: Lista de autores cadastrados no sistema.
    3. Vetor[Ingrediente] ingredientes: Dentro de cada objeto receita, para listar o que ela leva.
- Ao menos um CRUD: Aplicado sobre a lista global de Receitas (Criar novas receitas, Ler/Listar todas ou buscar por tipo, Atualizar tempo ou ingredientes, Deletar receita).
- Menu de Gerenciamento (Modo Console): Um menu iterativo para o usuário navegar pelas opções de cadastro e visualização.




Dicas:
- _do...while: recomendado para menus para mostrar menu e depois testar._