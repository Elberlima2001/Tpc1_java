import java.util.Scanner;

public class determinaHoraDoDia {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite a hora: ");
        int hora = leitura.nextInt();
        System.out.print("Digite os minutos: ");
        int min = leitura.nextInt();
        if(hora<1 || hora>12){
            System.out.println("As horas devem estar entre 1-12!!!");
        }else if(min<0 || min>59){
            System.out.println("Os minutos devem estar entre 0-60!!!");
        }
        System.out.println(getTimeName(hora, min));
    }

       private static final String[] hoursWords = { "", "uma", "duas", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze" };
       private static final String[] minutesWords = { "", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove", "vinte", "vinte e um", "vinte e dois", "vinte e três", "vinte e quatro", "vinte e cinco", "vinte e seis", "vinte e sete", "vinte e oito", "vinte e nove" };

       public static String getTimeName(int hours, int minutes) {
           String timeName = "";

           // Tratamento das horas
           if (hours == 12) {
               hours = 0; // Para cálculos de módulo e indexação do array
           }
           if (minutes == 0) {
               timeName += hoursWords[hours] + " hora";
               if (hours == 1) {
                   timeName += " exata";
               } else {
                   timeName += "s";
               }
           } else if (minutes == 15) {
               timeName += "um quarto para as " + hoursWords[(hours % 12) + 1];
           } else if (minutes == 30) {
               timeName += hoursWords[hours] + " e meia";
           } else if (minutes == 45) {
               timeName += "um quarto para as " + hoursWords[(hours % 12) + 1];
           } else {
               if (minutes < 30) {
                   timeName += minutesWords[minutes] + " minutos";
               } else {
                   timeName += minutesWords[60 - minutes] + " minutos";
                   hours = (hours % 12) + 1;
               }
               if (minutes % 10 == 1 && minutes != 11) {
                   timeName += " para as " + hoursWords[hours];
               } else if (minutes % 10 == 2 && minutes != 12) {
                   timeName += " para as " + hoursWords[hours];
               } else {
                   timeName += " para as " + hoursWords[hours];
               }
           }

           return timeName;
       }
   }


