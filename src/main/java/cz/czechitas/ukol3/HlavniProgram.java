package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.


        System.out.println("Program spuštěn.");

        Pocitac petryPocitac;
        petryPocitac = new Pocitac();
        System.out.println(petryPocitac.toString());
        petryPocitac.zapniSe();      // Vypise chybu, protoze pocitac
        // nema vsechny povinne soucasti

        Procesor petryProcesor = new Procesor();
        petryProcesor.setRychlost(2_600_000_000_000L);
        petryProcesor.vyrobce = "AMD Ryzen";

        Pamet petryPamet = new Pamet();
        petryPamet.kapacita = 8_000_000_000L;

        Disk petryDisk = new Disk();
        petryDisk.kapacita = 256_000_0_000L;

        petryPocitac.setCpu(petryProcesor);
        petryPocitac.setRam(petryPamet);
        petryPocitac.setPevnyDisk(petryDisk);

        System.out.println(petryPocitac.toString());

        petryPocitac.zapniSe();
        petryPocitac.zapniSe();      // Vypise chybu, protoze pocitac uz bezi
        System.out.println(petryPocitac.toString());
        petryPocitac.vypniSe();

        petryPocitac.vypniSe();      // Nevypise chybu, ale nic neprovede,
        petryPocitac.vypniSe();      // protoze pocitac je uz vypnuty
    }


}
