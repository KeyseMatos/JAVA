import java.util.Scanner;

public class Questoes{

    Scanner tc = new Scanner(System.in);

    public static void main(String[] args){

      menu();  

}

private static void menu(){

    int opcao;

    do{

        System.out.println("\n Escolha uma questão de 01 a 113: ");
        opcao = tc.nextInt();

        switch(opcao){

        case 1:
            questao01();
            break;

        /*case 2:
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

        case 15:
            questao15();
            break;

        case 16:
            questao16();
            break;

        case 17:
            questao17();
            break;

        case 18:
            questao18();
            break;

        case 19:
            questao19();
            break;

        case 20:
            questao20();
            break;

        case 21:
            questao21();
            break;

        case 22:
            questao22();
            break;

        case 23:
            questao23();
            break;

        case 24:
            questao24();
            break;

        case 25:
            questao25();
            break;

        case 26:
            questao26();
            break;

        case 27:
            questao27();
            break;

        case 28:
            questao28();
            break;

        case 29:
            questao29();
            break;

        case 30:
            questao30();
            break;

        case 31:
            questao31();
            break;

        case 32:
            questao32();
            break;

        case 33:
            questao33();
            break;

        case 34:
            questao34();
            break;

        case 35:
            questao35();
            break;

        case 36:
            questao36();
            break;

        case 37:
            questao37();
            break;

        case 38:
            questao38();
            break;

        case 39:
            questao39();
            break;

        case 40:
            questao40();
            break;

        case 41:
            questao41();
            break;

        case 42:
            questao42();
            break;

        case 43:
            questao43();
            break;

        case 44:
            questao44();
            break;

        case 45:
            questao45();
            break;

        case 46:
            questao46();
            break;

        case 47:
            questao47();
            break;

        case 48:
            questao48();
            break;

        case 49:
            questao49();
            break;

        case 50:
            questao50();
            break;

        case 51:
            questao51();
            break;

        case 52:
            questao52();
            break;

        case 53:
            questao53();
            break;

        case 54:
            questao54();
            break;

        case 55:
            questao55();
            break;

        case 56:
            questao56();
            break;

        case 57:
            questao57();
            break;

        case 58:
            questao58();
            break;

        case 59:
            questao59();
            break;

        case 60:
            questao60();
            break;

        case 61:
            questao61();
            break;

        case 62:
            questao62();
            break;

        case 63:
            questao63();
            break;

        case 64:
            questao64();
            break;

        case 65:
            questao65();
            break;

        case 66:
            questao66();
            break;

        case 67:
            questao67();
            break;

        case 68:
            questao68();
            break;

        case 69:
            questao69();
            break;

        case 70:
            questao70();
            break;

        case 71:
            questao71();
            break;

        case 72:
            questao72();
            break;

        case 73:
            questao73();
            break;

        case 74:
            questao74();
            break;

        case 75:
            questao75();
            break;

        case 76:
            questao76();
            break;

        case 77:
            questao77();
            break;

        case 78:
            questao78();
            break;

        case 79:
            questao79();
            break;

        case 80:
            questao80();
            break;

        case 81:
            questao81();
            break;

        case 82:
            questao82();
            break;

        case 83:
            questao83();
            break;

        case 84:
            questao84();
            break;

        case 85:
            questao85();
            break;

        case 86:
            questao86();
            break;

        case 87:
            questao87();
            break;

        case 88:
            questao88();
            break;

        case 89:
            questao89();
            break;

        case 90:
            questao90();
            break;

        case 91:
            questao91();
            break;

        case 92:
            questao92();
            break;

        case 93:
            questao93();
            break;

        case 94:
            questao94();
            break;

        case 95:
            questao95();
            break;

        case 96:
            questao96();
            break;

        case 97:
            questao97();
            break;

        case 98:
            questao98();
            break;

        case 99:
            questao99();
            break;

        case 100:
            questao100();
            break;

        case 101:
            questao101();
            break;

        case 102:
            questao102();
            break;

        case 103:
            questao103();
            break;

        case 104:
            questao104();
            break;

        case 105:
            questao105();
            break;

        case 106:
            questao106();
            break;

        case 107:
            questao107();
            break;

        case 108:
            questao108();
            break;

        case 109:
            questao109();
            break;

        case 110:
            questao110();
            break;

        case 111:
            questao111();
            break;

        case 112:
            questao112();
            break;

        case 113:
            questao113();
            break;*/

        default:
            System.out.println("Questão inválida!");
    }

} while (opcao != 0);
}//chave que fecha o menu

private static void questao01(){

    /*1. Calcule o valor de cada expressão abaixo e indique o tipo do resultado (inteiro ou real): 
a) (2015) / 2 
b) 2015/2 
c) 2*5/20 + 30/15 * 2 
d) 2* (5/20) + 30 / ( 15 * 2) 
e) 23 % 4 * 2 

=============================================================*/

int a, b, c, d, e;

System.out.println("=========RESULTADOS===========\n");
System.out.println("a) (2015) / 2 = " + (2015 / 2));

}
}//chave que fecha a classe Questoes


