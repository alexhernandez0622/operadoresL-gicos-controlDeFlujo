

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        /*Escribe un programa en Java que determine si un número ingresado por el usuario es positivo, negativo o cero. Utiliza estructuras de control if-else.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Condicional if-else para determinar si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        /*Escribe un programa en Java que tome un número del 1 al 7 e imprima el día de la semana correspondiente. Utiliza la estructura switch.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 7: ");
        int numeros = sc.nextInt();

        // Switch para determinar el día de la semana
        switch (numeros) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido. Ingrese un número del 1 al 7.");
        }
        sc.close();

        /*Escribe un programa en Java que solicite al usuario ingresar un número entero, y utilice un bloque try-catch para manejar posibles excepciones de entrada no válida.*/

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero: ");
            int num = scan.nextInt();
            System.out.println("Número ingresado: " + num);
        } catch (Exception e) {
            System.out.println("Error: Ingrese un número entero válido.");
        }

        scan.close();

        /*Desarrolla un programa que simule un juego de adivinanza. El programa debe generar aleatoriamente un número secreto entre 1 y 100 que el usuario deberá intentar adivinar. Se permitirán únicamente tres intentos.*/

        Scanner scaner = new Scanner(System.in);
        Random random = new Random();

        // Generar un número aleatorio entre 1 y 100
        int numeroAdivinanza = random.nextInt(100) + 1;

        int intento;
        int intentosRealizados = 0;
        final int MAX_INTENTOS = 3;


        System.out.println("¡Bienvenido al Juego de Adivinanzas!");
        System.out.println("Intenta adivinar un número entre 1 y 100.");

        do {
            // Solicitar al usuario que ingrese un intento
            System.out.print("Ingresa tu intento: ");
            intento =  scaner.nextInt();

            // Incrementar el contador de intentos
            intentosRealizados++;

            // Verificar si el intento es correcto
            if (intento == numeroAdivinanza) {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentosRealizados + " intentos.");
            } else {
                // Informar al usuario si el intento es incorrecto
                System.out.println("Intento incorrecto. ¡Sigue intentando!");
            }

        } while (intento != numeroAdivinanza && intentosRealizados < MAX_INTENTOS);

        // Verificar si el usuario agotó sus intentos sin adivinar
        if (intento != numeroAdivinanza) {
            System.out.println("Lo siento, has agotado tus 3 intentos. El número correcto era: " + numeroAdivinanza);
        }

        // Cerrar el scanner
        scanner.close();
      }
    }






