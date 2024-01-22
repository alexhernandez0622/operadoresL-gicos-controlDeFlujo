import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        /*Comprobación de número par/impar:
Solicita al usuario un número entero y verifica si es par o impar.*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scan.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        /*Operador AND: Verificar si una persona es mayor de edad y menor o igual a 60 años.*/
        int edadHumano = 25;
        // Utilizando el operador && para evaluar dos condiciones simultáneamente.
        boolean esMayorDeEdad = edadHumano >= 18 && edadHumano <= 60;

        // Imprimiendo un mensaje dependiendo del resultado de las condiciones.
        if (esMayorDeEdad) {
            System.out.println("La persona es mayor de edad y menor o igual a 60 años.");
        } else {
            System.out.println("La persona es menor de edad o mayor a 60 años.");
        }

        /*Operador OR: Determinar si una persona es de género masculino.*/
        char genero = 'M';
        // Utilizando el operador || para verificar si el género es 'M' o 'm'.
        boolean esHombre = genero == 'M' || genero == 'm';

        //Imprimiendo un mensaje dependiendo del género detectado
        if (esHombre) {
            System.out.println("La persona es un hombre.");
        } else {
            System.out.println("La persona no es un hombre.");
        }

        /*Operador OR: Comprobar si está lloviendo y aconsejar sobre llevar un paraguas.*/
        boolean llueve = false;
        // Utilizando el operador ! para obtener la negación de la condición.
        boolean noLlueve = !llueve;

        // Imprimiendo un mensaje basado en la negación de la condición.
        if (noLlueve) {
            System.out.println("No llueve, puedes salir sin paraguas.");
        } else {
            System.out.println("Está lloviendo, mejor lleva un paraguas.");
        }

        /*Combinación de Operadores:
        *Verificar si un número es par y menor que 20. */
        int numeros = 15;
        // Combinando el operador % (módulo) y && para evaluar dos condiciones simultáneamente.
        boolean esParYMenorQue20 = numeros % 2 == 0 && numeros < 20;

        // Imprimiendo un mensaje dependiendo del resultado de las condiciones.
        if (esParYMenorQue20) {
            System.out.println("El número es par y menor que 20.");
        } else {
            System.out.println("El número no cumple ambas condiciones.");
        }

        /*Uso de Operadores Lógicos en Condiciones Anidadas:
        *Validar si una persona es un hombre mayor de edad. */
        int edd = 25;
        char generos = 'M';

        // Uso de operadores lógicos en condiciones anidadas.
        if (edd >= 18 && (generos == 'M' || generos == 'm')) {
            System.out.println("Es un hombre mayor de edad.");
        } else {
            System.out.println("No cumple con las condiciones establecidas.");
        }

        /*Operadores Lógicos con Cadenas de Texto:
        * Verificar si una cadena de texto contiene las palabras "java" y "programación".*/
        String texto = "Aprender java es divertido y la programación es fascinante.";
        // Utilizando el operador && para comprobar la presencia de ambas palabras.
        boolean contieneJavaYProgramacion = texto.contains("java") && texto.contains("programación");

        // Imprimiendo un mensaje dependiendo del resultado de la verificación.
        if (contieneJavaYProgramacion) {
            System.out.println("El texto contiene las palabras 'java' y 'programación'.");
        } else {
            System.out.println("El texto no cumple con las condiciones establecidas.");
        }


    }
}