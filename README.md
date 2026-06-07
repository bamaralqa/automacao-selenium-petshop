# Automacao Selenium PetShop

Projeto de automação de testes desenvolvido em Java utilizando Selenium WebDriver, como atividade prática da capacitação de Automação com Selenium WebDriver 2026.

A aplicação utilizada para os testes é um sistema fictício de Pet Shop desenvolvido em HTML, contendo funcionalidades de login, navegação, promoção e cadastro de pets.

O projeto foi estruturado utilizando o padrão Page Object Model (POM), visando melhor organização, reutilização de código e manutenção dos testes automatizados.

---

## Tecnologias Utilizadas

- Java 17
- Selenium WebDriver 4
- JUnit 4
- Maven
- ChromeDriver
- WebDriverManager

---

## Estrutura do Projeto

```text
DesafioFinal
│
├── desafio_final_selenium_java.html
├── gato.jpg
├── pom.xml
│
└── src
    └── test
        └── java
            └── br
                └── com
                    └── minsait
                        ├── base
                        │   └── BaseTest.java
                        │
                        ├── pages
                        │   ├── LoginPage.java
                        │   ├── HomePage.java
                        │   └── CadastroPage.java
                        │
                        └── tests
                            ├── LoginTest.java
                            └── CadastroPetTest.java
```

---

## Cenários Automatizados

### Login

- Login com credenciais válidas
- Login com credenciais inválidas

### Cadastro de Pets

- Cadastro de pet com sucesso
- Tentativa de cadastro sem preencher campos obrigatórios
- Validação da inclusão do pet na tabela após cadastro

---

## Padrões Utilizados

### Page Object Model (POM)

Os elementos e ações de cada página foram centralizados em classes específicas, tornando os testes mais organizados e reutilizáveis.

Classes criadas:

- LoginPage
- HomePage
- CadastroPage

### Base Test

A classe BaseTest concentra configurações comuns para execução dos testes, como:

- Inicialização do navegador
- Maximização da janela
- Abertura da aplicação
- Encerramento do navegador após a execução

---

## Como Executar o Projeto

### Clonar o repositório

```bash
git clone URL_DO_REPOSITORIO
```

### Acessar a pasta do projeto

```bash
cd automacao-selenium-petshop
```

### Executar os testes

```bash
mvn test
```

---

## Resultado da Execução

Todos os cenários foram executados com sucesso utilizando Maven:

```text
Tests run: 5
Failures: 0
Errors: 0
Skipped: 0

BUILD SUCCESS
```

---

## Autora

Bruna Amaral

QA Analyst | Automação de Testes | Selenium WebDriver | Java

Projeto desenvolvido como prática dos conceitos de automação de testes com Selenium WebDriver e Java.
