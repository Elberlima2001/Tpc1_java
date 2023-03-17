import java.util.Scanner;
public class raioDeUmCirculo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o valor do raio: ");
        double raio= leitura.nextDouble();
        System.out.println("A area do circulo é: "+calculaArea(raio));

    }
    static double calculaArea(double raio){
        return 3.14*(raio*raio);
    }
}