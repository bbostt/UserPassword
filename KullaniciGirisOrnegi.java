import java.util.Scanner;

public class KullaniciGirisOrnegi {

	public static void main(String[] args) {
		String password;
		int select;

		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		System.out.print("Sifre giriniz : ");
		password = input.nextLine();

		if (password.equals("Bosti66")) {
			System.out.println("Giri� ba�ar�l� !");
		} else {
			System.out.println("Girilen �ifre yanl�� !");
			System.out.println("Yeni �ifre olu�turmak ister misiniz ? ");
			System.out.println("1-Yeni �ifre olu�tur");
			System.out.println("2-Eski �ifre ile devam et");
			select = input2.nextInt();
			switch (select) {
			case 1:
				System.out.print("Yeni Sifre giriniz : ");
				password = input.nextLine();
				System.out.println("Yeni �ifre olu�turuldu : "+password);
				break;
			case 2:
				if (password.equals("Bosti66")) {
					System.out.println("Giri� ba�ar�l� !");
				} else {
					System.out.println("Giri� ba�ar�s�z ! Girilen �ifre : "+password);
				}
				break;

			}

		}
	}

}
