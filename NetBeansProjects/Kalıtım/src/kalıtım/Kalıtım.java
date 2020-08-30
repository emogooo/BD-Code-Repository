package kalıtım;

public class Kalıtım {

    static void hazırOl(Asker a) {
        a.selamVer();
    }

    public static void main(String[] args) {

        Asker as = new Er();
        Asker yb = new Yüzbaşı();
        hazırOl(as);
        hazırOl(yb);

    }
}

abstract class Asker {

    void selamVer() {
        System.out.println("Asker selam verdi.");
    }
}

class Er extends Asker {

    void selamVer() {
        System.out.println("Er selam ver.");
    }
}

class Yüzbaşı extends Asker {

    void selamVer() {
        System.out.println("Yüzbaşı selam verdi.");
    }
}