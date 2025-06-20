package PlayerMultimediale;

import entities.Luminosita;

public class Immagine extends Multimedia implements Luminosita {

    private int luminosita;

    public Immagine(String titolo, int luminosita){
        super(titolo);
        this.luminosita = luminosita;
    }

    public void show(){
        System.out.println(titolo);
        for (int i = 0; i < luminosita; i++){
            System.out.println("!");
        }
    }
    @Override
    public void luminositaUp() {
        luminosita++;
    }

    @Override
    public void luminositaDown(){
        if (luminosita > 0) {
            luminosita--;
        }
    }
}
