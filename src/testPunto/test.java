package testPunto;

import Punto.GenerarPunto;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = 0, y = 0;
        int aux1 = 0, aux2 = 0;
        GenerarPunto punt1 = new GenerarPunto(x, y);
        System.out.println("1.-Programa que utiliza los numero randomicos para generar una direccion");
        System.out.println("y numeros aleatorios para coordenadas x,y");
        System.out.println("2.-El programa calcula la distancia de un punto a otro\n");
        System.out.println("Las cordenadas  inicializan en :\n (x,y)=(" + punt1.getX() + ", " + punt1.getY() + ")");
        System.out.println("Ingrese cuantos movimientos va a realizar");
        int num = teclado.nextInt();
        System.out.println("");
        for (int i = 0; i < num; i++) {
            int opcion;
            System.out.println("La direccion donde se  desplaza el punto es :");
            System.out.println("para que sea en y = 1 para q sea en x = 2 ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1 -> {
                    aux1 = aux1 + (int) (Math.random() * 4 + 1);
                    int opciony = (int) (Math.random() * 2 + 1);
                    switch (opciony) {
                        case 1 -> {
                            System.out.println("Se desplazo hacia arriba");
                            punt1.mArriba(aux1);
                            break;
                        }
                        case 2 -> {
                            System.out.println("Se desplazo hacia abajo");
                            punt1.mAbajo(aux1);
                            break;
                        }
                    }
                }
                case 2 -> {
                    aux2 = aux2 + (int) (Math.random() * 4 + 1);
                    int opcionx = (int) (Math.random() * 2 + 1);
                    switch (opcionx) {
                        case 1 -> {
                            System.out.println("Se desplazo a la derecha");
                            punt1.nDerecha(aux2);
                            break;
                        }
                        case 2 -> {
                            System.out.println("Se desplazo a la izquierda");
                            aux1 = aux1 + (int) (Math.random() * 4 + 1);
                            punt1.nIzquierda(aux2);
                            break;
                        }
                    }
                }
                default ->
                    System.out.println("Error");
            }
            System.out.println(" Posicion (X;Y): (" + punt1.getX() + ", " + punt1.getY() + ")");
            switch (opcion) {
                case 1 -> {
                    System.out.print(" Su distancia en y es " + aux1);
                }
                case 2 -> {
                    System.out.print(" Su distancia en x  es " + aux2);
                }
            }
            System.out.print(" respecto al otro punto \n\n");
        }
    }
}
