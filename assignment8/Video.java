package assignment8;

public class Video {
    String videoId;
    String title;
    int views;
    int likes;
    int totalVideos;
    void setVideoId(String videoId){
        this.videoId=videoId;
    }
    void setTitle(String title){
        this.title=title;
    }
    void setViews(int views){
        this.views=views;
    }
    void setLikes(int likes){
        this.likes=likes;
    }
    void setTotalVideos(int totalVideos){
        this.totalVideos=totalVideos;
    }
    String getVideoId(){
        return videoId;
    }
    String getTitle(){
        return title;
    }
    int getViews(){
        return views;
    }
    int getLikes(){
        return likes;
    }
    int getTotalVideos(){
        return totalVideos;
    }
}
class ShowVideoResult{
    public static void main(String [] args){
        Video v1=new Video();
        v1.setVideoId("658ryiwreh876");
        String id=v1.getVideoId();
        System.out.println("video id is  = " +id);
        v1.setTitle("life learning");
        String title=v1.getTitle();
        System.out.println("video title is  = " +title);
        v1.setLikes(56);
        int like=v1.getLikes();
        System.out.println("videos likes are = " +like);
        v1.setViews(46583427);
        int view=v1.getViews();
        System.out.println("videos views are = " +view);
        v1.setTotalVideos(575);
        int total_video=v1.getTotalVideos();
        System.out.println("total videos are = " +total_video);
    }
}