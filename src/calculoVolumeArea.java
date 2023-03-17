import java.util.Scanner;

public class calculoVolumeArea {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o valor do raio: ");
        double r= leitura.nextDouble();
        System.out.print("Digite o valor do altura: ");
        double h= leitura.nextDouble();

        System.out.println("Volume esfera: "+ sphereVolume(r));
        System.out.println("Area esfera: "+ sphereSurface(r));
        System.out.println("Volume cilidro: "+ cylinderVolume(r,h));
        System.out.println("Area cilindro: "+ cylinderSurface(r,h));
        System.out.println("Volume cone: "+ coneVolume(r,h));
        System.out.println("Area cone: "+ coneSurface(r,h));
    }
    static double sphereVolume(double r){
        return 4.0/3.0*(3.14*(r*r*r));
    }
    static double sphereSurface(double r){
        return 4*3.14*(r*r);
    }
    static double cylinderVolume(double r, double h){
        return 3.14*r*r*h;
    }
    static double cylinderSurface(double r, double h){
        return 3.14*r*h + (2*3.14*r*r);
    }
    static double coneVolume(double r, double h){
        return 1.0/3.0*(3.14*(r*r)*h);
    }
    static double coneSurface(double r, double h){
        return 3.14*r*(r+h);
    }
}