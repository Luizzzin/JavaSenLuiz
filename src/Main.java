import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String nome = "Luiz";
//        System.out.println("Meu nome é:\n"+nome);
//        System.out.println("------------------\n");
//        //-----------------
//        Float num2 = 10.5f;
//        double num3 = 10.5;
//        System.out.println(num2+num3);
//        System.out.println(num2-num3);
//        System.out.println(num2/num3);
//        System.out.println(num2%num3);
//        System.out.println("--------------\n");
//        //---------------------
//        int num = 10;
//        long num4 = 10L;
//        System.out.println(num+num4);
//        System.out.println(num-num4);
//        System.out.println(num/num4);
//        System.out.println(num%num4);
//
//        //--------------------
//        System.out.println("--------------\n");
//
//        char status = 'M';
//        char status1 = 'A';
//        char status2 = 'E';
//        System.out.println(status+status1+status2);//valores da tabela ASCII
//        System.out.println(""+status+status1+status2);
//        System.out.println("--------------\n");
//
//        byte novonum = 127;
//        byte velhonum = -128;
//
//        System.out.println(novonum+velhonum);
//        System.out.println("--------------\n");
//
         //---------------------------------
        Scanner senai = new Scanner(System.in);
        System.out.println("Digite três caracteres:");
        String char1 = senai.next(); // Lê o primeiro caractere
        char char2 = senai.next().charAt(0); // Lê o segundo caractere
        char char3 = senai.next().charAt(0); // Lê o terceiro caractere
        char char4 = senai.next().charAt(0);
        char char5 = senai.next().charAt(0);

        // Concatena e exibe os caracteres
        System.out.println("Os caracteres digitados foram: " + char1 + char2 + char3+char4 + char5);
        //--------
        System.out.println();
        System.out.println(char1 + char2 + char3 + char4 + char5);//tabelaASCII
        System.out.println("^^^^TABELA ASCII");
        senai.close();


         }
    }

