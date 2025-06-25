import java.util.Scanner;

public class Variables {
	
	public static Scanner scanner = new Scanner(System.in);
	public static Scanner stringScanner = new Scanner(System.in).useDelimiter("\n");
	
	private static String defkullaniciAdi;
	private static String defsifre;
	private static String kullaniciAdi;
	private static String sifre;
	private static String isim;
	private static String soyisim;
	private static String email;
	private static int yas;
	private static String kartisim;
	private static long kartno;
	private static String kartskt;
	private static int kartcvc;
	private static String kartkayit;
	static int kullaniciTuru;
	static String uyelikTuru;
	static String geridon;
	static int geridon2;
	static int tg;

		//-----------------------------------------
	
		public static String getdefKullaniciAdi() {
			defkullaniciAdi= "enes";
			return defkullaniciAdi;
		}
	
		public static void setdefKullaniciAdi() {
			sop("Kullanıcı Adı: ");
			defkullaniciAdi = scanner.next();
		}
	
		public static String getdefSifre() {
			defsifre="1234";
			return defsifre;
		}
	
		public static void setdefSifre() {
			sop("Şifre: ");
			defsifre = scanner.next();
		}
	
	 	public static String getKullaniciAdi() {
			return kullaniciAdi;
		}

		public static void setKullaniciAdi() {
			sop("Kullanıcı Adı: ");
			kullaniciAdi = scanner.next();
		}

		public static String getSifre() {
			return sifre;
		}

		public static void setSifre() {
			sop("Şifre: ");
			sifre = scanner.next();
		}

		public static String getIsim() {
			return isim;
		}

		public static void setIsim() {
			sop("İsim: ");
	        isim = stringScanner.nextLine();
		}

		public static String getSoyisim() {
			return soyisim;
		}

		public static void setSoyisim() {
			sop("Soyisim: ");
	        soyisim = stringScanner.nextLine();
		}

		public static String getEmail() {
			return email;
		}

		public static void setEmail() {
			sop("E-Mail: ");
	        email = scanner.next();
		}

		public static int getYas() {
			return yas;
		}

		public static void setYas() {
			sop("Yaş: ");
	        yas = scanner.nextInt();
		}

		public static String getKartisim() {
			return kartisim;
		}

		public static void setKartisim() {
			sop("Kart Üzerindeki İsmi Giriniz: ");
			kartisim = stringScanner.nextLine();
		}

		public static long getKartno() {
			return kartno;
		}

		public static void setKartno() {
			sop("Kart Numarasını Giriniz: ");
	        kartno = scanner.nextLong();
		}

		public static String getKartskt() {
			return kartskt;
		}

		public static void setKartskt() {
			sop("Son Kullanma Tarihini Giriniz: ");
	        kartskt = stringScanner.nextLine();
		}

		public static int getKartcvc() {
			return kartcvc;
		}

		public static void setKartcvc() {
			sop("CVC Kodunu Giriniz: ");
	        kartcvc = scanner.nextInt();
		}

		public static String getKartkayit() {
			return kartkayit;
		}

		public static void setKartkayit() {
			sop("Kartınızın Hangi İsimle Kaydedileceğini Giriniz: ");
	        kartkayit = stringScanner.nextLine();
		}
				
		//-----------------------------------------

    //System.out.println() fonksiyonunun kısayolu.
    public static void sop(String x) {

    	System.out.println(x);
    }
}
    

