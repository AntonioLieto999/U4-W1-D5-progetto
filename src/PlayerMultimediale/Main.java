package PlayerMultimediale;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Multimediale[] multi = new Multimediale[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("arriva l'elemento:");
            System.out.println("scegli cosa creare: scrivi 1 2 o 3");
            String choose = String.valueOf(scanner.nextInt());



            switch (choose) {
                case "1":
                    System.out.println("titolo dell'immagine: ");
                    String titolo = scanner.nextLine();
                    System.out.println("luminosità dell'immagine: ");
                    int luminosita = Integer.parseInt(scanner.nextLine());
                    multi[i] = new Immagine(titolo, luminosita);
                    break;
                case "2":
                    System.out.println("titolo della registrazione: ");
                    String titolo2 = scanner.nextLine();
                    System.out.println("durata della registrazione: ");
                    int durataAudio = Integer.parseInt(scanner.nextLine());
                    System.out.println("volume della registrazione: ");
                    int volumeAudio = Integer.parseInt(scanner.nextLine());
                    multi[i] = new Registrazione(titolo2, durataAudio, volumeAudio);
                case "3":
                    System.out.println("titolo del video: ");
                    String titolo3 = scanner.nextLine();
                    System.out.println("durata del video: ");
                    int durataVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("volume del video: ");
                    int volumeVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("luminosità del video: ");
                    int luminostistaVideo = Integer.parseInt(scanner.nextLine());
                    multi[i] = new Video(titolo3, durataVideo, volumeVideo, luminostistaVideo);
                    break;
                default:
                    System.out.println("error");
            }

        }
        for (Multimediale elemento : multi) {
            System.out.println(elemento);
        }
        scanner.close();
    }
}
