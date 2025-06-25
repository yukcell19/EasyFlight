public class functionManager extends Variables{
	
	public static void kayitVeGirisEkranı() {
        boolean devammi = true;
        while(devammi){
        sop("---  1. Kayıt Ol  ---");
        sop("---  2. Giriş Yap ---");
        sop("---  3. Uygulamadan Çık  ---");
        int secim = scanner.nextInt();
        
        switch (secim) {
            case 1:
                ClearConsole();
                kayitOl();
                ClearConsole();
                break;
            case 2:
                ClearConsole();
                girisYap();
                anaMenu();
                break;
            case 3:
                ClearConsole();
                sop("Hoşçakalın!");
                devammi = false;
                break; 
            default:
                sop("Geçersiz seçim!");
        }
      }
    }
	
	public static void kayitOl() {

        sop("Kayıt Olunuz \n---------------");

        setKullaniciAdi();
        ClearConsole();
        setSifre();
        ClearConsole();
        setEmail();
        ClearConsole();
        setIsim();
        ClearConsole();
        setSoyisim();
        ClearConsole();
        setYas();
        ClearConsole();
     // Kullanıcı oluşturma
        sop("Kullanıcı türünü seçiniz: 1- Standart, 2- Premium");
        sop("Premium kullanıcılar sitemizde reklam görmeyecektir.\n");
        kullaniciTuru = scanner.nextInt();
        ClearConsole();              
        sop("Kayıt Başarılı!");
        sop("---------------");
    }
    
    public static void girisYap() {

    	sop("Giriş Yapınız \n---------------");
    	boolean basarili = false;
    	
		while(!basarili) {
			sop("Kullanıcı Adı: ");
	        String girisKullaniciAdi = scanner.next();
            ClearConsole();
	        sop("Şifre: ");
	        String girisSifre = scanner.next();
	        ClearConsole();

	        if (girisKullaniciAdi.equals(getKullaniciAdi()) && girisSifre.equals(getSifre()) || 
	        		(girisKullaniciAdi.equals(getdefKullaniciAdi()) && girisSifre.equals(getdefSifre())) )
	        {
	        	sop("Giriş Başarılı!");
	        	sop("---------------");
	        	sop("Hoşgeldiniz!");
	        	
	        	 // Kullanıcı oluşturma
	            Kullanici girisKullanici;
	            
	            if(kullaniciTuru == 1 ) {
	            	uyelikTuru = "Standart Üyelik";
	            }
	            else if(kullaniciTuru == 2) {
	            	uyelikTuru = "Premium Üyelik";
	            }
	           
	            if (kullaniciTuru == 1) {
	                girisKullanici = new StandartKullanici(getIsim());
	            } else {
	                girisKullanici = new PremiumKullanici(getIsim());   
	            }

                ClearConsole();

	            // Kullanıcıyı selamla
	            selamlaKullanici(girisKullanici);
	            
	        	basarili = true;
	        }  	        
	        else {
                ClearConsole();
	            sop("Hatalı kullanıcı adı veya şifre!");
	            sop("Lütfen tekrar deneyiniz. \n");  
	        }
	     }
    }
        
    public static void selamlaKullanici(Kullanici kullanici) {
        kullanici.selamla();
    }  
    
    public static void anaMenu() {
    	anamenulist();
         
        boolean islem = true;
        while (islem) {
            sop("6-) Çıkış Yap");
            
            int secim = scanner.nextInt();
            
            switch (secim) {
                case 1:
                    ClearConsole();
                    ucuslariSorgula();
                    ClearConsole();
                    anamenulist();
                    break;
                case 2:
                    ClearConsole();
                	ucuslarim();          
                    ClearConsole();   
                	anamenulist();
                	break;
                case 3:
                    ClearConsole();
                    kartEkle();
                    sop("Kartınız Eklendi!");
                    sop("Kart bilgilerinizi görüntelemek için 1'e, geri dönmek için 2'ye basınız.");
                    
                    int geridon = scanner.nextInt();
                    if(geridon == 1){
                        ClearConsole();
                        kartBilgi();
                    }
                    ClearConsole();
                    anamenulist();
                    break;
                case 4:
                    ClearConsole();
                    hesapBilgileri();
                    ClearConsole();
                    anamenulist();
                    break;
                case 5:
                    ClearConsole();
                    anamenulist();
                    break;
                case 6:
                    ClearConsole();
                    islem = false;
                    break;
                default:
                    ClearConsole();
                    sop("Geçersiz seçim!");
                    sop("Tekrar Deneyiniz.\n");
                    
                    anamenulist();
   
                    break;
            }
        }
    }
    
    public static void anamenulist(){
        sop("1-) Uçuşları Sorgula");
        sop("2-) Uçuşlarım");
        sop("3-) Kart Ekle");
        sop("4-) Hesap Bilgileri");
    }

    public static void ucuslariSorgula(){  
        flightList.ucuscagir();      
       }
     
    public static void ucuslarim() {
    	sop("Satın aldığınız biletler:\n");
    	flightList.sayac = 0;
        for (int i = 0; i < 4; i++) {
            if (flightList.biletlerim[i] > 0) {
                sop("Uçuş Kodu: " + flightList.ucusno2[i] + ", Bilet Sayısı: " + flightList.biletlerim[i]+ "\n");
                flightList.sayac++;
            }                    
        }
        if(flightList.sayac<=0) {
        	sop("Henüz uçuş satın almadınız.\n");     
            System.out.println("Geri dönmek için q'ya basın.");
            geridon = stringScanner.nextLine();   	
        }
        else {
        	ucusdetay();
        }
        
    }
    
    public static void ucusdetay() {   	   		
    	boolean b3 = true;
    	while(b3){
    		
    	sop("Uçuşlarınız hakkında detaylı bilgi için uçuş kodunu yazınız.\n");
        sop("(Geri dönmek için q'ya basabilirsiniz)");	
    		
    	String detay = scanner.next();
        ClearConsole();
        switch(detay) {
        
        case "TK101":
        	sop("| Uçuş No | Havayolu            | Kalkış Havalimanı | Varış Havalimanı  | Kalkış Saati | Varış Saati | Adet |\r\n" +
    			"| TK101   | Türk Hava Yolları   |  "+ flightList.kalkis +"         | " + flightList.varis + "             | 08:00        | 09:15       | "+flightList.biletlerim[0]+"    |\n");
            onemlibilgi();
        	break;
        case "PC202":
        	sop("| Uçuş No | Havayolu            | Kalkış Havalimanı | Varış Havalimanı  | Kalkış Saati | Varış Saati | Adet |\r\n" +
    			"| PC202   | Pegasus             |  "+ flightList.kalkis +"         | " + flightList.varis + "             | 07:45        | 09:00       | "+flightList.biletlerim[1]+"    |\n");
            onemlibilgi();
        	break;
        case "TK303":
        	sop("| Uçuş No | Havayolu            | Kalkış Havalimanı | Varış Havalimanı  | Kalkış Saati | Varış Saati | Adet |\r\n" +
    			"| TK303   | Türk Hava Yolları   |  "+ flightList.kalkis +"         | " + flightList.varis + "             | 10:00        | 11:15       | "+flightList.biletlerim[2]+"    |\n");
            onemlibilgi();
        	break;
        case "TK707":
        	sop("| Uçuş No | Havayolu            | Kalkış Havalimanı | Varış Havalimanı  | Kalkış Saati | Varış Saati | Adet |\r\n" +
    			"| TK707   | Türk Hava Yolları   |  "+ flightList.kalkis +"         | " + flightList.varis + "             | 09:00        | 10:30       | "+flightList.biletlerim[3]+"    |\n");
            onemlibilgi();
        	break;
        case "q":
        	b3=false;
        	break;
          }
    	}
      }
      
    public static void onemlibilgi(){
        sop(ConsoleColors.BLACK_BACKGROUND + ConsoleColors.RED + "ÖNEMLİ BİLGİ" + ConsoleColors.RESET);
        sop("Uçuşunuzun kalkış saatinden en az 2 saat önce, gerekli işlemlerin yapılabilmesi için havalimanında bulununuz.");
        sop("Uçuşa 30 dakika kala yolcu alımı kapanacaktır.");
        sop("Keyifli uçuşlar dileriz.\n");
    }

    public static void kartEkle() {
        ClearConsole();
        sop("Lütfen kart ekleyiniz.\n");
    	setKartisim();
    	ClearConsole();
    	setKartno();
        ClearConsole();
    	setKartskt();
        ClearConsole();
    	setKartcvc();
        ClearConsole();
    	setKartkayit();
    	ClearConsole();  
    }
    
    public static void kartBilgi() {
    	sop("Kart Üzerindeki İsim: " + getKartisim());
    	
    	sop("Kart No: " + getKartno());
    	
    	sop("Kartın Son Kullanma Tarihi: " + getKartskt());
    	
    	sop("CVC Kodu: " + getKartcvc()+"\n");

        System.out.println("Geri dönmek için q'ya basın.");
        geridon = stringScanner.nextLine();
        
    }

    public static void hesapBilgileri() {
        boolean b1 = true;

        while(b1) {
        	
        sop("Kullanıcı Adı: " + getKullaniciAdi());
        sop("Şifre: " + getSifre());
        sop("E-mail: " + getEmail());
        sop("İsim: " + getIsim());
        sop("Soyisim: " + getSoyisim());
        sop("Yaş: " + getYas());
        sop("Kayıtlı Kart: " + getKartkayit());
        sop("Üyelik Türü: "+ uyelikTuru);
        sop("----------------------------");
        sop("1-) Kullanıcı Adı Değiştir");
        sop("2-) Şifre Değiştir");
        sop("3-) E-Mail Değiştir");
        sop("4-) İsim Değiştir");
        sop("5-) Soyisim Değiştir");
        sop("6-) Yaş Değiştir");
        sop("7-) Kayıtlı Kart Bilgilerini Görüntüle");
        sop("8-) Ana Menü");
        
        int secim = scanner.nextInt();
      
        switch (secim) {
            case 1:
                ClearConsole();
                sop2("Yeni ");
            	setKullaniciAdi();
                ClearConsole();
            	break;
            case 2:
                ClearConsole();
                sop2("Yeni ");
            	setSifre();
                ClearConsole();
            	break;
            case 3:
                ClearConsole();
                sop2("Yeni ");
            	setEmail();
                ClearConsole();
            	break;
            case 4:
                ClearConsole();
                sop2("Yeni ");
            	setIsim();
                ClearConsole();
            	break;
            case 5:
                ClearConsole();
                sop2("Yeni ");
            	setSoyisim();
                ClearConsole();
            	break;
            case 6:
                ClearConsole();
                sop2("Yeni ");
            	setYas();
                ClearConsole();
            	break;
            case 7:
                ClearConsole();
            	kartBilgi();
                ClearConsole();
                break;
            case 8:
            	b1=false;
            	break;
            default:
                sop("Geçersiz seçim!");
        }
        }
    }
    
    public static void ClearConsole(){
        System.out.print("\033[H\033[2J");
            System.out.flush();
    }
    
    //System.out.println() fonksiyonunun kısayolu.
    public static void sop(String x) {
    	System.out.println(x);
}

    public static void sop2(String x){
        System.out.print(x);
    }
}