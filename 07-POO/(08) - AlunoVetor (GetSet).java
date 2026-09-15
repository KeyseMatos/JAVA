/*Desafio Final: Vetor de Objetos (Aluno)
Objetivo: Aplicar Orientação a Objetos criando um vetor que guarda instâncias de uma classe personalizada.
Passo 1: Crie a classe Aluno:
● Atributos: nome (String) e nota (double).
● Construtor para inicializar os atributos.
● Métodos getters/setters (ou um método para exibir os dados).
Passo 2: No método main:
● Crie um vetor de Aluno com capacidade para 5 alunos.
● Preencha o vetor solicitando o nome e a nota de cada aluno via teclado.
● Percorra o vetor para calcular e exibir a média geral da turma e quais alunos ficaram acima da média.*/

public class Aluno { 
 
    private String nome; 
    private double nota; 
 
    public Aluno(String nome, double nota) { 
        this.nome = nome; 
        this.nota = nota; 
    } 
 
    // GET nome
    public String getNome() { 
        return nome; 
    } 

    // SET nome
    public void setNome(String nome) { 
        this.nome = nome; 
    } 
 
    // GET nota
    public double getNota() { 
        return nota; 
    } 

    // SET nota
    public void setNota(double nota) { 
        this.nota = nota; 
    }
}
