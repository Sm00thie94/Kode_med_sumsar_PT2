public class TwitchStream {
    private String channelName;
    private int followers;
    private int subs;
    private boolean live;

    public TwitchStream (String channelName, int followers, int subs, boolean live) {
        this.channelName = channelName;
        this.followers = followers;
        this.subs = subs;
        this.live = live;
    }
    public String getChannelName () {
        return channelName;
    }
    public int getFollowers () {
        return followers;
    }
    public int getSubs () {
        return subs;
    }
    public boolean getLive () {
        return live;
    }
    public void setFollowers (int followers){
        this.followers = followers;
    }
    public void setSubs (int subs){
        this.subs = subs;
    }
    public void setLive (boolean live){
        this.live = live;
    }
    public void printStreamInfo(){
        System.out.println("Your channel name is: " + channelName);
        System.out.println("Your follower count is: " + followers);
        System.out.println("Your subscriber count is: " + subs);
        if (live){
            System.out.println("You are currently Live");
        }   else {
            System.out.println("You are currently not live");
        }
    }
}
