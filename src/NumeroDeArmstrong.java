import java.util.Scanner;

public class NumeroDeArmstrong {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = leitura.nextInt();

        if (checkArmstrong(n)) {
            System.out.println(n + " é um numero de Armstrong.");
        } else
            System.out.println(n + " não é um numero de Armstrong.");
    }

    public static boolean checkArmstrong(int n) {
        int numDigitos= String.valueOf(n).length();
        int soma=0;
        int temp = n;
        while (temp != 0) {

            int digito = temp % 10;
            soma += Math.pow(digito,numDigitos);
            temp /= 10 ;
        }
        return soma == n;
    }

}