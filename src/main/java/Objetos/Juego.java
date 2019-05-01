package Objetos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Juego {

    Dado n = new Dado();
    Dado b = new Dado();

    public void inicio() {
        boolean estado = true;
        while (estado) {
            System.out.println("¡Bienvenido al juego de dado!");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            int opcion = recibirValidar();
            switch (opcion) {
                case 1:
                    if ((n.lanzarDado() + b.lanzarDado()) == 7) {
                        System.out.println("Has ganado");
                    }else{
                        System.out.println("Has perdido");
                    }
                    break;
                case 2:
                    estado = false;
                    break;

            }
        }
    }

    public static int recibirValidar() {
        int num = 0;
        boolean estado = true;

        while (estado) {

            try {
                System.out.println("Ingrese un numero");
                Scanner sc = new Scanner(System.in);

                num = sc.nextInt();
                estado = false;

            } catch (InputMismatchException e) {
                System.out.println("El caracter ingresado no es numerico o se encuentra fuera del rango establecido, intentelo nuevamente.");
                estado = true;
            }

        }
        return num;
    }
}
