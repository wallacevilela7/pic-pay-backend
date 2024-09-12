# PicPay Simplified - Backend Challenge

## Descrição do Projeto

Este projeto é uma solução para o desafio backend do PicPay. O objetivo é construir uma API RESTful que permita a transferência de dinheiro entre usuários, seguindo as regras de negócio propostas. A aplicação foi desenvolvida utilizando **Java** com o **Spring Boot** e um banco de dados em memória **H2** para simplificar o armazenamento.

## Tecnologias Utilizadas

- **Java 22**
- **Spring Boot 3.3**
- **H2 Database**
- **Lombok**
- **Maven** para gerenciamento de dependências

## Funcionalidades Implementadas

- **Cadastro de Usuários**: Cadastro de usuários comuns e lojistas, com CPF e e-mail únicos.
- **Transferências**: Transferências de dinheiro entre usuários, com validação de saldo.
- **Consultas externas**: Consulta a um serviço de autorização externo antes de realizar a transferência.
- **Notificações**: Envio de notificações simuladas (mock) ao receber uma transferência.
- **Transações**: Transações financeiras seguras e reversíveis em caso de falhas.

## Requisitos do Desafio

- Usuários comuns podem enviar e receber dinheiro.
- Lojistas apenas podem receber dinheiro.
- Antes de qualquer transferência, deve ser validado o saldo disponível e consultado um serviço externo.
- As transações são tratadas de forma atômica, garantindo a consistência dos dados.
- Notificações são enviadas para os usuários após uma transferência bem-sucedida.

## Como Executar o Projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd seu-repositorio
   ```
3. Execute o projeto com o Maven:
   ```bash
   mvn spring-boot:run
   ```
4. Acesse o banco de dados H2:
    - URL: `http://localhost:8080/h2-console`
    - JDBC URL: `jdbc:h2:mem:testdb`
    - Username: `sa`
    - Password: (deixe em branco)


### Cadastro de Usuário

**POST /users**

Exemplo de payload:
```json
{
  "name": "João da Silva",
  "cpf": "12345678900",
  "email": "joao@exemplo.com",
  "password": "senha123",
  "userType": "COMMON"
}
```

### Transferência

**POST /transfer**

Exemplo de payload:
```json
{
  "value": 100.0,
  "payer": 1,
  "payee": 2
}
```

## Contato

- **Nome**: Wallace Vilela
- **Meu LinkedIn** ➡️: [Clique aqui ](https://www.linkedin.com/in/wallace-vilela-538728247/)


### Happy Coding 🚀✨