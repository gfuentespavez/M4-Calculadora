package Calcular;

import java.awt.*;
import java.util.Scanner;

public class Calculadora {
    public Calculadora() {
        System.out.println("Bienvenido a la calculadora.");
    }

    public void mostrarMenu(){
        int opcion;
        do {
            System.out.println("1. Sumar");
            System.out.println("2. Multiplicar");
            System.out.println("3. Restar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    Sumar();
                    break;
                case 2:
                    Multiplicar();
                    break;
                case 3:
                    Restar();
                    break;
                case 4:
                    Dividir();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    sc.close();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 0);

        sc.close();
    }

    //Métodos
    public void Sumar() {
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("El resultado es: " + sum);
    }

    public void Multiplicar() {
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        int multi = num1 * num2;
        System.out.println("El resultado es: " + multi);
    }

    public void Restar() {
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        int rest = num1 - num2;
        System.out.println("El resultado es: " + rest);
    }
    public void Dividir() {
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        if (num2 != 0) {
            int div = num1 / num2;
            System.out.println("El resultado es: " + div);
        } else {
            System.out.println("Error. No se puede dividir por cero");
        }
    }

    //Método main
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.mostrarMenu();
    }
    private Scanner sc = new Scanner(System.in);
}
