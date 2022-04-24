package com.Game.software;

import java.io.File;
import java.util.Scanner;

public class LogSign   {
    private String player = "";
    private  String name ="";
    private String[] player_info = {"",""};
    private String Users = "C:\\Users\\HP\\Documents\\LaboratorioViernes22Java\\project\\points.txt";

    public LogSign (String player){
        this.player = player;
    }

    String[] Signin(String player) throws Exception{
        File points = new File(this.Users);
        Scanner users = new Scanner(points);

        while (users.hasNextLine()){
            String [] Users_info= users.nextLine().split(" ");
            name = Users_info[0];
            if(player.equals(this.name) ) {
                player_info[0]=player;
                player_info[1]=Users_info[1];
                users.close();
                return player_info;
            }
        }
        users.close();
        return null;
    }
    //void Singup(String)
}
