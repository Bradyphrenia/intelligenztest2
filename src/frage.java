public class frage {


    static Boolean joker_status = true; //Klassenvariablen
    static int punkte = 0;
    static int nummer = 0;

    private String antwort_a; //Instanzvariablen
    private String antwort_b;
    private String antwort_c;
    private String antwort_d;
    private String frage;
    private int position;
    private String[] ausgabe = new String[5];
    private int eingabe_position;

    public frage(String _frage, String a, String b, String c, String d, int position) { //Konstruktor
        this.antwort_a = a;
        this.antwort_b = b;
        this.antwort_c = c;
        this.antwort_d = d;
        this.frage = _frage;
        this.position = position;
        nummer++;
        this.ausgabe[0] = this.frage;
        this.ausgabe[1] = this.antwort_a;
        this.ausgabe[2] = this.antwort_b;
        this.ausgabe[3] = this.antwort_c;
        this.ausgabe[4] = this.antwort_d;
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




