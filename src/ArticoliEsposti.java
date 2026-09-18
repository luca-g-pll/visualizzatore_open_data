import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
public class ArticoliEsposti{


    Pezzo p;
    private  ArrayList<Pezzo> pArray  = new ArrayList<Pezzo>();

    private String[] salvataggioDatiKey;

    public void readJsonPezzi(JSONArray array){
        int i  = 0;

        this.salvataggioDatiKey = new String[array.size()];

        //carico tutti gli oggetti persona all'interno del vagone effettivo all'inizio dell'exe
        for (Object obj : array) {//prendo ogni obj della lista = singoli passeggeri
            JSONObject j = (JSONObject) obj;

            String inventario = (String) j.get("Inventario");//id.del pezzo esposto
            this.salvataggioDatiKey[i] = " inventario : "+ inventario;

            String autore = (String) j.get("Autore");
            this.salvataggioDatiKey[i] += " | autore : "+ autore;

            String ambitoCulturale = (String) j.get("Ambito culturale");//periodo che rappresenta
            this.salvataggioDatiKey[i] += " | ambito culturale : "+ ambitoCulturale;

            String datazione = (String) j.get("Datazione");
            this.salvataggioDatiKey[i] += " | datazione : "+ datazione;

            String titoloPezzo = (String) j.get("Titolo-soggetto");
            this.salvataggioDatiKey[i] += " | titolo soggetto : "+ titoloPezzo;

            String materiale = (String) j.get("Materiali");
            this.salvataggioDatiKey[i] += " | materiali : "+ materiale;

            String immagine = (String) j.get("Immagine");//immagine che mostra il pezzo
            this.salvataggioDatiKey[i] += " | immagine : "+ immagine;

            p = new Pezzo(inventario, autore, titoloPezzo, datazione, materiale, ambitoCulturale, immagine);

            pArray.add(p);

            i++;

            //p.stampaBasePezzo();
        }
    }

    public String[] getSalvataggioDatiKey() {
        return salvataggioDatiKey;
    }

    public ArrayList<Pezzo> getpArray() {
        return pArray;
    }
}