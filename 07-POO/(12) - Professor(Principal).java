import java.util.Scanner;

public class Principal {

    static Scanner tc = new Scanner(System.in);
    static Universidade universidade = new Universidade();

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {

        int op;

        do {

            System.out.println("\n******* Gestão Universitária *******");
            System.out.println("1: Cadastrar Professor");
            System.out.println("2: Buscar Professor pela Matrícula");
            System.out.println("3: Remover Professor pela Matrícula");
            System.out.println("4: Listar Professores");
            System.out.println("5: Estatísticas Gerais");
            System.out.println("6: Sair");

            op = tc.nextInt();
            tc.nextLine();

            switch (op) {

                case 1:
                    cadastrarProfessor();
                    break;

                case 2:
                    buscarProfessor();
                    break;

                case 3:
                    removerProfessor();
                    break;

                case 4:
                    universidade.listarProfessores();
                    break;

                case 5:
                    System.out.println("Total de professores criados: "
                            + Professor.getTotalProfessores());
                    break;

                case 6:
                    System.out.println("É hora de dar tchau!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (op != 6);
    }


    // CADASTRAR
    public static void cadastrarProfessor() {


        System.out.println("\n=== Cadastrar Professor ===");

        System.out.println("1 - Professor Titular");
        System.out.println("2 - Professor Substituto");
        System.out.print("Escolha o tipo de Professor: ");

        int tipo = tc.nextInt();
        tc.nextLine();

        System.out.print("Digite a matrícula: ");
        String matricula = tc.nextLine();

        System.out.print("Digite o nome: ");
        String nome = tc.nextLine();

        System.out.print("Digite as horas semanais: ");
        int horasSemanais = tc.nextInt();

        System.out.print("Digite o salário base: ");
        double salarioBase = tc.nextDouble();

        Professor professor;//Mandou guardar na classe Professor as informações digitadas

        if (tipo == 1) {//se a pessoa digitou 1 vai guardar em titular, senão em substituto

            professor = new ProfessorTitular(matricula, nome, horasSemanais, salarioBase);

        } else {

            professor = new ProfessorSubstituto(matricula, nome, horasSemanais, salarioBase);
        }

        universidade.adicionarProfessor(professor);//o tipo de professor será adicionado na classe universidade de adicionar professor

        System.out.println("Professor cadastrado com sucesso!");
    }


    // BUSCAR
    public static void buscarProfessor() {

        System.out.println("\n=== Buscar Professor ===");

        System.out.print("Digite a matrícula: ");
        String matricula = tc.nextLine();

        Professor professor = universidade.buscarProfessor(matricula);

        if (professor != null) {

            System.out.println(professor);

            System.out.println("Elegível para afastamento: "
                    + professor.elegivelAfastamento());

            System.out.println("Salário final: "
                    + professor.calcularSalarioFinal());

        } else {

            System.out.println("Professor não encontrado!");
        }
    }


    // REMOVER
    public static void removerProfessor() {

        System.out.println("\n=== Remover Professor ===");

        System.out.print("Digite a matrícula: ");
        String matricula = tc.nextLine();

        Professor professor = universidade.buscarProfessor(matricula);

        if (professor != null) {

            universidade.removerProfessor(matricula);

            System.out.println("Professor removido com sucesso!");

        } else {

            System.out.println("Professor não encontrado!");
        }
    }
}
