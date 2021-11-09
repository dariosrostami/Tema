package com.company;


class Dreptunghi {
    int l1;
    int l2;
    int l3;
    Dreptunghi(int l1, int l2, int l3){
        this.l1 = l1;
        this.l2= l2;
        this.l3 = l3;

    }
    // perimetru - suma celor 4 laturi
    int getPerimetru(){
        return l1+l2+l3;
    }
    public void afisareDreptunghi(){
        System.out.println("Perimetrul este: " + getPerimetru());
    }
}


public class Main {

    public static void main(String[] args) {
	Dreptunghi x;
    x = new Dreptunghi(5, 8, 10);
    x.afisareDreptunghi();
    }
}
