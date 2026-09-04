### 📁 10 - Polimorfismo

```markdown
# 10 - Polimorfismo

O polimorfismo é um conceito da Programação Orientada a Objetos que permite que um mesmo método ou comportamento apresente diferentes formas de execução, dependendo do objeto que está sendo utilizado.

## 📚 Resumo

A palavra polimorfismo significa "muitas formas". Em Java, esse conceito permite trabalhar com objetos de diferentes classes através de uma referência comum.

Uma classe filha pode sobrescrever um método da classe pai e apresentar seu próprio comportamento.

Exemplo:

```java
class Animal {
    void emitirSom() {
        System.out.println("Som do animal");
    }
}

class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Au au!");
    }
}
