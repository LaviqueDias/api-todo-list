<h1 align="center">
  TODO List
</h1>


API para gerenciar tarefas (CRUD) que faz parte [desse desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify) para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.


## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Mysql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [postman](https://www.postman.com/):

- Criar Tarefa 
```
URL: http://localhost:8080/todos
Método HTTP: POST

Body:

  {
    "nome_todo": "Todo 1",
    "descricao_todo" : "Desc Todo 1",
    "realizado_todo": false,
    "prioridade_todo": 1
  }

Resposta:

[
   {
    "id_todo" : 1,
    "nome_todo": "Todo 1",
    "descricao_todo" : "Desc Todo 1",
    "realizado_todo": false,
    "prioridade_todo": 1
  }
]
```

- Listar Tarefas
```
URL: http://localhost:8080/todos
Método HTTP: GET

Resposta:

[
   {
    "id_todo" : 1,
    "nome_todo": "Todo 1",
    "descricao_todo" : "Desc Todo 1",
    "realizado_todo": false,
    "prioridade_todo": 1
  }
]
```

- Atualizar Tarefa
```
URL: http://localhost:8080/todos
Método HTTP: PUT

Body:

  {
    "id_todo": 1,
    "nome_todo": "Todo 1 Up",
    "descricao_todo": "Desc Todo 1 Up",
    "realizado_todo": false
    "prioridade_todo": 2,
  }

Resposta:

[
  {
    "id_todo": 1,
    "nome_todo": "Todo 1 Up",
    "descricao_todo": "Desc Todo 1 Up",
    "realizado_todo": false
    "prioridade_todo": 2,
  }
]
```

- Remover Tarefa
```
URL: http://localhost:8080/todos/1
Método HTTP: DELETE

Resposta:

[ ]
```