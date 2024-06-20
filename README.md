# SpringMongoDB


PrjBDServDadosMob

Projeto 2/2
Verifique a Data limite de postagem

Objetivo	1
O que entregar	1
Avaliação	2
Pontuação	3
Postagem do arquivo	3
Apresentação do projeto	3
O que implementar	3
Esquema da aplicação	4
Dicas	5
Objetivo
O objetivo deste trabalho é averiguar o aprendizado em implementação de Bancos de dados distribuídos aplicados a Aplicativos Mobile.
O que entregar
O trabalho deve ser feito em grupo de no máximo 7 componentes.

Deve ser gerada uma aplicação Spring Boot usando como banco de dados o MongoDB Local (não use o Atlas).
Essa aplicação deve contar persistência constando como implementação nesse projeto um CRUD de, pelo menos, uma entidade.
A aplicação deve ser REST e fornecer a documentação via Swagger além de seguir a disponibilidade de verbos HTTP GET, POST, DELETE e PUT vinculada a cada tipo de ação.
O grupo deve excluir a pasta target e compactar a pasta do projeto gerando um ZIP. Esse ZIP será o artefato de entrega do grupo.
Lembrem-se de excluir a pasta target antes de compactar!




Esse ZIP deve ser nomeado com o seguinte critério:
PBDSM_241_P2_nome01_nome02_nome03.ZIP
(para grupos de 3 alunos)
PBDSM_241_P2_nome01_nome02_nome03_nome04.ZIP
(para grupos de 4 alunos)
Assim por diante
Onde nome01 (nome02, nome03, nome04) são os nomes dos integrantes do grupo.
Por exemplo, para os alunos Paulo Roberto, José Alcantara e Marina Ferreira o nome do arquivo será:
PBDSM_241_P2_PauloRoberto_JoseAlcantara_MarinaFerreira.ZIP
Incluam comentários na postagem com o nome dos integrantes para evitar ambiguidade.
Esse arquivo deve ser postado (via upload) no AVA do desafio, na seção correspondente, como resposta à atribuição que se refere a este Projeto.
Observe que a entrega do projeto vale 15 pontos e a apresentação vale 25 pontos conforme descrito na seção Pontuação.
Avaliação
O presente trabalho pretende avaliar a capacidade de implementação de códigos de aplicações usando Banco de Dados distribuídos voltados para aplicativos móveis no desenvolvimento de sistemas com persistência de dados em servidor.
Os códigos dos algoritmos devem ser feitos utilizando conhecimentos de Java, SpringBoot, REST e MongoDB.


Serão quesitos de averiguação para a nota do trabalho:
Correta implementação
Saída correta do algoritmo
Pontualidade na entrega
Conformidade com o solicitado no trabalho
Pontuação
A pontuação está dividida em duas etapas a saber.
Postagem do arquivo
Entrega do projeto
A entrega do projeto é a postagem via AVA até o dia 25/06 
Pontuação → 15 pontos (no máximo)
A pontuação é dada pela avaliação da correção do projeto
A postagem deve ser feita por um integrante apenas com todos os nomes indicados
Apresentação do projeto
Apresentação do projeto
A apresentação do projeto será feita em sala de aula no dia 26/06
Pontuação → 25 pontos (no máximo)
A apresentação deve ter entre no máximo 15 minutos
Cada grupo deverá apresentar o projeto utilizando recursos como computador e projetor sendo que, em livre escolha do professor no momento da apresentação, qualquer integrante do grupo pode ser questionado acerca do projeto. Espera-se assim que todos estejam preparados sob pena de desconto na nota da apresentação
O que implementar
Leia atentamente o que se pede quanto à implementação.
Deve ser gerado um projeto REST documentado com Swagger (usando Java/Springboot) com uso de conhecimentos em base de dados NoSQL, especificamente MongoDB para UMA entidade (pelo menos) para gerar uma aplicação que fornece persistência em servidor.
Esquema da aplicação
O grupo deve montar um projeto com as quatro operações essenciais (CRUD - Create, Read, Update e Delete) para cada entidade (Documento) do modelo selecionado.
Por exemplo, usando a entidade Tarefa desenvolve-se um projeto que possui a seguinte execução:
teste> db.tarefas.find()
[
 {
   _id: ObjectId('66313af2c961a44750ef634d'),
   dt: '2024-05-04',
   desc: 'niver'
 },
 {
   _id: ObjectId('66313b0bc961a44750ef634e'),
   dt: '2024-04-30',
   desc: 'aula'
 }
]


O básico que se pede são essas quatro operações.
Inclusão de uma entidade no banco de dados
Listagem das entidades
Atualização da entidade
Exclusão da entidade
Atenção: A entidade Tarefa ou Foto não pode ser utilizada como resposta do projeto pois consta nos exemplos que acompanham a especificação do mesmo.
Dicas
Para estudo e dúvidas utilize o conteúdo disponível em:
Servidor_Dados_Distribuidos_Microsservicos
