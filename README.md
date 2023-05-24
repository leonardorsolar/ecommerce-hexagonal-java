# Projeto: Ecommerce

Criação do projeto Produtc API com java, spring boot e PostgresSQl

1. Instalando o banco de dados postgres
2. Criando o projeto no github
3. Criando o projeto com Spring Initializr

# GitHub

New repository
Repository name: /ecommerce-hexagonal-java
create repositoy

    echo "# ecommerce-hexagonal-java" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/leonardorsolar/ecommerce-hexagonal-java.git
    git push -u origin main

# Desenvolvimento da aplicação

# Criando o projeto com Spring Initializr

Criando projeto java maven:
criar nosso projeto baseado no Spring Boot a partir do template do spring Initializr.

Baixe o código do Spring-Boot configurado Acesse https://start.spring.io/
Maven
Spring Boot estável
group> br.com.aes
Artifact (nome do projeto): ecommerce-hexagonal-java
Packaging (linguagem java): jar versão: 17 (LTS)
Adicionar dependências:
Spring Web WEB Build web ( rest rota get...)
Spring Boot DevTools
Spring Data JPA SQL (banco de dados)
PostgreSQL Driver SQL (banco de dados na nuven) A JDBC and R2DBC driver that allows

cliquem em Generate Project

![diagrama](image/spring.png)

## arquivo de incialização:

abra a pasta do projeto no vscode para baixar as dependências

vá até o arquivo: src/main/java/br/com/aes/simpledb/SimpleDbApplication.java

Com o projeto criado, vá no vscode e abra a pasta que acabamos de criar. O vscode irá tentar inicializar as extensões, e atualizar as dependências Maven suportar o projeto, então, aguarde até que o processo termine antes de continuar:

atualização no menu inferior do vscode

as dependencias fica no arquivo pow.xml
opicional: pode-se comnetar as dependenciasa seguir, pois não uasremos agora e toda a hora que o projeto iniciar vai configurra o acesso ao banco de dados.
Spring Data JPA SQL (banco de dados)
PostgreSQL Driver SQL

cometar as dependencias que não utilizaremos agora:jpa e postgresql
Caso não comnete dará um erro posi não configuramos ainda o acesso ao banco de dados

## Estruturas da pastas

A estrutura de pastas/grupos do projeto assume a seguinte forma:

    ├── aplication
    ├── domain
    └── infrastructure

## Arquivo de configurações: application.properties

src/main/resources/application.properties
opicional: configurações para mudar o local host:

Arquivo resources:

application.properties:
spring.profiles.active = dev

application-dev.properties:
server.port = 9090

## BANCO DE DADOS: configurando o postgres na aplicação

Realizar a configuração para conexão

Configuraçẽos do banco de dados de teste: application-test.properties
Configurando o MySQL em projetos Spring Boot

Após efetuar o download das dependências, vamos configurar as propriedades do PstegresSql e do JPA no projeto.

// Criar a conexão com banco de dados PstegresSql host: "localhost", user: "root", password: "root", database: "db-ecommerce-java",
application.properties :

Para isso edite o arquivo de configuração application.properties e adicione o seguinte conteúdo:

    spring.datasource.url = jdbc:postgresql://localhost:5432/db-ecommerce-java
    spring.datasource.username = root
    spring.datasource.password = root

    spring.jpa.hibernate.ddl-auto = update
    spring.jpa.sql-show = true
    spring.jpa.database-platform = org.hibernate.dialect.PostgreSQLDialect

## Compilação

rodar o projeto para teste

run http://localhost:8080
