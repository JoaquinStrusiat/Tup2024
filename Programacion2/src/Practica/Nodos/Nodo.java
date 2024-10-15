package Practica.Nodos;

import java.util.ArrayList;

public class Nodo {
    private int value;
    private ArrayList<Nodo> children;

    public Nodo(int val){
        this.value = val;
        this.children = new ArrayList<>();
    }

    public void AddHijo(Nodo child){
        children.add(child);
    }

    public int getSum(){
        for(Nodo child : children){
            return Nodo.
        }
    }

}

