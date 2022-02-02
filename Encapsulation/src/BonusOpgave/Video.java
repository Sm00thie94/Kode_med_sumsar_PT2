package BonusOpgave;

public class Video {
    private String name;
    private int length;
    private int likes;
    private Comment[] comments;
    private int commentIndex = 0;
    private int hours;
    private int minutes;

    public Video (String name, int length, int likes){
        this.name = name;
        this.length = length;
        this.likes = likes;
        comments = new Comment[5];
        videoLengthCalc();

    } public void addComment (Comment newComment){

        comments[commentIndex] = newComment;
        commentIndex++;
    } public void videoLengthCalc () {
        while (length >= 60) {
            minutes++;
            length = length - 60;
            while (minutes >= 60) {
                hours++;
                minutes = minutes - 60;
            }
        }
    } public void lengthWriter () {
        if (hours >= 1){
            System.out.print(hours + " time(r), ");
        } if (minutes >= 1){
            System.out.print(minutes + " minutter, ");
        } if (length >= 1) {
            System.out.print(length + " sekunder.");
        }


    } public void printVideoInfo () {
        System.out.println(name);
        System.out.print("Video duration: ");
        lengthWriter();
        System.out.println();
        System.out.println("Likes: " + likes);
        for (int y = 0; y < commentIndex; y++) {
            Comment comment = comments[y];
            comment.printComment();
            System.out.println();
        }



        } public String getName (){
        return name;
    }

}
