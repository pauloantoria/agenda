package com.agenda;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    Scanner ent = new Scanner(System.in);
    int menu;
    AddressBook people = new AddressBook();

    boolean continueAgenda = true;
    private void ShowMenu(){
        System.out.println("\t Bienvenidos a la mejor Agenda de tu vida" +
                "\n Selecciona una opción:"+"\n 1- Mostrar Contactos."+
                "\n 2- Crear contacto."+ "\n 3- Eliminar contacto."+
                "\n 0- Salir");
    }

    public void menuIn() throws IOException {
        do{
            ShowMenu();
            System.out.print("Digite una opción: ");
             menu = ent.nextInt();

            switch (menu){
                case 1:
                    System.out.println("Mostrar contacto.");
                    people.list();
                    break;

                case 2:
                    System.out.println("Crear contacto.");

                    System.out.print("Digite su nombre: ");
                    var nombre = ent.next();
                    System.out.print("Digite su Telefono: ");
                    var telefono = ent.next();

                    people.create(nombre, telefono);

                    break;

                case 3:
                    System.out.println("Eliminar contacto.");
                    System.out.print("Digite su teléfono: ");
                    var eliminar_Telef = ent.next();
                    people.delete(eliminar_Telef);
                    break;


                case 0:
                    System.out.println("Adiós");
                    break;
            }

        }while (continueAgenda);
    }

}
