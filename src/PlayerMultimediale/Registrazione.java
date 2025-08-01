package PlayerMultimediale;

import entities.Play;
import entities.Volume;

public class Registrazione extends Multimediale implements Play, Volume {

    private int durata;
    private int volume;

    public Registrazione(String titolo, int durata, int volume){
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    @Override
    public void play() {
        for (int i = 0; i <volume; i++){
            System.out.print("!");
            for (int j = 0; j < durata; j++){
                System.out.print(titolo);
            }
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

    @Override
    public String toString() {
        return "Registrazione { " + "titolo =" + titolo +
                ", durata =" + durata +
                ", volume =" + volume +
                '}';
    }
}
