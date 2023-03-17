import java.util.Scanner;

public class maiorDeTresNumeros {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        int n1,n2,n3;
        System.out.print("Digite um numero: ");
        n1 = leitura.nextInt();
        System.out.print("Digite outro numero: ");
        n2 = leitura.nextInt();
        System.out.print("Digite mais um numero: ");
        n3 = leitura.nextInt();
        if (n1==n2 && n2==n3){
            System.out.println("Os numeros introduzidos não são distintos!!!");
            
        }else
            System.out.print("O maior dos 3 valores inseridos é: "+retornaMaior(n1,n2,n3));
    }
    static int  retornaMaior(int n1, int n2, int n3){
        if(n1>n2 && n1>n3){
            return n1;
        } else if(n2>n1 && n2>n3){
            return n2;

        }else
            return n3;
    }
}
