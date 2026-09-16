import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        Hospital hospital = new Hospital();

        int opcao;

        do {

            System.out.println("\n===== SISTEMA HOSPITALAR =====");
            System.out.println("1 - Cadastrar Médico");
            System.out.println("2 - Buscar Médico");
            System.out.println("3 - Remover Médico");
            System.out.println("4 - Listar Todos os Médicos");
            System.out.println("5 - Sair");
            System.out.print("Digite uma opção: ");

            opcao = tc.nextInt();
            tc.nextLine();

            switch (opcao) {

                // =================================
                // 1 - CADASTRAR MÉDICO
                // =================================
                case 1:

                    System.out.println("\n--- CADASTRAR MÉDICO ---");
                    System.out.println("1 - Médico Cirurgião");
                    System.out.println("2 - Médico Auxiliar");
                    System.out.print("Escolha o tipo: ");

                    int tipo = tc.nextInt();
                    tc.nextLine();

                    System.out.print("Digite o CRM: ");
                    String CRM = tc.nextLine();

                    System.out.print("Digite o nome: ");
                    String nome = tc.nextLine();

                    System.out.print("Digite a idade: ");
                    int idade = tc.nextInt();

                    System.out.print("Digite o salário: ");
                    double salario = tc.nextDouble();
                    tc.nextLine();

                    if (tipo == 1) {

                        MedicoCirurgiao medico = new MedicoCirurgiao(CRM, nome, idade, salario);

                        hospital.adicionarMedico(medico);

                        System.out.println("Médico cirurgião cadastrado com sucesso!");

                    } else if (tipo == 2) {

                        MedicoAuxiliar medico = new MedicoAuxiliar(CRM, nome, idade, salario);

                        hospital.adicionarMedico(medico);

                        System.out.println("Médico auxiliar cadastrado com sucesso!");

                    } else {

                        System.out.println("Tipo de médico inválido!");
                    }

                    break;


                // =================================
                // 2 - BUSCAR MÉDICO
                // =================================
                case 2:

                    System.out.println("\n--- BUSCAR MÉDICO ---");

                    System.out.print("Digite o CRM: ");
                    String CRMBusca = tc.nextLine();

                    Medico medicoEncontrado =
                            hospital.buscarMedico(CRMBusca);

                    if (medicoEncontrado != null) {

                        System.out.println("\nMédico encontrado!");
                        System.out.println(medicoEncontrado);

                        System.out.println("Aposentado: "
                                + medicoEncontrado.medicoAposentado());

                        System.out.println("Valor da aposentadoria: R$ "
                                + medicoEncontrado.valorAposentadoria());

                    } else {

                        System.out.println("Médico não encontrado!");
                    }

                    break;


                // =================================
                // 3 - REMOVER MÉDICO
                // =================================
                case 3:

                    System.out.println("\n--- REMOVER MÉDICO ---");

                    System.out.print("Digite o CRM do médico: ");
                    String CRMRemover = tc.nextLine();

                    Medico medicoRemover =
                            hospital.buscarMedico(CRMRemover);

                    if (medicoRemover != null) {

                        hospital.removerMedico(CRMRemover);

                        System.out.println("Médico removido com sucesso!");

                    } else {

                        System.out.println("Médico não encontrado!");
                    }

                    break;


                // =================================
                // 4 - LISTAR TODOS OS MÉDICOS
                // =================================
                case 4:

                    System.out.println("\n--- MÉDICOS CADASTRADOS ---");

                    if (hospital.medicos.isEmpty()) {

                        System.out.println("Nenhum médico cadastrado.");

                    } else {

                        for (Medico medico : hospital.medicos) {

                            System.out.println("----------------------------");
                            System.out.println(medico);

                            System.out.println("Aposentado: "
                                    + medico.medicoAposentado());

                            System.out.println("Valor da aposentadoria: R$ "
                                    + medico.valorAposentadoria());
                        }
                    }

                    break;


                // =================================
                // 5 - SAIR
                // =================================
                case 5:

                    System.out.println("\nSaindo do sistema...");
                    System.out.println("Programa encerrado!");

                    break;


                // =================================
                // OPÇÃO INVÁLIDA
                // =================================
                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        tc.close();
    }
}

            } 
        }
