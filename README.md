# Jogo de Batalha com EasyMock

Este projeto foi desenvolvido como parte da **Tarefa 04 - Testes com Mocking em Jogos** (08/09/2025).  
O objetivo é praticar o uso do **EasyMock** para simular interações entre classes em um sistema de combate de RPG, isolando dependências e testando diferentes cenários.

---

## Objetivos de Aprendizado
- Criar mocks de dependências usando `EasyMock.createMock()`
- Definir comportamentos simulados com `expect().andReturn()`
- Verificar interações com `verify()`
- Simular falhas e exceções em cenários de combate
- Compreender como o mocking ajuda a isolar dependências em testes unitários

---

## Tecnologias Utilizadas
- Java 17+
- JUnit 5 (Jupiter 5.9.3)
- EasyMock 5.2.0
- Maven

---

## Estrutura do Projeto

src/
├── main/
│   └── java/
│      ├── Atacante.java
│      ├── Defensor.java
│      ├── Magia.java
│      └── Combate.java
│
└── test/
└── java/
└── CombateTest.java

---

## Casos de Teste Implementados

### Teste 1: Ataque Simples
- Atacante causa 20 de dano
- Defensor reduz para 10
- Verifica retorno final do `realizarAtaque()`

### Teste 2: Magia de Fogo
- Simula lançamento de magia de fogo
- Retorna `"Explosão de fogo!"`
- Verifica chamada de `lancarMagia()`

### Teste 3: Defesa Inválida
- Simula defesa que lança exceção
- Usa `andThrow()`
- Verifica se a exceção é lançada corretamente

### Teste 4: Vários Ataques Seguidos
- Atacante retorna diferentes valores de dano em chamadas sucessivas
- Defensor reduz de formas distintas
- Verifica se os resultados variam conforme os ataques

---

## Desafio Avançado
Foi proposto um sistema de combate expandido, com:
- Interfaces adicionais (`Personagem`, `Arma`, `Habilidade`, `Equipamento`)
- Testes para cenários como:
  - Ataque físico com arma e habilidade
  - Ataque mágico sem arma
  - Defesa que reduz dano parcial
  - Uso de habilidade sem energia/mana
- Verificações com `verify()`:
  - Quantidade de chamadas (`times()`)
  - Ausência de chamadas (`never()`)

---

## Como Executar os Testes
1. Clone o repositório:
   ```bash
   git clone https://github.com/alanaala/Jogo-de-batalha-EASYMOCK.git
   cd Jogo-de-batalha-EASYMOCK


2. Compile e execute os testes:

   ```bash
   mvn test
   ```

---

## Exemplo de Saída dos Testes

Ao rodar `mvn test`, a saída esperada é semelhante a:

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running CombateTest
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.123 s - in CombateTest

Results:

Tests run: 4, Failures: 0, Errors: 0, Skipped: 0

BUILD SUCCESS
Total time:  2.345 s
Finished at: 2025-09-08T21:15:33Z
```

---

## Dicas e Boas Práticas

* Sempre use `EasyMock.replay()` antes de executar o teste
* Finalize com `EasyMock.verify()` para confirmar interações
* Prefira interfaces simples para facilitar o mocking
* Crie cenários de sucesso e falha para entender melhor os benefícios do mocking

---

## Autora

Projeto desenvolvido por **Alana** como exercício prático de **Testes com EasyMock**.

```

Você quer que eu também adicione no README uma **seção de comandos úteis do Maven** (como `mvn clean install`, `mvn package`) para facilitar a execução do projeto além dos testes?
```
