import java.util.Scanner;

public class escolinhaFutebol {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o numero de crianças: ");
        int n = leitura.nextInt();
        System.out.print("Digite o tamanho dos grupos: ");
        int tam = leitura.nextInt();
        int grupos = n / tam;
        int res = n % tam;
        System.out.println("Podem ser formados: " + grupos + " grupos.");
        System.out.print(res + " Criança(s) ficam sem grupo. ");
    }
}