package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        /*Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/

        Einlesen einlesen = new Einlesen();
        einlesen.eingabeDerKoerper();

        Auswerten auswerten = new Auswerten();
        auswerten.Berechnung(einlesen.getGewichteDerKoerper());

        
    }


    public static void main(String[] args) {
        launch(args);
    }

}
