import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        Aluno[] alunos = new Aluno[5];

        // Cadastro dos alunos
        for(int i = 0; i < alunos.length; i++) {

            System.out.println("Digite o nome do " + (i + 1) + "º aluno:");
            String nome = tc.nextLine();

            System.out.println("Digite a nota do " + nome + ":");
            double nota = tc.nextDouble();
            tc.nextLine();

            alunos[i] = new Aluno(nome, nota);
        }

        // Calculando a soma
        double soma = 0;

        for(int i = 0; i < alunos.length; i++) {
            soma += alunos[i].getNota();
        }

        // Calculando a média
        double media = soma / alunos.length;

        System.out.println("\nMédia geral da turma: " + media);

        // Alunos acima da média
        System.out.println("\nAlunos acima da média:");

        for(int i = 0; i < alunos.length; i++) {

            if(alunos[i].getNota() > media) {
                System.out.println(
                    alunos[i].getNome() + " - Nota: " + alunos[i].getNota()
                );
            }
        }
    }
}
