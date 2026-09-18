/*
*
*/
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
//

public class UrlObject {

    private JSONArray objArray = new JSONArray();

    public UrlObject(String u) throws IOException, ParseException {
        URL url = new URL(u);

        URLConnection urlC = url.openConnection();//apre la connessione al url
        //legge ininput le stringhe prese dall'url
        BufferedReader bf  = new BufferedReader(new InputStreamReader(urlC.getInputStream()));

        StringBuilder sb = new StringBuilder();//stringa di grandi dimensioni
        String s1;

        while((s1 = bf.readLine())!= null){ sb.append(s1); }//il ciclo legge tutti i valori fino a qunado non terminano

        bf.close();//chiude il buffered reader

        JSONParser parser = new JSONParser(); //converte in JSONObject


        objArray = (JSONArray) parser.parse(sb.toString()); // cast di tipo per prendere il JsonArry
        //System.out.println(sb.toString());
        
    }

    public JSONArray getArray() {
        return objArray;
    }






}

    /*
    private Object createJsonSavement(){
        try {
            Object obj = parser.parse(new FileReader("passeggeri.json")); //new fileReader rturn un obj generico

            JSONObject jsonobject = (JSONObject) obj; //cast di obj
            //System.out.println(jsonObject); //stampa tutto il file json
            JSONArray list = (JSONArray)jsonobject.get("passeggeri");

            //carico tutti gli oggetti persona all'interno del vagone effettivo all'inizio dell'exe
            for (Object o : list) {//prendo ogni obj della lista = singoli passeggeri
                JSONObject j = (JSONObject) o;

                String name = (String) j.get("name");
                String surname = (String) j.get("surname");
                String cf = (String) j.get("cf");
                String nascita = (String) j.get("nascita");

                Passengers pLoad = new Passengers(name,surname,cf,nascita);

                passeggeri.add(pLoad);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            throw new RuntimeException(e);
        }
    }
*/

    /*
    public static String stream(URL url) {
    try (InputStream input = url.openStream()) {
        InputStreamReader isr = new InputStreamReader(input);
        BufferedReader reader = new BufferedReader(isr);
        StringBuilder json = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            json.append((char) c);
        }
        return json.toString();
    }
     */

    /*

    public static JSONObject getJson(URL url) {
    String json = IOUtils.toString(url, Charset.forName("UTF-8"));
    return new JSONObject(json);
}
     */

/* ex costruttore iniziale

 */
    
