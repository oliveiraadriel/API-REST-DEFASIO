# 🏆 Desafio de Programação - API REST de Transações

Este repositório contém minha implementação do desafio de programação proposto pelo Itaú Unibanco. O objetivo foi criar uma API REST em Java utilizando Spring Boot, que recebe transações e retorna estatísticas dessas transações, armazenando os dados em memória.

---

## 📈 Sobre o Projeto
Durante o desenvolvimento, implementei endpoints que permitem:

- **Receber Transações**: Um endpoint `POST /transacao` para registrar transações com um valor e uma data/hora.
- **Calcular Estatísticas**: Um endpoint `GET /estatistica` que retorna estatísticas das transações realizadas nos últimos 60 segundos.
- **Limpar Transações**: Um endpoint `DELETE /transacao` para excluir todas as transações armazenadas.

A API segue as regras de validação para garantir que todas as transações processadas sejam válidas.

---

## 🚀 Tecnologias Utilizadas

- **Java 8+**
- **Spring Boot** (Spring Web, Spring DevTools)
- **Maven** para gestão de dependências
- **Lombok** para simplificar o código
- **JUnit** para testes automatizados
- **Git & GitHub** para versionamento de código

---

## 📚 Estrutura do Projeto

```
└── src/
    └── main/
        └── java/com/desafio/
            └── controller/       # Contém os controladores REST
                └── TransacaoController.java
                └── EstatisticaController.java
            └── model/            # Modelos de dados
                └── Transacao.java
                └── Estatistica.java
            └── service/         # Regras de negócio
                └── TransacaoService.java
```

---

## ▶️ Como Executar o Projeto

1. **Clone o repositório**
```sh
 git clone https://github.com/SEU_USUARIO/desafio-transacoes.git
```

2. **Acesse a pasta do projeto**
```sh
 cd desafio-transacoes
```

3. **Execute a aplicação com Maven**
```sh
 mvn spring-boot:run
```

4. **Acesse os endpoints da API:**
- `POST http://localhost:8080/transacao` (Enviar transação)
- `GET http://localhost:8080/estatistica` (Obter estatísticas)
- `DELETE http://localhost:8080/transacao` (Limpar transações)

---

## 📏 Rotas da API

| Método | Rota            | Descrição |
|---------|----------------|--------------------------------|
| `POST`  | `/transacao`    | Registra uma nova transação |
| `DELETE` | `/transacao`    | Remove todas as transações |
| `GET`   | `/estatistica`  | Obtém estatísticas das transações |


---

## 📈 O que Aprendi
- Criação de APIs REST com **Spring Boot**.
- Utilização de **Java 8** (especialmente `OffsetDateTime`).
- Implementação de lógica de negócio sem persistência em banco de dados.
- Testes unitários e boas práticas no desenvolvimento.
- Versionamento e organização do projeto com **Git e GitHub**.

---

## 📃 Licença

Este projeto é de uso livre para estudos e melhorias. Fique à vontade para contribuir!

Se este conteúdo foi útil para você, deixe uma **estrela** no repositório! 🚀

