package com.yate;

import java.util.HashSet;
import java.util.Set;

public class Cuentasusuario {

    public static void main(String[] args) {

        Cliente cl1 = new Cliente("Camilo Yate", "00001", 200000);
        Cliente cl2 = new Cliente("Julio Yate", "00002", 300000);
        Cliente cl3 = new Cliente("Miguel Yate", "00003", 400000);
        Cliente cl4 = new Cliente("Juan Yate", "00004", 500000);
        /**
         * 1. No repetir clientes
         * 2. Agregar, Borrar
         * 3. Solo Lectura
         */

        /**
         * Coleccion Set
         * Programación generica
         *
         */

        Set<Cliente> clientesBancos = new HashSet<Cliente>();

        clientesBancos.add(cl1);
        clientesBancos.add(cl2);
        clientesBancos.add(cl3);
        clientesBancos.add(cl4);

        for (Cliente clientes : clientesBancos) {
            System.out.println(clientes.getNombre() + " " + clientes.getN_cuenta() + " " + clientes.getSaldo());
        }


    }
}
