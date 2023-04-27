import java.util.Scanner;

public class A {
    public A() {}
    public void kiir() {
        double terfogat =  this.bekerData();
        nyomtat(terfogat);
    }
    private void nyomtat(double terfogat) {
        System.out.println(terfogat);
    }
    private double bekerData() {
        String aoldal = beker("adja meg az a oldalt: ");        
        if(!this.checkInput(aoldal)) {
            System.err.println("Hiba! Csak számot lehet beírni!");
            throw new NumberFormatException();
        }
        String boldal = beker("adja meg a b oldalt: ");
        if(!this.checkInput(boldal)) {
            System.err.println("Hiba! Csak számot lehet beírni!");
            throw new NumberFormatException();
        }        
        String coldal = beker("adja meg a c oldalt: ");
        if(!this.checkInput(coldal)) {
            System.err.println("Hiba! Csak számot lehet beírni!");
            throw new NumberFormatException();
        }

        double a = Double.parseDouble(aoldal);
        double b = Double.parseDouble(boldal);
        double c = Double.parseDouble(coldal);
        double terfogat = this.szamitas(a, b, c);
        return terfogat;
    }
    private String beker(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextLine();
    }
    public double szamitas (double a, double b, double c) {
        double terfogat = (a*b*c);
        return terfogat;
    }
    public boolean checkInput(String input) {
        if(input.matches("[0-9.]+")) {
            return true;
        }else {
            return false;
        }        
    }
}
