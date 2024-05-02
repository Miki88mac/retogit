import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Calendar cal = GregorianCalendar.getInstance();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year;
        int month;
        int day = 1;
        int dia;

        System.out.println("Introduzca el año:");
        year = scn.nextInt();

        System.out.println("Introduzca el mes:");
        month = scn.nextInt() - 1;

        scn.close();

        cal.set(year, month, day);

        int diaUltimo = diaUltimoMes();
        int diaPrimero = diaPrimeroMes();
        String nombreMes = calcularNombreMes();

        Calendario(diaPrimero, diaUltimo, nombreMes);
    }

    static int diaPrimeroMes() {
        int diaPrimero = cal.get(Calendar.DAY_OF_WEEK);
        return diaPrimero;
    }

    static int diaUltimoMes() {
        int diaUltimoMes = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        return diaUltimoMes;
    }

    static String calcularNombreMes() {
        String calculardiaMes = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("ES"));
        return calculardiaMes;
    }

    static void Calendario(int diaPrimeroMes, int diaUltimoMes, String calcularNombreMes) {

        int[] matCalc = new int[50];
        int offset = diaPrimeroMes == 1 ? diaPrimeroMes + 5 : diaPrimeroMes - 2;
        int pos;

        for (int day = 0; day < matCalc.length; day++)
        {
            pos = offset + day;
            if (day >= diaUltimoMes) break;

            matCalc[pos] = day + 1;
        }

        System.out.println("\u001B[34m           " + calcularNombreMes.toUpperCase() + "\u001B[0m");
        System.out.println("\u001B[34m   L   M   X   J   V   S   D\u001B[0m");

        for (int x = 1; x < matCalc.length + 1; x++)
        {
            int d = matCalc[x - 1];
            System.out.print(d == 0 ? "    " : String.format("%1$4s", d));
            if (x % 7 == 0) System.out.println();
        }
    }
}
public class retoGit {
    
    Scanner scn = new Scanner(System.in);
    int repositorio;
    System.out.println("Introduzca el repositorio nuevo:");
        repositorio = scn.nextInt(); 

}
