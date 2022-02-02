package BonusOpgave;

public class Youtube {
    private Video[] videos;
    private int videoIndex = 0;
    private int videoIndexAmount = 5;

    public Youtube () {
        videos = new Video[videoIndexAmount];
    }
    public Video searchVideo(String name) {
        for (int y = 0; y < videoIndex; y++) {

            Video video = videos[y];

            if (videos[y].getName().equalsIgnoreCase(name)) {
                return video;
            }


        }
        return null;
    } public void addVideo (Video newVideo){
        videos[videoIndex] = newVideo;
        videoIndex++;
    }

}
