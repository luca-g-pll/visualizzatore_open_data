/*
* singolo pezzo caratterizzato dai propri attributi e dal proprio id specifico (static)
 */
public class Pezzo {

    static int id = 0;
    private String inventario, autore, ambitoCulturale, datazione, titoloPezzo, materiale, immagine;

    //metodi di get del singolo pezzo, ogni pezzo ha un proprio id-int
    public String getAmbitoCulturale() { return ambitoCulturale; }

    public String getAutore() { return autore; }

    public String getDatazione() { return datazione; }

    public String getInventario() { return inventario; }

    public String getImmagine() { return immagine; }

    public String getMateriale() { return materiale; }

    public String getTitoloPezzo() { return titoloPezzo; }

    public static int getId() { return id; }

    //costruttore

    public Pezzo(String inv, String au, String titolo, String data, String mat, String cult, String img){
        inventario = inv;
        autore = au;
        ambitoCulturale = cult;
        datazione = data;

        titoloPezzo = titolo;
        materiale = mat;
        immagine = img;

        id ++;
    }

    //stampa info base del pezzo
    public void stampaBasePezzo(){
        System.out.println("id di salvataggio  :"+ id);
        System.out.println("il pezzo di id : " +this.inventario + " dell'autore : "+autore+" datato : "+datazione);
    }


}

