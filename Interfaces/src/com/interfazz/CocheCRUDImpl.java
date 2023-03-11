package com.interfazz;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD { /*se implementa la interfaz y
    @Override                                      se llama a sus parametros */
    public void save() {
    }

    @Override
    public void delete() {
    }

    @Override
    public List<CocheMain> findAll() {
        return null;
    }
//strings para imprimir los 3 parametros
    String save = "Guardar";
    String delete = "Borrar";
    String findAll = ("Encontrar");

    @Override               //toString para que se imprima bien como string, en vez de su ubicación en la memoria
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", delete='" + delete + '\'' +
                ", findAll='" + findAll + '\'' +
                '}';
    }
}
