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
        //Scanner
        //pegar informações digitadas:

//        Scanner senai = new Scanner(System.in);
//        System.out.println("Digite três caracteres:");
//        String char1 = senai.next(); // Lê o primeiro caractere
//        char char2 = senai.next().charAt(0); // Lê o segundo caractere
//        char char3 = senai.next().charAt(0); // Lê o terceiro caractere
//        char char4 = senai.next().charAt(0);
//        char char5 = senai.next().charAt(0);
//
//        // Concatena e exibe os caracteres
//        System.out.println("Os caracteres digitados foram: " + char1 + char2 + char3+char4 + char5);
//        //--------
//        System.out.println();
//        System.out.println(char1 + char2 + char3 + char4 + char5);//tabelaASCII
//        System.out.println("^^^^TABELA ASCII");
//        senai.close();

        //------------------------

        //conversão de variaveis:


      //é impossivel converter double para int, ate da mas vc perde dados.
//        double num = 12.2;
//        int mun = num;
//        System.out.println(mun);

        // porem o contrario é totalmente possivel, não muito seguro.
//        int numeroInt = 10;
//        double numeroDouble = numeroInt;
//        System.out.println(numeroDouble);
//        System.out.println(numeroInt);
//        //----------
//        //Casting explicito
//        double numeroDoubleNew = 123.456;
//        int numeriIntNew = (int) numeroDoubleNew;
//        System.out.println(numeriIntNew);
//        System.out.println();
        // ----------
        // Parsing de Strings

//        String conversor = "42";
//        int numeroInteiro = Integer.parseInt(conversor);
//        System.out.println(numeroInteiro);

        //Se a String contiver caracteres não numéricos, ocorrerá uma exceção (NumberFormatException).
        //--------
        // Testando a Promoção Automática

//        int valorInt = 10;
//        long valorLong = 20L;
//        double valorDouble = 30.5;
//
//        // Operações com promoção automática
//        double resultado = valorInt * valorDouble;
//        System.out.println("Resultado da multiplicação de int e double: " + resultado);
//
//        long resultadoLong = valorInt + valorLong;
//        System.out.println("Resultado da soma de int e long: " + resultadoLong);
        //---------
        //Parsing de Strings

        
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite um número inteiro: ");
//        String inputInt = scanner.nextLine();
//
//        try {
//            int numeroInt = Integer.parseInt(inputInt);
//            System.out.println("Número inteiro convertido: " + numeroInt);
//        } catch (NumberFormatException e) {
//            System.out.println("Erro ao converter para inteiro: " + e.getMessage());
//        }
//
//        System.out.print("Digite um número decimal: ");
//        String inputDouble = scanner.nextLine();
//
//        try {
//            double numeroDouble = Double.parseDouble(inputDouble);
//            System.out.println("Número decimal convertido: " + numeroDouble);
//        } catch (NumberFormatException e) {
//            System.out.println("Erro ao converter para decimal: " + e.getMessage());
//        }


         }
    }

