package com.Game.software;

import java.io.File;
import java.util.Scanner;

public class LogSign   {
    private String player = "";
    private String Users = "C:\\Users\\HP\\Documents\\LaboratorioViernes22Java\\project\\points.txt";

    public LogSign (String player){
        this.player = player;
    }

    void Signin(String player) throws Exception{
        File points = new File(this.Users);
        Scanner users = new Scanner(points);

        while (users.hasNextLine()){
            System.out.println(users.nextLine());
        }

    }
}
