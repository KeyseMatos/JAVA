import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner tc = new Scanner(System.in);

        String vetor[] = new String[10];
        String pesquisa;
        boolean encontrado = false;
       
        // Cadastrar os nomes
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o " + (i + 1) + "º nome: ");
            vetor[i] = tc.nextLine();
        }

        // Nome para pesquisar
        System.out.println("Digite um nome para pesquisa: ");
        pesquisa = tc.nextLine();

        // Procurar o nome
        for(int i = 0; i < vetor.length; i++){

            if(pesquisa.equals(vetor[i])){
                System.out.println("Nome encontrado na posição: " + i);
                encontrado = true;
            }
        }

        // Se não encontrou
        if(encontrado == false){
            System.out.println("Nome não existe na tabela!");
        }
    }
}
