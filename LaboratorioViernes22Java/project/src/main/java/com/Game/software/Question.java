package com.Game.software;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question {
    private Integer level =0;
    private Integer line =0;
    private String document = "";
    private String answer = "";
    private double numberQuest = Math.floor(Math.random()*5+1);
    private final Integer numberQuestion = (int)numberQuest;


    public Question(Integer level){
        this.level=level;

    }

    String ShowQuestion(Integer level) throws Exception{
        Map<Integer, String> document = new HashMap<Integer ,String>();
        document.put(1,"C:\\Users\\HP\\Documents\\LaboratorioViernes22Java\\project\\level1.txt");
        document.put(2,"C:\\Users\\HP\\Documents\\LaboratorioViernes22Java\\project\\level2.txt");
        document.put(3,"C:\\Users\\HP\\Documents\\LaboratorioViernes22Java\\project\\level3.txt");
        document.put(4,"C:\\Users\\HP\\Documents\\LaboratorioViernes22Java\\project\\level4.txt");
        document.put(5,"C:\\Users\\HP\\Documents\\LaboratorioViernes22Java\\project\\level5.txt");

        Map<Integer,Integer> numbes = new HashMap<Integer,Integer>();
        numbes.put(1,1);
        numbes.put(2,7);
        numbes.put(3,13);
        numbes.put(4,19);
        numbes.put(5,25);
        if(level > 5){
            level = 5;
        }
        File points = new File(document.get(level));
        Scanner users = new Scanner(points);
        double c =1;
        line = numbes.get(numberQuestion);
        while (users.hasNextLine()){
            if(c >= line && c <= line+4){
                System.out.println(users.nextLine());
            }
            else if(c == line+5){
                return users.nextLine();
            }
            else
                users.nextLine();
            c++;
        }
        users.close();
        return null;
    }
}
