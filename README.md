# Elionardo Silva dos Santos
**Programação Orientada a Objetos**
<br>**Turma 37 - Serratec**

---

## Descrição

Este repositório contém os exercícios de Programação Orientada a Objetos do curso **Programador Fullstack do Serratec** utilizando a linguagem **Java**.

Abaixo segue a descrição de cada exercício:


### 1 - Lógica e Estruturas de Controle

**Exercício:** Simulador de Caixa Eletrônico *(Apenas Lógica no main)*.

**Detalhes:** Criar um menu com do-while e switch *(1-Ver Saldo, 2-Depositar, 3-Sacar, 0-Sair)*.

**Regra de Negócio:**
- O caixa eletrônico tem um limite máximo de 3 saques diários. Se o usuário tentar um 4o
saque, o sistema deve bloquear a operação informando "Limite de saques diários
atingido".
- O valor máximo por saque é de R$ 1.000,00, por questões de segurança.


### 2 - Classes e Objetos

**Exercício:** Criando a classe `ContaBancaria`.

**Detalhes:** Migrar a lógica do exercício anterior para uma estrutura Orientada a Objetos. Criar a **classe** com os atributos `numero`, `titular` e `saldo`, e os **métodos** `depositar()` e `sacar()`. Instanciar no main.

**Regra de Negócio:**
- Todas as regras do exercício anterior devem ser seguidas também
- Toda conta nova aberta ganha um bônus de boas-vindas de R$ 50,00 (isso deve ser
garantido no momento da criação do objeto/construtor).
