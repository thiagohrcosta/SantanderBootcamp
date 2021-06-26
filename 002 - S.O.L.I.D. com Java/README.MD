# O que é SOLID?

SOLID é um acrônimo dos princípios da programação orientada a objetos descritas por Robert C. Martin e auxiliam o programador a escrever códigos mais limpos, facilitando a refatoração e estimulando o reaproveitamento do código.

**S** - SINGLE RESPONSIBILITY PRINCIPLE
**O** - OPEN CLOSED PRINCIPLE
**L** - LISKOV SUBSTITUTION PRINCIPLE
**I** - INTERFACE SEGREGATION PRINCIPLE
**D** - DEPENDENCY INVERSION PRINCIPLE

## Single Responsibility Principle

A classe deve possuir uma única responsabilidade dentro do software.

## Open Closed Principle

Objetos devem estar abertos para extensão, mas fechados para modificação. Quando novos comportamentos precisam ser adicionados no software, devemos estender e não alterar o código fonte original.

## Liskov Substitution Principle
Classes derivadas devem ser substituíveis por suas classes base. "*Se para cada objeto o1 do tipo S há um objeto o2 do tipo T de forma que, para todos os programas P, o comportamento de P é inalterado quando o 1 é substituído por o2, então S é um subtipo de T.*" (Barbara Liskov, 1987)

## Interface Segregation Principle
Uma classe não deve ser forçada a implementar interfaces e métodos que não serão utilizados. É melhor criar interfaces mais específicas ao invés de termos uma única interface genérica.

## Dependency Inversion Principle
Um módulo de alto nível não deve depender de módulos de baixo nível, ambos devem depender da abstração. Inversão de dependência não é igual a injeção de dependência.
