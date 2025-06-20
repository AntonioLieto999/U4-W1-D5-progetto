package PlayerMultimediale;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Multimediale[] multi = new Multimediale[5];

        for (int i = 0; i < 5; i++){
            System.out.println("arriva l'elemento " + (i + 1));
            System.out.println("scegli cosa creare: 1 = immagine, 2 = registrazione, 3 = video");
            int choose = scanner.nextInt();

            scanner.nextLine();



            switch (choose) {
                case 1:
                    System.out.println("titolo: ");
                    String titolo = scanner.nextLine();
                    System.out.println("luminosità: ");
                    int luminosita = Integer.parseInt(scanner.nextLine());
                    multi[i] = new Immagine(titolo,luminosita);
                    break;
                case 2:
                    System.out.println("titolo: ");
                    String titolo2 = scanner.nextLine();
                    System.out.println("durata: ");
                    int durataAudio = Integer.parseInt(scanner.nextLine());
                    System.out.println("volume: ");
                    int volumeAudio = Integer.parseInt(scanner.nextLine());
                    multi[i] = new Registrazione(titolo2, durataAudio, volumeAudio);
                case 3:
                    System.out.println("titolo: ");
                    String titolo3 = scanner.nextLine();
                    System.out.println("durata: ");
                    int durataVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("volume");
                    int volumeVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("luminosità");
                    int luminostistaVideo = Integer.parseInt(scanner.nextLine());
                    multi[i] = new Video(titolo3, durataVideo, volumeVideo, luminostistaVideo);
                    break;
                default:
                    System.out.println("error");
            }
            scanner.nextLine();
        }
    }
}
