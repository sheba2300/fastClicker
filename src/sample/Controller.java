package sample;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.animation.AnimationTimer;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Timer;
import java.util.TimerTask;

public class Controller {
    int counter = 0;
    @FXML
    private ImageView clicker;
    @FXML
    private Button start;
    @FXML
    private Label countDisplay;
    boolean canPlay = false;
    int highScore = 0;



        public void startGame()
        {
            //checks to see if change is in session
            //once button is clicked timer starts and each click counted using the counter varible
            //once Timer is down the count is displayed and compared with best score
            if(!canPlay) {
                counter = 0;
                canPlay = true;
                start.setText(" Goo!");
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(10), ev -> {
                    canPlay = false;
                    countDisplay.setText("  Your final score is " + counter + " BEST: " + highScore);
                    if (highScore < counter) {
                        highScore = counter;
                    }
                    start.setText("Start");
                }
                ));
                timeline.play();
            }
        }
        public void pressButton()
    {//increments the counter and updates the display
       if(canPlay) {
           counter++;
           countDisplay.setText("  SCORE: " + counter + " BEST: " + highScore);
       }
    }

}
