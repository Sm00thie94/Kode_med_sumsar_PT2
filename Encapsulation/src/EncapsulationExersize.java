import BonusOpgave.Comment;
import BonusOpgave.Video;
import BonusOpgave.Youtube;
import opgave14.Human;
import opgave14.Player;
import opgave14.TwitchStream;

import java.util.Scanner;

public class EncapsulationExersize {
    public static void main(String[] args) {
        Comment comment1 = new Comment("sumsar1812", "nice video");
        Comment comment2 = new Comment("Chris", "Vild video");

        Video video = new Video("Learning java", 120, 3);
        video.addComment(comment1);
        video.addComment(comment2);

        Video video2 = new Video("Learning python", 3665, 0);
        video2.addComment(new Comment("sumsar1812", "ad python"));

        Youtube youtube = new Youtube();
        youtube.addVideo(video);
        youtube.addVideo(video2);


        System.out.println("Velkommen til youtube");
        Scanner scanner = new Scanner(System.in);

        String input = "";
        while (true) {
            System.out.println("Søg efter video: ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            Video foundVideo = youtube.searchVideo(input);
            if (foundVideo == null) {
                System.out.println("Videoen med det navn blev ikke fundet");
            } else {
                foundVideo.printVideoInfo();
            }

        }








    } public static void opgave_14 () {
        Human me = new Human("Gustav", 1908051111, 16);
        me.setAge(16);
        me.setCpr(1908051111);
        me.setName("Gustav");

        me.printInfo();
    } public static void opgave_14_1 () {
        TwitchStream sm00th94 = new TwitchStream("Sm00th94", 52, 6,true);

        sm00th94.setFollowers(102);
        sm00th94.setLive(true);
        sm00th94.setSubs(7);

        sm00th94.printStreamInfo();
    } public static void opgave_14_2 () {
        Player sumsar = new Player("Sumsar", 20, 20,1);
        System.out.println("Velkommen til verden Sumsar!");
        System.out.println("Du spawner med " + sumsar.getHp() + " HP");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Shit man! du blev bidt af en slange!");
        sumsar.loseHP(2);
        if (sumsar.getHp() <= 0) {
            return;
        }
        System.out.println("Du mistede noget hp til slangen! du har nu kun " + sumsar.getHp() + " hp tilbage");
        System.out.println();
        sumsar.healHP(1);
        System.out.println("Du blev tilbragt det nærmeste hospital, og blev dermed healet. Du har nu " +sumsar.getHp() + " hp tilbage" );
        sumsar.healHP(100);
        System.out.println("Overnat blev du healet til max HP. Du har nu " +sumsar.getHp() + " hp tilbage");
    }

}
