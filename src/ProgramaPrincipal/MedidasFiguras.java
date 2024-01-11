package ProgramaPrincipal;

import java.util.Scanner;

public class MedidasFiguras {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {


// AREA DEL TRIANGULO
    	
        double area = calcularArea(pedirAltura(),pedirBase());
        System.out.println("El area del triangulo es: " + area);

    }
//CALCULAR AREA DEL TRIANGULO
    
    public static double calcularArea(double altura, double base) {
        double area = (base / 2) * altura;
        return area;
    }

//PEDIR ALTURA
    
    public static double pedirAltura() {
        System.out.println("Introduce la altura:");
        double altura = leer.nextInt();
        boolean salir = false;
        while (!salir) {
            if (altura <= 0) {
                System.err.println("Error. La altura no puede ser menor o igual que 0. Vuelve a introducirla:");
                altura = leer.nextInt();
            }
            else {
                salir = true;
            }
        }
        return altura;
    }

//PEDIR BASE
    
    public static double pedirBase() {
        System.out.println("Introduce la base:");
        double base = leer.nextInt();
        boolean salir = false;
        while (!salir) {
            if (base <= 0) {
                System.err.println("Error. La base no puede ser menor o igual que 0. Vuelve a introducirla:");
                base = leer.nextInt();
            }
            else {
                salir = true;
            }
        }
        return base;
    }
}
