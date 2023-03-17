import java.util.Scanner;

public class converterFahrenheit {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fharnheit: ");

        double F = leitura.nextFloat();
        double C = converter(F);
        System.out.print("Convertido para Celsius: "+C+"ª\n");
    }
    static double converter(double tempF){
        return 0.56 * (tempF - 32);
    }
}
   /* int main(){
        float C ,F;
        printf("Temperatura em Fahrnheit: ");
        scanf("%f",&F);
        C = 5/9*(F - 32.0);
        printf("Convertida para celcius: %1f ",C);
        return 0;
    }*/