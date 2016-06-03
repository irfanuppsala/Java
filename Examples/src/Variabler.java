import java.util.Scanner;
import java.lang.String;

public class Variabler {

    public static void main(String[] args) {

        new Variabler().atm();
        //new Variabler().misc();
    }

    public void miscellaneous()
    {
        String name;
        System.out.println("Vad heter du?");
        Scanner sc2 = new Scanner(System.in);
        name = sc2.nextLine();
        System.out.println("Hej " + name + ", välkommen! \n");

        System.out.println("\n");
        int tal = 0;
        Scanner sc4 = new Scanner(System.in);

        while (tal != 10)  {
            System.out.println("Skriv ett tal");
            tal = sc4.nextInt();
        }
        System.out.println("Rätt talet var " + tal);
    }

    public void atm()
    {
        int konto = 10000; // Tilldela 10000 till variabeln Konto och variabeltypen  är heltal
        int sättIn = 0;    // Lagra värde värde innan du lägger på kontot
        int uttag = 0;     // Lagra värde värde före avdrag från kontot
        int val;           // Variabel att lagra switch fall värde

        System.out.println("1. Sätt in pengar");
        System.out.println("2. Ta ut pengar");
        System.out.println("3. Visa saldo");
        System.out.println("4. Avsluta");
        System.out.println("\n");

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Välj en siffra mellan 1 och 4");
        val = sc3.nextInt();

        switch (val) {
            case 1:
                System.out.println("Hur mycket pengar vill du sätt in i ditt konto?");
                Scanner add = new Scanner(System.in);
                sättIn = add.nextInt();
                konto = konto + sättIn;
                break;
            case 2:
                System.out.println("Hur mycket vill du ta ut?");
                Scanner sub = new Scanner(System.in);
                uttag = sub.nextInt();
                if(uttag>konto)
                {
                    System.out.println("Tyvärr, Du kan inte ta ut mer än ditt konto");
                    System.out.println("Hur mycket vill du ta ut?");
                    Scanner sub2 = new Scanner(System.in);
                    uttag = sub2.nextInt();
                    if(uttag<konto)
                    {
                        konto = konto - uttag;
                        System.out.println("Uttaget är på " + uttag + " kr");
                        System.out.println("Det nya saldot är " + konto + " kr");
                    }
                }
                else
                {
                    konto = konto - uttag;
                    System.out.println("Uttaget är på " + uttag + " kr");
                    System.out.println("Det nya saldot är " + konto + " kr");
                }
                break;
            case 3:
                System.out.println("Ditt saldo är " + konto);
                break;
            case 4:
                System.out.println("Tack för din tid.");
                break;
            default:
                System.out.println("");
                break;
        }
    }
}
