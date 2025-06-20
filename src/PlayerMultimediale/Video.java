package PlayerMultimediale;

import entities.Luminosita;
import entities.Play;
import entities.Show;
import entities.Volume;

public class Video extends Multimediale implements Play, Volume, Luminosita, Show {
    public int durata;
    public int volume;
    public int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita){
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++){
            System.out.println(titolo);
            for (int j = 0; j < luminosita; j++){
                System.out.println("!");
                for(int h = 0; h < volume; h++){
                    System.out.println("*");
                }
            }
        }
    }
    @Override
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

    @Override
    public void volumeUp() {
        volume++;
    }
    @Override
    public void volumeDown() {
        if(volume > 0){
            volume--;
        }
    }
}
