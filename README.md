# Projeto E-Diaristas

Projeto desenvolvido durante a imersão Multi Stack da [TreinaWeb](https://www.treinaweb.com.br/) utilizando Java e Spring Boot.

## Dependências do Projeto

- Spring Boot
- Spring Web MVC
- Thymeleaf
- Spring Data JPA
- Bean Validation

## Dependências de Desenvolvimentos

- Spring Boot Devtools
- Lombok

## Requisitos

- Java 17
- Maven 3.8

## Como testar esse projeto na minha máquina?

Clone este repositório e entre na pasta do projeto

```sh
git clone https://github.com/nyodinariai/projeto-ediaristas.git
cd projeto-ediaristas
```

Atualize as configurações de acesso ao banco de dados no arquivo [application.properties](src/main/resources/application.properties).

```properties
spring.datasource.url=jdbc:mysql://host:porta/banco_de_dados
spring.datasource.username=root
spring.datasource.password=
```

Execute através do Maven.

```sh
mvn spring-boot:run
```

Acesse a aplicação em [http://localhost:8080/admin/servicos](http://localhost:8080/admin/servicos)