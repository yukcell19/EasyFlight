class Kullanici {
    String isim;

    public Kullanici(String isim) {
        this.isim = isim;
    }

    public void selamla() {
        System.out.println("Merhaba " + isim + "!");
    }
}

class StandartKullanici extends Kullanici {
    public StandartKullanici(String isim) {
        super(isim);
    }

    
    public void selamla() {
        System.out.println("Merhaba " + isim + "! Standart kullanıcı olarak hoş geldiniz.\n");
    }
}

class PremiumKullanici extends Kullanici {
    public PremiumKullanici(String isim) {
        super(isim);
    }

    
    public void selamla() {
        System.out.println("Merhaba " + isim + "! Premium kullanıcı olmanıza sevindik. Hoş geldiniz.\n");
    }
}
public class uyelikTurleri {

}
