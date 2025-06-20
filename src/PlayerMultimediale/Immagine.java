package PlayerMultimediale;

import entities.Luminosita;
import entities.Show;

public class Immagine extends Multimediale implements Luminosita, Show {

    private int luminosita;

    public Immagine(String titolo, int luminosita){
        super(titolo);
        this.luminosita = luminosita;
    }

    @Override
    public void show(){
        System.out.println(titolo);
        for (int i = 0; i < luminosita; i++){
            System.out.print("!");
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

    @Override
    public String toString() {
        return "Immagine { " +
                "titolo ='" + titolo + '\'' + "luminosità =" + luminosita +
                '}';
    }

}
