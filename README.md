[JAVA_BADGE]:https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white
[SPRING_BADGE]: https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white


<h1 align="center" style="font-weight: bold;">API para Autenticação de Usuários 💻</h1>

![spring][SPRING_BADGE]
![java][JAVA_BADGE]


<p align="center">
  <b>Este projeto foi feito para mostrar minhas habilidades em projetos Spring Boot e APIs RESTful. Essa API é capaz de autenticar usuários de forma segura utilizando o Spring Security para validar o usuário por meio de Tokens.</b>
</p>

<h2 id="started">🚀 Quer testar?</h2>

Aqui está o passo a passo que você pode fazer para rodar a API localmente

<h3>Pré-requisitos</h3>

Esse é um dos pré-requistos que você precisa para rodar o projeto na sua máquina:

- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)  
- [Maven](https://maven.apache.org/)  
- [Git](https://git-scm.com/)
  
<h3>Cloning</h3>

Como clonar o projeto

```bash
git clone https://github.com/Victorozana/programa-spring-boot
```

<h3>Iniciando o projeto</h3>

Como você pode iniciar o meu projeto

```bash
cd programa-spring-boot
mvn spring-boot:run
``````


<h2 id="routes">📍 API Endpoints</h2>

Aqui você pode ver alguns exemplos de rotas da API. 
​
| route               | description                                          
|----------------------|-----------------------------------------------------
| <kbd>GET /localhost:8080/auth/register</kbd>     | Registra usuário
| <kbd>GET /localhost:8080/auth/login</kbd>     | Faz login por meio de token no usuário                        
