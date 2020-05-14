public class frage {
    static Boolean joker_status = true; //Klassenvariablen -> Joker noch vorhanden?
    static int punkte = 0;  // Klassenvariable -> Punktekonto
    static int nummer = 0;  // -> aktuelle Frage Nr.
    private int position;  // Instanzvariable -> Position der richtigen Antwort
    private String[] ausgabe = new String[5]; // -> String Array für Manipulation der Ausgabe (Joker)
    private int eingabe_position;  // -> Position der eingegebenen Antwort

    public frage(String frage, String a, String b, String c, String d, int position) { //Konstruktor
        this.position = position;  // initialisieren der Instanzvariablen
        this.ausgabe[0] = frage;  // Instanz-Array -> Frage
        this.ausgabe[1] = a;  // -> Antworten a bis d
        this.ausgabe[2] = b;
        this.ausgabe[3] = c;
        this.ausgabe[4] = d;
        nummer++; // Zählen der generierten Instanzen
    }

    public String[] gibAusgabe() {
        return this.ausgabe;
    }

    static void gibAufBildschirmAus(String[] ausgabe) {  // Klassenmethode
        String[] anz = {"Frage: ", "a: ", "b: ", "c: ", "d: "};
        for (int i = 0; i <= 4; i++) {
            System.out.print(anz[i]);
            System.out.println(ausgabe[i]);
        }
    }

    public void joker(boolean nimmt_joker) {
        if (nimmt_joker) {
            joker_status = false;
        }
        return;
    }

    public boolean evaluieren(String eingabe) {
        switch (eingabe) {
            case "a":
                this.eingabe_position = 1;
                break;
            case "b":
                this.eingabe_position = 2;
                break;
            case "c":
                this.eingabe_position = 3;
                break;
            case "d":
                this.eingabe_position = 4;
                break;
        }

        if (this.eingabe_position == this.position) {
            punkte++;
            System.out.println(ausgabe[position]);
            System.out.println("Richtig!");
            return true;
        } else {
            System.out.println("Falsch!");
            return false;
        }
    }

    static void auswertung() {  // Klassenmethode
        String bewertung = "Du hast " + Integer.toString(punkte) + " von 10 möglichen Punkten!";
        System.out.println(bewertung);
        if (punkte >= 9) {
            System.out.println("Du bist sehr intelligent!");
        } else if (punkte <= 9 && punkte >= 6) {
            System.out.println("Du bist schlau!");
        } else if (punkte < 6) {
            System.out.println("Du bist dumm!");
        }
    }

    static boolean gib_Jokerstatus() {  // Klassenmethode
        return joker_status;
    }

    static int gib_Nummmer() {  // Klassenmethode
        return nummer;
    }
}




