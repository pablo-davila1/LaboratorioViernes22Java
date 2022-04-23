package com.Game.software;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Menu menu = new Menu();
        LogSign usuarios = new LogSign("");
        Integer opcion =0 ;

        menu.Mostrar_menu();
        Scanner reader = new Scanner(System.in);
        opcion = reader.nextInt();

        while (opcion != 3) {
            switch (opcion) {
                case 1:
                {
                    System.out.println("usted inicio sesion");

                    break;
                }
                case 2:
                {
                    System.out.println("usted se registro");
                    break;
                }
                case 3:
                {
                    break;
                }
                default:
                {
                    System.out.println("La pcion: "+opcion+" no existe, intente de nuevo.");
                    break;
                }

            }
            menu.Mostrar_menu();
            opcion = reader.nextInt();
        }


    }
}

