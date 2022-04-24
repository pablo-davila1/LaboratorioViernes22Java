package com.Game.software;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class SobreEscribir {
    private String name_user = "";

    public SobreEscribir(String name_user){
        this.name_user = name_user;
    }
    void Actualizar(String name_user){
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
            String user = name_user;
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
            puntos.close();
            Modificar.close();

        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
