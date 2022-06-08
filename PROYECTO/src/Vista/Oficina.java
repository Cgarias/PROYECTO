package Vista;

import Modelo.Principales.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Oficina {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        while (!salir) {

            System.out.println("1. Detectives");
            System.out.println("2. Casos");
            System.out.println("3. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    ArrayList<Detective> detectives = new ArrayList();
                    
                    System.out.println("1. Agregar Detective");
                    System.out.println("2. Editar");
                    System.out.println("3. Eliminar");
                    System.out.println("Escribe una de las opciones");
                    opcion = sn.nextInt();
                    if (opcion == 1) {
                        System.out.println("--------AGREGAR DETECTIVE-------");
                        System.out.println("ID: ");
                        int id = sn.nextInt();

                        sn.nextLine();
                        System.out.println("Nombre: ");
                        String nom = sn.nextLine();

                        System.out.println("Apellido: ");
                        String ape = sn.nextLine();

                        System.out.println("Experiencia: ");
                        String exp = sn.nextLine();

                        System.out.println("Tipo de caso:");
                        System.out.println("-1.cibercrimen ");
                        System.out.println("-2.narcóticos");
                        System.out.println("-3.homicidios");
                        System.out.println("Ingrese el numero:");
                        int Op = sn.nextInt();
                        String cas;
                        if (Op == 1) {
                            cas = "cibercrimen";
                        } else if (Op == 2) {
                            cas = "Narcoticos";
                        } else {
                            cas = "Homicidios";
                        }
                        
                        detectives.add(new Detective(id, nom, ape, exp, cas));
                        
                        
                        

                    }

                case 2:
                    System.out.println("");
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        }


                System.out.println("Debes insertar un número");
        sn.next();


}



    public ArrayList<Caso> casos = new ArrayList();

    public ArrayList<Sospechoso> sospechosos = new ArrayList();

    public Oficina() {
    }

}
