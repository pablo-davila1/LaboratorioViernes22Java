package com.Game.software;

import java.io.File;

public class Rename {
    private final String nuevo = "C:\\Users\\HP\\Documents\\LaboratorioViernes22Java\\project\\temp.txt";
    private final String viejo = "C:\\Users\\HP\\Documents\\LaboratorioViernes22Java\\project\\points-copia.txt";

    void RenameTo(){
        File f1 = new File(viejo);
        File f2 = new File(nuevo);

        if(f1.renameTo(f2)){
            System.out.println("renombrado");
        }
        else{
            System.out.println("error");
        }
    }
}
