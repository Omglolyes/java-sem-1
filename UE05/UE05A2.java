package UE05;

import java.util.Scanner;

public class UE05A2 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Monat ein: ");
        String monat = sc.nextLine();
        System.out.println(monat);
        AnzahlDerMonatstage(monat);

        sc.close();
    }

    public static void MonatsString(String monat, int tage) {
        System.out.println(monat + " hat " + tage + " tage.");
    }

    public static void AnzahlDerMonatstage(String monat) throws Exception{
        int ungerade = 31;
        int gerade = 30;
        int februar = 28;
        // System.out.println(monat);

        switch (monat) {
            // Februar mit 28 Tagen
            case "Februar":
                MonatsString(monat, februar);
                break;
            // Alle Monate mit 31 Tagen
            case "Januar":
            case "März":
            case "Maerz":
            case "Mai":
            case "Juli":
            case "August":
            case "Oktober":
            case "Dezember":
                MonatsString(monat, ungerade);
                break;
            // Alle Monate mit 30 Tagen
            case "April":
                System.out.println("Es ist frühling.");
            case "Juni":
            case "September":
            case "November":
                MonatsString(monat, gerade);
                break;
                
            default:
                System.out.println("Falls Sie 'März' wissen möchten, versuchen Sie es mit 'Maerz'.");
                throw new Exception("Bitte geben Sie einen gültigen Monat ein");
        }
    }
}
