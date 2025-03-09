package aplicacion;

import mates.Matematicas;
import java.util.Scanner;
import java.util.function.Function;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de dardos: ");
        int dardos = sc.nextInt();
        
        Function<Integer, Double> aproximarPi = Matematicas::generarNumeroPiLambda;
        double pi = aproximarPi.apply(dardos);
        
        System.out.println("El número PI es aproximadamente: " + pi);
        
        sc.close();
    }
}
