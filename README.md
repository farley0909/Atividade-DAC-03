# Atividade-DAC-03

## Preparação para teste de leitura
### 1. O que é uma entidade?
Entidade é um objeto que existe e é distinguível dos outros objetos do banco de dados.Uma entidade contém também atributos que são propriedades que a identificam
### 2. Há diferenças entre uma entidade no modelo de classes e no mundo relacional?
No modelo de classes  a entidade representa um objeto do mundo real e que possuem uma existência independente, no mundo relacional o mesmo descrever os objetos do mundo real através de entidades
### 3. O que é persistência de dados?
É a garantia de que um dado foi salvo e que poderá ser recuperado quando necessário de forma consistente no futuro.
### 4.Cite algumas formas de persistência e diferencie-as.
Existe basicamente 3 tipos de persistência:
Dados na memória, consiste em armazenar os dados na memória principal do dispositivo e com isso ele se torna o dados volátil podendo ser perdido se o dispositivo for desligado mais o mesmo se torna mais rápido ao acesso do conteúdo. Dados em arquivos, consiste em armazenar os dados em arquivos mais o mesmo e limitado pelo SO. o acesso ao mesmo se torna mais rápido. Dados sob controle de um BD é a forma mais usada para persistir os dados pois o mesmo não tem limite para o armazenamento das informações para backup o mesmo criar arquivos de recuperação e o mesmo aceita meta dados diferente das outras formas que não aceita.

## Teste de objetivos de aprendizagem

### 1. O que é uma entidade? 
Entidade é um objeto que existe e é distinguível dos outros objetos do banco de dados.Uma entidade contém também atributos que são propriedades que a identificam.
### 2. Descreva o Mapeamento Objeto/Relacional (MOR)? O que é preciso para utilizá-lo?
O mapeamento objeto-relacional consiste em utilizar classes para representar entidades presentes no banco de dados. Nesse modelo as tabelas do banco são representadas por classes e cada registro da tabela é representado por uma instância de sua classe.
### 4. Descreva as principais técnicas de mapeamento de objetos em SGBDR.
As principais técnicas utilizadas para o mapeamento são: mapeamento de classe, mapeamento de atributo e mapeamento de relacionamento. O mapeamento de classe consiste em representar uma tabela do banco de dados por meio de uma classe ou uma classe por meio de uma tabela  no banco de dados. Já o mapeamento de atributo consiste em representar cada atributo através de tipos primitivos e referências a  outras classes. Por fim, a técnica de mapeamento por relacionamento consiste em representar os relacionamentos entre as tabelas do banco de dados por meio de herança nas linguagens orientadas a objetos.
###5.Quais as diferenças entre um produto e uma especificação?
Um produto  se refere a um software ou sistema que foi desenvolvido e está pronto para ser utilizado. Esse produto é o resultado final de um processo de desenvolvimento que envolve diversas etapas, como análise de requisitos, design, implementação, testes, entre outros.Já a especificação se refere à documentação que descreve os requisitos e características do produto a ser desenvolvido
,ou seja, enquanto o produto é o resultado final de um processo de desenvolvimento, a especificação é a documentação que define o que deve ser desenvolvido e como deve ser desenvolvido.
### 6. O que é uma entidade persistente?
Uma entidade persistente é uma classe  que representa uma tabela no banco de dados. No qual cada linha da tabela é  representada por instância da classe.
### 9. Quais os principais problemas, a nível de persistência, que foram identificados para implementar os dois exemplos anteriores?
No primeiro exemplo em que usa usa arquivos de texto como meio de armazenamento de dados, alguns dos principais problemas identificados foram:
Possibilidade de perda de dados caso ocorra algum problema durante a escrita ou leitura do arquivo.
Dificuldade em lidar com dados complexos ou estruturas de dados maiores.
Dificuldade em realizar buscas e filtragens eficientes, uma vez que é necessário ler o arquivo inteiro para encontrar os dados desejados.
Necessidade de garantir a integridade dos dados, evitando a inserção de dados duplicados ou inconsistentes.
No segundo exemplo, que utiliza um banco de dados relacional, alguns dos principais problemas identificados foram:
Necessidade de configurar um banco de dados, o que pode exigir conhecimentos específicos em banco de dados e gerenciamento de sistemas.
Complexidade em lidar com as diferentes camadas do modelo relacional, como tabelas, índices e relacionamentos.
Dependência de um servidor de banco de dados e de uma conexão de rede estável para acessar os dados, o que pode comprometer a disponibilidade do sistema.
### 10. O que é persistência transparente?
Persistência transparente é um conceito em programação que se refere à capacidade de um sistema de persistência em armazenar e recuperar dados de forma que o aplicativo não precise se preocupar com as operações de armazenamento e recuperação. Em outras palavras, a persistência transparente é a capacidade de salvar e carregar objetos de um banco de dados sem que o desenvolvedor precise escrever código específico para isso.
### 11. O que é um framework de persistência Objeto/Relacional? O que é preciso para utilizá-lo?
Um framework ORM serve para gerar tabelas e relacionamentos no banco de dados a partir de classes e suas heranças. Além disso, o framework ORM permite que você desenvolva o banco de dados sem tocar em código SQL, através de abstrações geradas pelo próprio framework. Para utilizar um framework ORM os únicos requisitos são: possuir um conhecimento básico de sintaxe e orientação a objetos na linguagem que se esteja desenvolvendo. Além de conhecimentos básicos sobre migrações e funcionalidades específicas do framework..




