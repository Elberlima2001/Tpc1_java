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
    }
   /* public static String getTimeName(int h, int m){
        StringBuilder sb = new StringBuilder();
        if(h != 0 && m==0) {
            switch (h) {
                case 1:
                    sb.append("Uma hora");
                case 2:
                    sb.append("Duas horas");
                case 3:
                    sb.append("Tres horas");
                case 4:
                    sb.append("Quatro horas");
                case 5:
                    sb.append("Cinco horas");
                case 6:
                    sb.append("Seis horas");
                case 7:
                    sb.append("Sete horas");
                case 8:
                    sb.append("oito horas");
                case 9:
                    sb.append("nove horas");
                case 10:
                    sb.append("Dez horas");
                case 11:
                    sb.append("onze hora");
                case 12:
                    sb.append("doze Horas");

            }

        }
    }*/
}
