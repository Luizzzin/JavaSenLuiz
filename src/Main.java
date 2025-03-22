public class Main {
    public static void main(String[] args) {


        String nome = "Luiz";
        System.out.println("Meu nome é:\n"+nome);
        System.out.println("------------------\n");
        //-----------------
        Float num2 = 10.5f;
        double num3 = 10.5;
        System.out.println(num2+num3);
        System.out.println(num2-num3);
        System.out.println(num2/num3);
        System.out.println(num2%num3);
        System.out.println("--------------\n");
        //---------------------
        int num = 10;
        long num4 = 10L;
        System.out.println(num+num4);
        System.out.println(num-num4);
        System.out.println(num/num4);
        System.out.println(num%num4);

        //--------------------
        System.out.println("--------------\n");

        char status = 'M';
        char status1 = 'A';
        char status2 = 'E';
        System.out.println(status+status1+status2);//valores da tabela ASCII
        System.out.println(""+status+status1+status2);
        System.out.println("--------------\n");

        byte novonum = 127;
        byte velhonum = -128;

        System.out.println(novonum+velhonum);
        System.out.println("--------------\n");


        }
    }