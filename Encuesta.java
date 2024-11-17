/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encuesta;

import java.util.Scanner;

public class Encuesta {

    private static Persona[] person = new Persona[6];
    private static int contador = 0;

    public static void agregarPersona() {
        if (contador < person.length) {
            Scanner scanner = new Scanner(System.in);

            Persona persona = new Persona();

            System.out.print("Nombre de la persona: ");
            persona.setNombre(scanner.nextLine());

            System.out.print("documento de identidad(cedula): ");
            persona.setCedula(scanner.nextLine());

            System.out.print("Fecha de Nacimiento: ");
            persona.setFechaNacimiento(scanner.nextLine());

            System.out.print("Su correo: ");
            persona.setCorreo(scanner.nextLine());

            System.out.print("Ciudad de Residencia: ");
            persona.setCiudadResidencia(scanner.nextLine());

            System.out.print("Ciudad de Origen: ");
            persona.setCiudadOrigen(scanner.nextLine());
            

            for (int i = 0; i < 3; i++) {
                System.out.print("Titulo de la cancion favorita: " + (i + 1) + ": ");
                String titulo = scanner.nextLine();
                System.out.print("Artista de la cancion favorita: " + (i + 1) + ": ");
                String artista = scanner.nextLine();
                cancion cancion = new cancion(titulo, artista);
                persona.agregarCancion(cancion);
            }
            System.out.println("¡la persona se ha agregado correctamente!");
            person[contador++] = persona;
        } else {
            System.out.println("¡¡No es posible agregar mas personas.!!");
        }
    }

    public static void mostrarInformacionPersona(byte posicion) {
        if (posicion >= 0 && posicion <= contador) {
            person[posicion-1].mostrarInformacion();
        } else {
            System.out.println("Esa posicion no es valida.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        byte opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Agregar Persona");
            System.out.println("2. Mostrar Informacion de Persona");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextByte();

            switch (opcion) {
                case 1:
                    Encuesta.agregarPersona();
                    break;
                case 2:
                    System.out.print("Ingresa la posicion de la persona: ");
                    byte posicion = scanner.nextByte();
                    Encuesta.mostrarInformacionPersona(posicion);
                    break;
                case 3:
                    System.out.println("hasta lueguito....");
                    break;
                default:
                    System.out.println("Opcion no valida...");
            }
        } while (opcion != 3);
    }
}
