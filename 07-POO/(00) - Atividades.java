import java.util.Scanner;

public class Atividades {

    static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {

        menu();

    }

    private static void menu() {

        int op;

        do {

            System.out.println("\nEscolha a questão de (01 à 14) e (0: SAIR)");
            op = tc.nextInt();

            switch (op) {

            case 1:
                questao01();
                break;

            case 2:
                questao02();
                break;

            case 3:
                questao03();
                break;
                
            case 4:
                questao04();
                break;
                
            case 5:
                questao05();
                break;
                
            case 6:
                questao06();
                break;
                
            case 7:
                questao07();
                break;
                
            case 8:
                questao08();
                break;
                
            case 9:
                questao09();
                break;
                
            case 10:
                questao10();
                break;
                
            case 11:
                questao11();
                break;
                
            case 12:
                questao12();
                break;
                
            case 13:
                questao13();
                break;
                
            case 14:
                questao14();
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Digite uma opção válida");

            }

        } while (op != 0);
    }

    private static void questao01() {

        int n1, n2;

        System.out.println("Digite o primeiro numero:");
        n1 = tc.nextInt();

        System.out.println("Digite o segundo numero:");
        n2 = tc.nextInt();

        if (n1 > n2) {

            System.out.println(n1 + " é maior que " + n2);

        } else if (n2 > n1) {

            System.out.println(n2 + " é maior que " + n1);

        } else {

            System.out.println("São iguais!");

        }
    }

    private static void questao02() {

        int n1, n2;

        System.out.println("Digite o primeiro numero:");
        n1 = tc.nextInt();

        System.out.println("Digite o segundo numero:");
        n2 = tc.nextInt();

        System.out.println(
            "A media de " + n1 + " e " + n2 + " = "
            + (double)(n1 + n2) / 2
        );
    }

    private static void questao03() {

        int n1;

        System.out.println("Digite o primeiro numero:");
        n1 = tc.nextInt();

        System.out.println(
            n1 % 2 == 0 ? "Par" : "Impar"
        );

        // Condição ? verdadeiro : falso
    }

    private static void questao04(){
        
        int ano;
        
        System.out.println("Digite o ano do seu nascimento: ");
        ano = tc.nextInt();
        
        System.out.println("A sua idade é: " + (2026 - ano));
        
    }
    
    private static void questao05(){
        
        int n1;
        
        System.out.println("Digite um número: ");
        n1 = tc.nextInt();
        
        System.out.println("O seu antecessor é: "+ (n1 - 1)+ " | O seu sucessor é: "+ (n1 + 1));
    }
    
    private static void questao06(){
        
        String nome;
        double n1, n2, n3;
        double media;
        
        System.out.println("Digite o nome do Aluno: ");
        tc.nextLine();
        nome = tc.nextLine();
        
        System.out.println("Digite a primeiro nota: ");
        n1 = tc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = tc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = tc.nextDouble();
        
        media = (n1+n2+n3)/3;
        System.out.println("A média do aluno "+nome+" é "+media);
        
        if(media > 7){
            System.out.println("Aluno Aprovado");
        }else{
            System.out.println("Aluno Reprovado");
        }
    }
    
    private static void questao07(){
        
        String nome;
        double media;
        
        for (int i = 1; i <=20; i++){
            
            System.out.println("Digite o nome do "+i+ "° aluno: ");
            tc.nextLine();
            nome = tc.nextLine();
            
            System.out.println("Digite a média do aluno "+nome+ " : ");
            media = tc.nextDouble();
            
            if(media > 8.0){
                
                System.out.println("Aluno "+nome+" com média "+media);
            }
        }
    }
    
    private static void questao08(){
        
        int n;
        int contador = 0;
        
        for(int i = 1; i <=80; i++){
            
            System.out.println("Digite o "+i+"° número: ");
            n = tc.nextInt();
            
            if(n > 10 && n <=150){
                
                contador++;
                
            }
        
        }
        
        System.out.println("Apareceram " + contador + " números entre 10 e 150.");
    }
    
    private static void questao09(){
        
        String nome;
        double salario, vendas, total;
        double comissao = 0.15;
        
        System.out.println("Digite o nome do vendedor: ");
        tc.nextLine();
        nome = tc.nextLine();
        
        System.out.println("Salário do vendedor(a) "+nome+" R$ ");
        salario = tc.nextDouble();
        
        System.out.println("Vendas do vendedor(a) "+nome+" R$ ");
        vendas = tc.nextDouble();
        
        total = (vendas * comissao) + salario;
        
        System.out.println("O vendedor "+nome+" recebe um salário fixo de: "+salario+" e o seu salário final é de R$ "+total);
        
    }
    
    private static void questao10(){
        
        int n, par = 0,impar = 0;
        
        for(int i = 1; i <=3; i++){
            
            System.out.println("Digite o "+i+"° número inteiro.");
            n = tc.nextInt();
            
            if(n % 2 == 0){
            par++;
            }else{
            impar++;
            }
            
        }
        
        System.out.println("Foram digitados "+par+" número(s) par e "+impar+" número(s) ímpar.");
    }
    
    private static void questao11(){
        
        int n;
        int media, contador = 0, par = 0, impar = 0;
        
        for(int i = 1; i <=10; i++){
            
            System.out.println("Digite o "+i+"° número: ");
            n = tc.nextInt();
            
            if( n % 2 == 0){
                par += n;
            }else{
                impar += n;
                contador++;
                
            }
        }
        media = impar/contador;
        System.out.println("A soma do(s) número(s) par é "+par+" e a média do(s) número(s) ímpar é "+media);
    }
    
    private static void questao12(){
        
        int n;
        int positivos = 0;
        int contadorN = 0;
        
        for(int i = 1; i <= 50; i++){
            
            System.out.println("Digite o "+i+"° número: ");
            n = tc.nextInt();
            
            if(n >= 0){
                positivos += n;
            }else{
                contadorN++;
            }
        }
        
        System.out.println("A soma do(s) número(s) positivo(s) é: "+positivos+" e a quantidade de valore(s) negativo(s) é: "+contadorN);
    }
    
    private static void questao13(){
        
        int soma = 0;
        
        for(int i = 85; i <= 907; i++){
            
            if(i % 2 == 0){
            System.out.println(i);
            soma += i;
            }
        }
        System.out.println("A soma dos números pares é: "+soma);
    }
    
    private static void questao14(){
        
        String nome;
        String nomePeso = "";
        String nomeAltura = "";
        
        double peso, altura;
        double pesoMaior =  0, alturaMaior = 0;

        
        for(int i = 1; i <=2; i++){
            
            System.out.println("Digite o nome: ");
            tc.nextLine();
            nome = tc.nextLine();
            
            System.out.println("Digite a altura de "+nome+" : ");
            altura = tc.nextDouble();
            
            System.out.println("Digite o peso de "+nome+" : ");
            peso = tc.nextDouble();
            
            if(peso > pesoMaior){
                
                pesoMaior = peso;
                nomePeso = nome;
                
            }
            if(altura > alturaMaior){
                
                alturaMaior = altura;
                nomeAltura = nome;
            }
        }
        
        System.out.println("A pessoa de maior peso se chama "+nomePeso+" e o seu peso é "+pesoMaior+"kg.");
        System.out.println("A pessoa mais alta se chama "+nomeAltura+" e a sua altura é "+alturaMaior);
    }
}    
