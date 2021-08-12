package sample;

import javafx.application.Application;
import javafx.scene.control.TextInputDialog;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Einlesen {

    List<Integer> gewichteDerKoerper = new ArrayList<Integer>();

    public void eingabeDerKoerper() {
        boolean abgrochen = false;
        do {
            TextInputDialog Gewichteingabe = new TextInputDialog();
            Optional<String> result = Gewichteingabe.showAndWait();

            if (!result.get().equals("")) {
                gewichteDerKoerper.add(Integer.parseInt(result.get()));
            } else {
                abgrochen = true;
            }
            ;
        } while (abgrochen == false);
    }

    public List<Integer> getGewichteDerKoerper() {
        return gewichteDerKoerper;
    }

    public void setGewichteDerKoerper(List<Integer> gewichteDerKoerper) {
        this.gewichteDerKoerper = gewichteDerKoerper;
    }

}
