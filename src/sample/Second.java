package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Second implements Initializable {

    @FXML
    private Text Location;

    @FXML
    private TableColumn<weather, String> newarkDate;

    @FXML
    private TableColumn<weather, Integer> newarkHigh;

    @FXML
    private TableColumn<weather, Integer> newarkHumidity;

    @FXML
    private TableColumn<weather, Integer> newarkLow;

    @FXML
    private TableView newarkWeather;

    @FXML
    private TableColumn<weather, Integer> newarkWind;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        newarkDate.setCellValueFactory(new PropertyValueFactory<weather, String>("Date"));
        newarkHigh.setCellValueFactory(new PropertyValueFactory<weather, Integer>("highTemp"));
        newarkLow.setCellValueFactory(new PropertyValueFactory<weather, Integer>("lowTemp"));
        newarkWind.setCellValueFactory(new PropertyValueFactory<weather, Integer>("WindSpeed"));
        newarkHumidity.setCellValueFactory(new PropertyValueFactory<weather, Integer>("Humidity"));


    }

    class weather {
        private String Date;
        private int highTemp;
        private int lowTemp;
        private int Humidity;
        private int WindSpeed;

        weather(String Date, int highTemp, int lowTemp, int Humidity, int WindSpeed) {
            this.Date = Date;
            this.highTemp = highTemp;
            this.lowTemp = lowTemp;
            this.Humidity = Humidity;
            this.WindSpeed = WindSpeed;
        }

        public void setDate(String Date) {
            this.Date = Date;
        }

        public void sethighTemp(int highTemp) {
            this.highTemp = highTemp;
        }

        public void setlowTemp(int lowTemp) {
            this.lowTemp = lowTemp;
        }

        public void setHumidity(int Humidity) {
            this.Humidity = Humidity;
        }

        public void setWindSpeed(int WindSpeed) {
            this.WindSpeed = WindSpeed;
        }

        public String getDate() {
            return Date;
        }

        public int gethighTemp() {
            return highTemp;
        }

        public int getlowTemp() {
            return lowTemp;
        }

        public int getHumidity() {
            return Humidity;
        }

        public int getWindSpeed() {
            return WindSpeed;
        }
    }
}
