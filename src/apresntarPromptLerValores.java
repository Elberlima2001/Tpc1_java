import java.util.Scanner;

public class apresntarPromptLerValores {
    public static void main(String[] args) {
        double salary= readDouble("Por favor, insira seu salario: ");
        double percentageRaise= readDouble("Qual a percentagem do aumento? ");
        System.out.println("Salary: " + salary);
        System.out.println("Percentagem do aumento: " + percentageRaise + "%");

    }
    static double readDouble(String prompt){
        Scanner leitura = new Scanner(System.in);
        System.out.print(prompt);
        return  leitura.nextDouble();
    }
}
