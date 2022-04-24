package com.pruebas.software;

import java.util.Random;
import com.Game.software.LogSign;

import java.io.File;
import java.util.Scanner;

public class arch {
    public static void main(String[] args)
    {
        double valorDado = 0;
        for (int i = 0; i<30 ; i++) {
            valorDado = Math.floor(Math.random()*5+1);
            System.out.println(valorDado);
        }
    }
}
