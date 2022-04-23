package com.Game.software;

import java.io.File;
import java.util.Scanner;

public class LogSign   {
    private String player = "";
    private  String name ="";
    private String Users = "C:\\Users\\HP\\Documents\\LaboratorioViernes22Java\\project\\points.txt";

    public LogSign (String player){
        this.player = player;
    }

    String Signin(String player) throws Exception{
        File points = new File(this.Users);
        Scanner users = new Scanner(points);

        while (users.hasNextLine()){
            name = users.nextLine().split(" ")[0];
            if(player.equals(this.name) ) {
                return player;
            }
        }
        return null;
    }
    //void Singup(String)
}
