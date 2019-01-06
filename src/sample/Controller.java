package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.animation.AnimationTimer;
import javafx.scene.control.Button;

public class Controller {
    int counter = 0;
    @FXML
    private Button clicker;
    public void pressButton()
    {
      counter++;
    }

}
