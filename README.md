# Java Spring Boot - Intensivo de Aprendizado 

Aplicação back-end para organizar jogos em coleções, sendo cada uma delas com um gênero diferente, desenvolvida durante o intensivo em **Java Spring Boot** ministrado pelo Prof. Nélio Alves. O sistema utiliza o framework Spring Boot para o desenvolvimento de APIs REST, juntamente com PostgreSQL para armazenamento de dados e Docker Compose para facilitar a criação e configuração do ambiente local de desenvolvimento.

## Aprendizados Principais  

### **Conceitos Fundamentais**  
- Arquitetura de sistemas web: cliente/servidor.  
- Protocolo HTTP e estrutura de comunicação com JSON.  

### **Desenvolvimento de APIs REST**  
- Implementação do padrão REST com **Spring Boot**.  
- Estruturação de projetos em camadas:  
  - **Controller**  
  - **Service**  
  - **Repository**  

### **Persistência e ORM com Spring Data JPA**  
- **Mapeamento Objeto-Relacional (ORM)**.  
- Consultas SQL personalizadas e uso de projections.  
- Gerenciamento de dados iniciais com **database seeding**.  

### **Modelagem de Relacionamentos**  
- Relacionamentos complexos:  
  - N-N com classes de associação.  
  - Uso de **EmbeddedId** para chaves compostas.  

### **Outros Destaques**  
- Uso do padrão **DTO** para transferência de dados.  
- Configuração de **CORS** para rotas.

## Endpoints

### Lista de Jogos

- Buscar todas as coleções de jogos
```
GET http://localhost:8080/lists
Response:

[
    {
        "id": 1,
        "name": "Aventura e RPG"
    },
    {
        "id": 2,
        "name": "Jogos de plataforma"
    }
]

```

- Buscar jogos por id da lista
```
GET http://localhost:8080/lists/{listId}/games
Response:

[
    {
        "id": 6,
        "title": "Super Mario World",
        "year": 1990,
        "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/6.png",
        "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!"
    },
    {
        "id": 7,
        "title": "Hollow Knight",
        "year": 2017,
        "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/7.png",
        "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!"
    }
]
```

- Alterar posição de um jogo dentro da lista
```
POST http://localhost:8080/lists/{listId}/replacement
JSON Raw Body:

{
    "sourceIndex" : 0,
    "destinationIndex" : 1
}
```

### Lista de Jogos

- Buscar jogo por id
```
GET http://localhost:8080/games/{gameId}
Response:

{
    "id": 10,
    "title": "Sonic CD",
    "year": 1993,
    "genre": "Platform",
    "platforms": "Sega CD, PC",
    "score": 4.0,
    "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/10.png",
    "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!",
    "longDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa."
}
```

- Buscar todos os jogos
```
GET http://localhost:8080/games
Response:

[
    {
        "id": 1,
        "title": "Mass Effect Trilogy",
        "year": 2012,
        "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png",
        "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!"
    },
    {
        "id": 2,
        "title": "Red Dead Redemption 2",
        "year": 2018,
        "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/2.png",
        "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!"
    },
    {
        "id": 3,
        "title": "The Witcher 3: Wild Hunt",
        "year": 2014,
        "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/3.png",
        "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!"
    }
]
```

## Modelo de Domínio

![Imagem do modelo de domínio](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)

## Tecnologias Utilizadas  
- **Java 17+**
- **Maven**
- **Docker**
- **Spring Boot**  
- **Spring Data JPA / Hibernate**  
- **H2 Database**
- **Postgres Database**  
- **Postman** (para testes de API)
