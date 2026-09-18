import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class Main {
    public static void main(String[] args) throws IOException,  ParseException {

        UrlObject prova;

            prova = new UrlObject("https://gestione.fondazionetorinomusei.it/media/opendata/COLLEZIONI_PALAZZO_MADAMA_marzo2017%20json.json");


        ArticoliEsposti a1 = new ArticoliEsposti();
        a1.readJsonPezzi(prova.getArray());

        new GraphicView().view(a1.getpArray(), a1.getSalvataggioDatiKey());

        /*
        for(int i = 0; i<=20; i++){
             String line = prova.br.readLine();
            System.out.println(line);
        }
        */


    }
}
