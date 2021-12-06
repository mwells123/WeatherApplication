package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.FileWriter;
import java.io.IOException;

public class LoginController {

    @FXML
    private Button Newark;

    @FXML
    void NewarkButtonPressed(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("Newark.fxml");
    }

}