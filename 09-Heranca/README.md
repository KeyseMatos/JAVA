# 09 - Herança

A herança é um dos conceitos da Programação Orientada a Objetos (POO). Ela permite que uma classe aproveite atributos e métodos de outra classe, facilitando a reutilização de código e a organização do programa.

## 📚 Resumo

**Classe pai (superclasse):** é a classe que possui características e comportamentos que podem ser compartilhados com outras classes.

**Classe filha (subclasse):** é a classe que herda os atributos e métodos da classe pai e também pode possuir suas próprias características e comportamentos.

Em Java, a herança é utilizada através da palavra-chave `extends`.

Exemplo:

```java
class Animal {
    String nome;

    void emitirSom() {
        System.out.println("O animal emitiu um som.");
    }
}

class Cachorro extends Animal {
}
