public class Main {

	public static void main(String[] args) {
		functionManager.ClearConsole();
		System.out.println(ConsoleColors.WHITE_BOLD +ConsoleColors.BLUE_BACKGROUND+"\nEASYFLİGHT'a Hoşgeldiniz!");
		System.out.println("Bu bir uçuş rezervasyon uygulamasıdır. " + ConsoleColors.RESET + "\n");
		System.out.println("Lütfen menü üzerinden seçim yapınız.\n");
		System.out.println("---------------------------\n");
		functionManager.kayitVeGirisEkranı();		
		
	}

}
