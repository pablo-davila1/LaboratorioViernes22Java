package com.Game.software;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Menu menu = new Menu();
        LogSign usuarios = new LogSign("");
        String[] player_info = usuarios.Signin("player1");
        Integer opcion =0 ;

        Question question = new Question(0);

        menu.Mostrar_menu();
        Scanner reader = new Scanner(System.in);
        opcion = reader.nextInt();

        while (opcion != 3) {
            switch (opcion) {
                case 1:
                {
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("Ingrese su usuario: ");
                    String User = teclado.nextLine();
                    SobreEscribir archivo = new SobreEscribir("");

                    if(usuarios.Signin(User) != null) {
                        String User_info []= usuarios.Signin(User);
                        String answer = question.ShowQuestion(Integer.parseInt(User_info[1]));
                        System.out.println("Cual es la respuesta correcta?");
                        String Useranswer = teclado.nextLine();
                        Integer new_point = 0;
                        Question simulador = new Question("0");

                        User_info[1] = simulador.PointSimulator(User_info[1]);
                        while (Useranswer.equals(answer)){
                            System.out.println("Correcto");
                            answer = question.ShowQuestion(Integer.parseInt(User_info[1]));
                            System.out.println("Cual es la respuesta correcta?");
                            Useranswer = teclado.nextLine();

                            User_info[1] = simulador.PointSimulator(User_info[1]);

                            usuarios.RenameTo();
                            archivo.Actualizar(User_info[0]);


                        }
                        System.out.println("INCORRECTOO:(((((");

                    }


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

