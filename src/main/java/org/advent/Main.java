package org.advent;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dobro došli u adventske avanture");
        String ponovi;
        do{
            try{
                System.out.print("Odaberite broj zadatka koji želite izvršiti: ");
                Integer redniBrojZadatka = parseInt(reader.readLine());
                System.out.println(redniBrojZadatka);
                System.out.print("Unesi 'Da' za novi zadatak: ");
                ponovi = reader.readLine();
            }catch (Exception e){
                System.out.println("Unos mora biti broj!");
                ponovi="Da";
            }
        }while(ponovi.equals("Da"));
    }
}