package sample;

import java.util.List;

public class Balken {

    public List<Figur> figurenambalken;
    public List<Balken> balkenambalken;
    public int massedesbalkens;
    public float Aufnahmestelle;
    public int balkenindex;

    public void hinzufuegenEinerFigur(Figur newfigur){
        figurenambalken.add(newfigur);
    }

    public void hinzuefuegenEinesBalkens(Balken newbalken){
        balkenambalken.add(newbalken);
    }

    public void masseBerechnen(){
        int gesamtMasse = 0;
        for (Figur figur: figurenambalken) {
            gesamtMasse += figur.masse;
        }
        for (Balken balken: balkenambalken) {
            gesamtMasse += balken.massedesbalkens;
        }

    }


}
