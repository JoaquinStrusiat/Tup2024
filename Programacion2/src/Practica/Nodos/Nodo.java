package Practica.Nodos;

import java.util.ArrayList;

public class Nodo {
    private int value;
    private ArrayList<Nodo> children;

    public Nodo(int val){
        this.value = val;
        this.children = new ArrayList<>();
    }

    public void addChild(Nodo child){
        children.add(child);
    }

    public int sumNodos(){ 
        int total = value;
        for(Nodo child : children){
            total += child.sumNodos();
        }
        return total;
    }
}

