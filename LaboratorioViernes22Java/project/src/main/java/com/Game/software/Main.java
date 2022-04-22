package com.Game.software;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        LogSign usuarios = new LogSign("player1");
        String tipo =usuarios.Signin("player1");
        System.out.println(tipo);
    }
}

