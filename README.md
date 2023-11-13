# Sobre o projeto

Challenge Java é uma aplicação back-end construída durante em prol da FIAP.
A aplicação consiste em criar uma API para melhorar a assertividade do modal de atendimento de veículos.

## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

# Como executar o projeto

## Back end
Pré-requisitos: Java 11
Eclipse JDK

```bash
# clonar repositório
git clone https://github.com/gustavorenedev/challengeJava

# Abra o eclipse
# vá em file do eclipse
# opção Import
# Maven
# Existing Maven Projects
# Selecione o projeto
# Finish
# Execute o projeto
```

## Rotas API
Em seu Postman ou Insomnia coloque http://localhost:3000/{insira o Endpoint}

| Endpoint                        | Método HTTP | Descrição                                                    |
|---------------------------------|-------------|--------------------------------------------------------------|
| `/carga`                        | `GET`       | Obtém todas as cargas no sistema.                            |
| `/carga`                        | `POST`      | Cria uma nova carga.                                         |
| `/cliente`                      | `GET`       | Obtém todos os clientes no sistema.                          |
| `/cliente`                      | `POST`      | Cria um novo cliente.                                        |
| `/funcionario`                  | `GET`       | Obtém todos os funcionários no sistema.                      |
| `/funcionario`                  | `POST`      | Cria um novo funcionário.                                    |
| `/localizacao`                  | `GET`       | Obtém todas as localizações de clientes no sistema.          |
| `/localizacao`                  | `POST`      | Cria uma nova localização de cliente.                        |
| `/solicitacao`                  | `GET`       | Obtém todas as solicitações de chamado no sistema.           |
| `/solicitacao`                  | `POST`      | Cria uma nova solicitação de chamado.                        |
| `/veiculo`                      | `GET`       | Obtém todos os veículos no sistema.                          |
| `/veiculo`                      | `POST`      | Cria um novo veículo.                                        |

E conforme os atributos da VO você coloca em ordem no JSON
