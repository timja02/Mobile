package sample;

import java.util.ArrayList;
import java.util.List;

public class Auswerten {

    List<Integer> gewichteDerKoerper = new ArrayList<Integer>();
    private int anzahlDerBalken;
    private int anzahlDerFigurenbalken;
    private int anzahlDerTr├ĄgerBalken;

    public void Berechnung(List<Integer> gewichtederkoerper) {
        BerechnungDerFigurenbalken(gewichtederkoerper);
        BerechnungDerTr├Ągerbalken();
    }

    public void BerechnungDerFigurenbalken(List<Integer> gewichtederkoerper){
        gewichteDerKoerper=gewichtederkoerper;

        anzahlDerBalken= (int) Math.ceil((float) gewichtederkoerper.size() / 4);
    }

    public void BerechnungDerTr├Ągerbalken(){

    }
}
