import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("SAYÝ TAHMÝN ETME OYNUNA HOÞGELDÝNÝZ!");
		int bilgisayarDeger = random.nextInt(100);
		while (true) {
			System.out.println("Tahmininizi Giriniz");
			int oyuncuDeger = scanner.nextInt();

			if (oyuncuDeger == bilgisayarDeger) {
				System.out.println("Bilgisayarýn tutuðu deðer : " + bilgisayarDeger);
				System.out.println("Tebrikler Doðru Tahmin.");
				System.out.println(" ");
			} else if (bilgisayarDeger > oyuncuDeger) {
				System.out.println("Yanlýþ!");
				System.out.println("Tahmininizi Artýrýn");
				System.out.println(" ");
			} else if (oyuncuDeger > bilgisayarDeger) {
				System.out.println("Yanlýþ!");
				System.out.println("Tahmininizi Azaltýn");
				System.out.println(" ");
			} else {
				System.out.println("Lütfen Geçerli Bir Sayý Giriniz");
			}

		}

	}

}
