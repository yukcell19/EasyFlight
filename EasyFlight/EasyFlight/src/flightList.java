import java.util.Scanner;
public class flightList extends functionManager{
	
	private static Scanner scanner = new Scanner(System.in);
	
	static int[] container = {73,121,67,132,92,141,53,74,87,61,112};
	static String[] ucusno = {"TK101","PC202","TK303","PC404","TK505",
					"PC606","TK707","PC808","TK909","PC1010","TK1111"};
	static String[] ucusno2 = {"TK101","PC202","TK303","TK707"};
	static int[] biletlerim = {0, 0, 0, 0};
	
	static int biletsayisi;
	static int sayac;
	static String kalkis, varis;
	
	public static void ucussec() {	
		boolean b2=true;
		while(b2) {
			
		String ucuskodu = scanner.next();
		
		switch(ucuskodu) {
		case "TK101":
			ClearConsole();
			sop("| Uçuş No | Havayolu            | Kalkış Havalimanı | Varış Havalimanı  | Kalkış Saati | Varış Saati | Fiyat (TL) | Kontenjan |\r\n" +
			"| TK101   | Türk Hava Yolları   |     "+ kalkis + "      |    " + varis + "          | 08:00        | 09:15       | 1100       | "+container[0]+"        |\n");
			biletal();
			sop("Ödemeniz gerek tutar : " + 1100*biletsayisi + " TL \n");
			kartsec();
			container[0] -= biletsayisi;
			biletlerim[0] += biletsayisi;
			sop("Uçuş listesini tekrar görüntülemek için 1'e basınız.");
			sop("(Ana Menüye dönmek için 2'ye basabilirsiniz.)");
			tg = scanner.nextInt();
			if(tg == 1){
				ClearConsole();
				ucuscagir2();	
			}
			else if (tg == 2){
				b2 = false;
			}
			break;
		case "PC202":
			ClearConsole();
			sop("| Uçuş No | Havayolu            | Kalkış Havalimanı | Varış Havalimanı  | Kalkış Saati | Varış Saati | Fiyat (TL) | Kontenjan |\r\n" +
			"| PC202   | Pegasus             |     "+ kalkis + "      |    " + varis + "          | 07:45        | 09:00       | 950        | "+container[1]+"       |\n");
			biletal();
			sop("Ödemeniz gerek tutar : " + 950*biletsayisi + " TL \n");
			kartsec();
			container[1] -= biletsayisi;
			biletlerim[1] += biletsayisi;
			sop("Uçuş listesini tekrar görüntülemek için 1'e basınız.");
			sop("(Ana Menüye dönmek için 2'ye basabilirsiniz.)");
			tg = scanner.nextInt();
			if(tg == 1){
				ClearConsole();
				ucuscagir2();	
			}
			else if (tg == 2){
				b2 = false;
			}
			break;
		case "TK303":
			ClearConsole();
			sop("| Uçuş No | Havayolu            | Kalkış Havalimanı | Varış Havalimanı  | Kalkış Saati | Varış Saati | Fiyat (TL) | Kontenjan |\r\n" +
			"| TK303   | Türk Hava Yolları   |     "+ kalkis + "      |    " + varis + "          | 10:00        | 11:15       | 1050       | "+container[2]+"        |\n");
			biletal();
			sop("Ödemeniz gerek tutar : " + 1050*biletsayisi + " TL \n");
			kartsec();
			container[2] -= biletsayisi;
			biletlerim[2] += biletsayisi;
			sop("Uçuş listesini tekrar görüntülemek için 1'e basınız.");
			sop("(Ana Menüye dönmek için 2'ye basabilirsiniz.)");
			tg = scanner.nextInt();
			if(tg == 1){
				ClearConsole();
				ucuscagir2();	
			}
			else if (tg == 2){
				b2 = false;
			}
			break;
		case "TK707":
			ClearConsole();
			sop("| Uçuş No | Havayolu            | Kalkış Havalimanı | Varış Havalimanı  | Kalkış Saati | Varış Saati | Fiyat (TL) | Kontenjan |\r\n" +
				"| TK707   | Türk Hava Yolları   |     "+ kalkis + "      |    " + varis + "          | 09:00        | 10:30       | 1200       | "+container[7]+"        |\n");
			biletal();
			sop("Ödemeniz gerek tutar : " + 1200*biletsayisi + " TL \n");
			kartsec();
			container[7] -= biletsayisi;
			biletlerim[3] += biletsayisi;
			sop("Uçuş listesini tekrar görüntülemek için 1'e basınız.");
			sop("(Ana Menüye dönmek için 2'ye basabilirsiniz.)");
			tg = scanner.nextInt();
			if(tg == 1){
				ClearConsole();
				ucuscagir2();	
			}
			else if (tg == 2){
				b2 = false;
			}
			break;
		default:
			for(int i=0; i<ucusno.length; i++) {
				if(ucuskodu != ucusno[i]) {
					sop("Geçersiz uçuş numarası girdiniz.");
					sop("Tekrar deneyiniz.\n");
					break;
				}
			}
			
		}
		}
	}
	
	public static void ucuscagir() {

		sop("Kalkış Lokasyonu: ");
		kalkis = stringScanner.nextLine();
		ClearConsole();
		sop("Varış Lokasyonu: ");
		varis = stringScanner.nextLine();
		ClearConsole();
		
        System.out.println("UÇUŞ LİSTESİ \n");

        System.out.println("| Uçuş No | Havayolu            | Kalkış Havalimanı | Varış Havalimanı  | Kalkış Saati | Varış Saati | Fiyat (TL) | Kontenjan |");
        System.out.println("|---------|---------------------|-------------------|-------------------|--------------|-------------|------------|-----------|");
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "TK101", "Türk Hava Yolları", padRight(kalkis, 17), padRight(varis, 17), "08:00", "09:15", "1100", container[0]);
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "PC202", "Pegasus", padRight(kalkis, 17), padRight(varis, 17), "07:45", "09:00", "950", container[1]);
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "TK303", "Türk Hava Yolları", padRight(kalkis, 17), padRight(varis, 17), "10:00", "11:15", "1050", container[2]);
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "PC404", "Pegasus", padRight(kalkis, 17), padRight(varis, 17), "06:30", "08:10", "1150", "Dolu");
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "TK505", "Türk Hava Yolları", padRight(kalkis, 17), padRight(varis, 17), "12:00", "13:15", "1000", "Dolu");
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "PC606", "Pegasus", padRight(kalkis, 17), padRight(varis, 17), "14:00", "15:10", "900", "Dolu");
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "TK707", "Türk Hava Yolları", padRight(kalkis, 17), padRight(varis, 17), "09:00", "10:30", "1200", container[7]);
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "PC808", "Pegasus", padRight(kalkis, 17), padRight(varis, 17), "10:00", "11:40", "1350", "Dolu");
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "TK909", "Türk Hava Yolları", padRight(kalkis, 17), padRight(varis, 17), "15:30", "17:00", "1100", "Dolu");
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "PC1010", "Pegasus", padRight(kalkis, 17), padRight(varis, 17), "16:00", "17:30", "1000", "Dolu");
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "TK1111", "Türk Hava Yolları", padRight(kalkis, 17), padRight(varis, 17), "11:00", "12:30", "1250", "Dolu");
    
		sop("\nSeçmek İstediğiniz Uçuşun Kodunu Giriniz: ");
		ucussec();
	}

	public static void ucuscagir2(){
		System.out.println("UÇUŞ LİSTESİ \n");

        System.out.println("| Uçuş No | Havayolu            | Kalkış Havalimanı | Varış Havalimanı  | Kalkış Saati | Varış Saati | Fiyat (TL) | Kontenjan |");
        System.out.println("|---------|---------------------|-------------------|-------------------|--------------|-------------|------------|-----------|");
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "TK101", "Türk Hava Yolları", padRight(kalkis, 17), padRight(varis, 17), "08:00", "09:15", "1100", container[0]);
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "PC202", "Pegasus", padRight(kalkis, 17), padRight(varis, 17), "07:45", "09:00", "950", container[1]);
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "TK303", "Türk Hava Yolları", padRight(kalkis, 17), padRight(varis, 17), "10:00", "11:15", "1050", container[2]);
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "PC404", "Pegasus", padRight(kalkis, 17), padRight(varis, 17), "06:30", "08:10", "1150", "Dolu");
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "TK505", "Türk Hava Yolları", padRight(kalkis, 17), padRight(varis, 17), "12:00", "13:15", "1000", "Dolu");
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "PC606", "Pegasus", padRight(kalkis, 17), padRight(varis, 17), "14:00", "15:10", "900", "Dolu");
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "TK707", "Türk Hava Yolları", padRight(kalkis, 17), padRight(varis, 17), "09:00", "10:30", "1200", container[7]);
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "PC808", "Pegasus", padRight(kalkis, 17), padRight(varis, 17), "10:00", "11:40", "1350", "Dolu");
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "TK909", "Türk Hava Yolları", padRight(kalkis, 17), padRight(varis, 17), "15:30", "17:00", "1100", "Dolu");
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "PC1010", "Pegasus", padRight(kalkis, 17), padRight(varis, 17), "16:00", "17:30", "1000", "Dolu");
        System.out.printf("| %-7s | %-19s | %-17s | %-17s | %-12s | %-11s | %-10s | %-9s |%n",
                "TK1111", "Türk Hava Yolları", padRight(kalkis, 17), padRight(varis, 17), "11:00", "12:30", "1250", "Dolu");

		sop("\nSeçmek İstediğiniz Uçuşun Kodunu Giriniz: ");
    
	}

	public static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }
	
	public static void kartsec() {
		sop("Ödeme yapacağınız kartı seçiniz: ");
		if(getKartkayit() == null) {
			sop("Ekli kart bulunamadı.\n");
			sop("Kart eklemek için bir tuşa basın.");
			geridon = stringScanner.nextLine();
			kartEkle();
			ClearConsole();
			sop("\nİşleminize " + getKartkayit() + " adlı kartınız ile devam ediliyor.\n");
			sop("Devam etmek için bir tuşa basın.");
			geridon = stringScanner.nextLine();
			ClearConsole();
			sop("Uçuşu başarıyla aldınız!");
			sop("Keyifli Uçuşlar dileriz.\n");	
		}
		else {
			sop("Ekli kartınız: " +getKartkayit() + "\n");
			sop("Bu kart ile devam etmek istiyorsanız, 1'i tuşlayınız.");
			sop("Başka kart ile devam etmek istiyorsanız, 2'yi tuşlayınız.\n");
			int secim = scanner.nextInt();
			ClearConsole();
			if(secim == 1) {
				sop("\nİşleminize " + getKartkayit() + " adlı kartınız ile devam ediliyor.\n");
				sop("Devam etmek için bir tuşa basın.");
				geridon = stringScanner.nextLine();
				ClearConsole();
				sop("Uçuşu başarıyla aldınız!");
				sop("Keyifli Uçuşlar dileriz.\n");
			}
			else if(secim == 2){
				kartEkle();
				sop("\nİşleminize " + getKartkayit() + " adlı kartınız ile devam ediliyor.\n");
				sop("Devam etmek için bir tuşa basın.");
				geridon = stringScanner.nextLine();
				ClearConsole();
				sop("Uçuşu başarıyla aldınız!");
				sop("Keyifli Uçuşlar dileriz.\n");
			}
		}
	}
	
	public static void biletal() {
		boolean gecerliSayi = false;
	    while (!gecerliSayi) {
	        sop("Kaç adet bilet almak istiyorsunuz?");
	        biletsayisi = scanner.nextInt();
			ClearConsole();
	        if (biletsayisi > 0 && biletsayisi <= container[0]) {
	        	sop(biletsayisi + " bilet alıyorsunuz.\n");
				sop("Ödeme ekranına geçmek için herhangi bir tuşa basın.");
				geridon = stringScanner.nextLine();
				ClearConsole();
	            gecerliSayi = true;
	        } else {
	            sop("Seçtiğiniz uçuşun kontenjanından büyük bir değer veya 0'dan küçük bir değer girdiniz.");
	            sop("Lütfen tekrar deneyiniz.");
	        }
	    }
	}	
	
	public static void sop(String x) {
    	System.out.println(x);
	}
}
