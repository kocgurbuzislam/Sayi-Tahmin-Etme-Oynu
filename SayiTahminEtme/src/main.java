import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("SAY� TAHM�N ETME OYNUNA HO�GELD�N�Z!");
		int bilgisayarDeger = random.nextInt(100);
		while (true) {
			System.out.println("Tahmininizi Giriniz");
			int oyuncuDeger = scanner.nextInt();

			if (oyuncuDeger == bilgisayarDeger) {
				System.out.println("Bilgisayar�n tutu�u de�er : " + bilgisayarDeger);
				System.out.println("Tebrikler Do�ru Tahmin.");
				System.out.println(" ");
			} else if (bilgisayarDeger > oyuncuDeger) {
				System.out.println("Yanl��!");
				System.out.println("Tahmininizi Art�r�n");
				System.out.println(" ");
			} else if (oyuncuDeger > bilgisayarDeger) {
				System.out.println("Yanl��!");
				System.out.println("Tahmininizi Azalt�n");
				System.out.println(" ");
			} else {
				System.out.println("L�tfen Ge�erli Bir Say� Giriniz");
			}

		}

	}

}
