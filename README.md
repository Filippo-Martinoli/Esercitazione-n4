# Gestione Brani Musicali 

## Descrizione

Questo progetto Java permette di salvare e leggere informazioni su brani musicali.  
Ogni brano è rappresentato dalla classe Brano che contiene dati come:
- ID del brano  
- Titolo  
- Cantante  
- Durata  
- Anno di pubblicazione  
- Numero di ascolti  
- Numero di like  

## Funzionamento

- La classe Scrittore converte uno o più oggetti Brano in JSON e li salva su file
- La classe Lettore legge il file JSON e mostra i dati a schermo
- La scrittura e la lettura vengono gestite tramite thread diversi
- È incluso anche un countdown prima dell’inserimento dei dati

## Obiettivi

Il progetto ha lo scopo di:
- Gestire file JSON in Java 
- Utilizzare il multithreading per la lettura e scrittura dei file
  
## Funzionalità aggiuntive

- Gestione di più brani contemporaneamente tramite una lista
- Lettura dei file sia con BufferedReader che con Gson

## File generati

Il programma crea un file Musica.json contenente i dati dei brani inseriti dall’utente e permette di leggerli successivamente tramite thread diversi.

## Crediti

Per creare questo progetto mi sono ispirato all’esempio fornito dal Prof. Amendola e ho ricevuto consigli dalla Professoressa Ciuchetti.
