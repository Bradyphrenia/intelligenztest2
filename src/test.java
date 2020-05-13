public class test {
    public static void main(String[] args) {
        String[] anzeige = new String[5];
        frage nummer1 = new frage("Wie ist die Augenfarbe von Üja?", "blau", "grün", "braun", "bunt", 2);
        System.out.print("Nummer: ");
        System.out.println(frage.gib_Nummmer());

        nummer1.joker(false);
        anzeige = nummer1.aufruf();
        System.out.println(anzeige[0]);
        if (nummer1.gib_Jokerstatus()) {
            System.out.println("Es gibt noch einen Joker!");
        } else {
            System.out.println("Joker verbraucht!");
        }

        nummer1.evaluieren("b");
        frage.auswertung();


        frage nummer2 = new frage("Wie ist die Augenfarbe von Mama?", "blau", "grün", "braun", "bunt", 2);
        System.out.print("Nummer: ");
        System.out.println(frage.gib_Nummmer());

        nummer2.joker(false);
        anzeige = nummer2.aufruf();
        System.out.println(anzeige[0]);
        if (nummer2.gib_Jokerstatus()) {
            System.out.println("Es gibt noch einen Joker!");
        } else {
            System.out.println("Joker verbraucht!");
        }

        nummer2.evaluieren("b");
        frage.auswertung();


        frage nummer3 = new frage("Wie ist die Augenfarbe von Papa?", "blau", "grün", "braun", "bunt", 1);

        System.out.print("Nummer: ");
        System.out.println(frage.gib_Nummmer());

        nummer3.joker(false);
        anzeige = nummer3.aufruf();
        System.out.println(anzeige[0]);
        if (nummer3.gib_Jokerstatus()) {
            System.out.println("Es gibt noch einen Joker!");
        } else {
            System.out.println("Joker verbraucht!");
        }

        nummer3.evaluieren("a");
        frage.auswertung();


    }
}
