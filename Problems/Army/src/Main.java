import javax.print.Doc;

class Army {

    public static void createArmy() {
        Unit todoriki = new Unit("Todoriki");
        Unit bakogu = new Unit("Bakogu");
        Unit deku = new Unit("Deku");
        Unit asui = new Unit("Asui");
        Unit uraraka = new Unit("Uraraka");

        Knight blackKnights = new Knight("Black knights");
        Knight dancingKnights = new Knight("Dancing knights");
        Knight knightsOfArdougne = new Knight("Knights of Ardougne");

        General commander = new General("All Might");
        Doctor medicalDoctor = new Doctor("Chiyo");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}