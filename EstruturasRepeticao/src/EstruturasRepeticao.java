import java.util.Scanner;

public class EstruturasRepeticao {
    public static void main(String[] args){
        System.out.println("Olá, seja muito bem vindo(a). \nPor favor digite seu nome.");

        Scanner sc = new Scanner(System.in);
        String nome = sc.next();

        System.out.println("Agora digite um número maior que 0");
        int n1 = sc.nextInt();
        int q = nome.length();

        if(n1 > 0){
            if (q > 6){
                for (int b = 0; b < q; b++)
                    System.out.println("Seu nome nome é: " + nome);
            }else{
                System.out.println("Seu nome nome é: " + nome);

            }
            System.out.println();

            for(int i = 0; i <= n1; i++) {
                System.out.println(i);


            }
            System.out.println();

            for(int j = n1; j >= 0; j--) {
                System.out.println(j);
            }
        }else{
            System.out.println("Esse número é invalido!");
        }

        sc.close();
    }
}