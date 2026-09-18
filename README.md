# Visualizzatore Open Data - Palazzo Madama

Un'applicazione desktop in Java progettata per scaricare, analizzare e visualizzare tramite interfaccia grafica gli Open Data della collezione del museo di Palazzo Madama (Torino).

## 🚀 Funzionalità
* **Connessione API REST:** Scarica dinamicamente il file JSON ufficiale della Fondazione Torino Musei.
* **Parsing JSON:** Utilizza la libreria `json-simple` per mappare i dati grezzi in oggetti Java (`Pezzo`), estraendo metadati come autore, titolo, materiali, datazione e ambito culturale.
* **Interfaccia Grafica (GUI):** Costruita in Java Swing, presenta gli articoli esposti in una finestra interattiva basata sugli identificativi (Inventario) di ogni singola opera.

## 🛠️ Tecnologie Utilizzate
* **Linguaggio:** Java
* **Interfaccia Grafica:** Java Swing / AWT
* **Librerie Esterne:** `json-simple.jar` (per il parsing del JSON)

## 📁 Struttura del codice
* `Main.java`: Entry point dell'applicazione.
* `UrlObject.java`: Gestisce la connessione HTTP e il download del JSON.
* `ArticoliEsposti.java`: Si occupa di ciclare l'array JSON e instanziare i singoli pezzi.
* `Pezzo.java`: Classe modello (POJO) che rappresenta la singola opera d'arte.
* `GraphicView.java`: Gestisce le finestre (JFrame) e le interazioni dell'utente.

## ⚙️ Come eseguire il progetto
1. Assicurati di avere il [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/downloads/) installato.
2. Assicurati di includere la libreria `json-simple.jar` nel Build Path del tuo IDE (es. IntelliJ IDEA o Eclipse).
3. Esegui la classe `Main.java`.
