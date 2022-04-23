package com.pruebas.software;

import com.Game.software.LogSign;

import java.io.File;
import java.util.Scanner;

public class arch {
    public static void main(String[] args) throws Exception
    {
        
        File document = new File("C:\\Users\\HP\\Documents\\LaboratorioViernes22Java\\project\\points.txt");
        Scanner preguntas= new Scanner(document);

        while (preguntas.hasNextLine()){
            System.out.println(preguntas.nextLine());
        }

    }
}
