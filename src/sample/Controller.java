package sample;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.fxml.FXML;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;




public class Controller {
    // creating references to the images
    private final static Image img0 =  new Image(sample.Controller.class.getResource("frame0.gif").toString());
    private final static Image img1 =  new Image(sample.Controller.class.getResource("frame1.gif").toString());
    private final static Image img2 =  new Image(sample.Controller.class.getResource("frame2.gif").toString());
    private final static Image img3 =  new Image(sample.Controller.class.getResource("frame3.gif").toString());
    private final static Image img4 =  new Image(sample.Controller.class.getResource("frame4.gif").toString());
    private final static Image img5 =  new Image(sample.Controller.class.getResource("frame5.gif").toString());
    private final static Image img6 =  new Image(sample.Controller.class.getResource("frame6.gif").toString());
    private final static Image img7 =  new Image(sample.Controller.class.getResource("frame7.gif").toString());
    private final static Image img8 =  new Image(sample.Controller.class.getResource("frame8.gif").toString());
    private final static Image img9 =  new Image(sample.Controller.class.getResource("frame9.gif").toString());
    private final static Image img10 =  new Image(sample.Controller.class.getResource("frame10.gif").toString());
    private final static Image img11 =  new Image(sample.Controller.class.getResource("frame11.gif").toString());
    //creating an instance of the music file with it's location
    private final static Media music = new Media(sample.Controller.class.getResource("musictech.mp3").toString());


    //creating a media player to play the music
    private MediaPlayer mediaPlayer = new MediaPlayer(music);

    // creating a timeline to store keyframes for animation
    private Timeline timeline= new Timeline();
    private double rate = 1;


    @FXML
    public BorderPane bPane;
    public ImageView view;



    public void initialize(){

        //Creating all the keyframes and when they appear on the timeline
        KeyFrame io0 = new KeyFrame(Duration.millis(333.3), t -> view.setImage(img0));
        KeyFrame io1 = new KeyFrame(Duration.millis(666.6), t -> view.setImage(img1));
        KeyFrame io2 = new KeyFrame(Duration.millis(1000), t -> view.setImage(img2));
        KeyFrame io3 = new KeyFrame(Duration.millis(1333.3), t -> view.setImage(img3));
        KeyFrame io4 = new KeyFrame(Duration.millis(1666.6), t -> view.setImage(img4));
        KeyFrame io5 = new KeyFrame(Duration.millis(2000), t -> {
            view.setImage(img5);

        });
        KeyFrame io6 = new KeyFrame(Duration.millis(2333.3), t -> {
            view.setImage(img6); });
        KeyFrame io7 = new KeyFrame(Duration.millis(2666.6), t -> {
            view.setImage(img7);

        });
        KeyFrame io8 = new KeyFrame(Duration.millis(3000), t -> {
            view.setImage(img8);

        });
        KeyFrame io9 = new KeyFrame(Duration.millis(3333.3), t -> {
            view.setImage(img9);

        });
        KeyFrame io10 = new KeyFrame(Duration.millis(3666.6), t -> {
            view.setImage(img10);

        });
        KeyFrame io11 = new KeyFrame(Duration.millis(4000), t -> {
            view.setImage(img11);

        });


        // Changing settings on the timline
        timeline.setCycleCount(Timeline.INDEFINITE);
        //Adding all the keyframes to the timline
        timeline.getKeyFrames().addAll(io0,io1,io2,io3,io4,io5,io6,io7,io8,io9,io10,io11);
        timeline.setRate(1);
        timeline.play();
        mediaPlayer.play();
        timeline.pause();
        mediaPlayer.pause();




    }

//play button connected in the fxml that check if it is playing or paused then changes the setting
public void playButton(){
        if(timeline.getStatus()==Timeline.Status.PAUSED){
            mediaPlayer.play();
            timeline.play();}
        else if(timeline.getStatus()==Timeline.Status.RUNNING){
            timeline.pause();
            mediaPlayer.pause();
        }

}
// allows the image to play in reverse.
public void reverse(){
    if(timeline.getRate()!=0){rate = -rate; timeline.setRate(rate);}


}
//Actions to increase or decrease the rate
public void increment(){
        if(rate>0){rate++;}
        if(rate<=-1){rate--;}
        timeline.setRate(rate);
    }
public void increment2(){
    if(rate>0){rate++;rate++;}
    if(rate<=-1){rate--;rate--;}
    timeline.setRate(rate);

}public void decrement(){
    if(rate>1){rate--;}
    if(rate<-1){rate++;}
    timeline.setRate(rate);
}public void decrement2(){
    if(rate>2){rate--;rate--;}
    if(rate<-2){rate++;rate++;}
    timeline.setRate(rate);
}


public void exit(){
    Platform.exit();
}

}

