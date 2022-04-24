package com.pruebas.software;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import com.Game.software.LogSign;

import java.io.File;
import java.util.Scanner;

public class arch {
    public static void main(String[] args)
    {
        File usuarios = new File("C:\\Users\\HP\\Documents\\LaboratorioViernes22Java\\project\\points-copia.txt");
        FileWriter Modificar;
        PrintWriter puntos;
        try {
            File temp = new File("C:\\Users\\HP\\Documents\\LaboratorioViernes22Java\\project\\temp.txt");
            if (!temp.exists()) {
                temp.createNewFile();
            }
            File points = new File("C:\\Users\\HP\\Documents\\LaboratorioViernes22Java\\project\\points.txt");
            Scanner users = new Scanner(points);
            String [] info_user;
            String user = "player6";
            Modificar = new FileWriter(temp);
            puntos = new PrintWriter(Modificar);
            String new_line = "";
            while (users.hasNextLine()){
                info_user = users.nextLine().split(" ");
                if(user.equals(info_user[0])){
                    Integer new_point = 0;
                    new_point  = Integer.parseInt(info_user[1]);
                    new_point++;
                    new_line = info_user[0]+" "+String.valueOf(new_point);
                    puntos.println(new_line);
                }
                else {
                    new_line = info_user[0]+" "+info_user[1];
                    puntos.println(new_line);
                }

            }
            users.close();
            Modificar.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
