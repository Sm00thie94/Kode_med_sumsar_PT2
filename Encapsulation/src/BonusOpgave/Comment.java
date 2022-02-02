package BonusOpgave;

public class Comment {
    private String user;
    private String content;

    public Comment (String user, String content) {
        this.user = user;
        this.content = content;
    } public void printComment () {
        System.out.println("Bruger: " + user);
        System.out.println();
        System.out.println(content);
    }

}
