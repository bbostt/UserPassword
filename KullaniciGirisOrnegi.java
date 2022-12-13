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
			System.out.println("Giriþ baþarýlý !");
		} else {
			System.out.println("Girilen þifre yanlýþ !");
			System.out.println("Yeni þifre oluþturmak ister misiniz ? ");
			System.out.println("1-Yeni Þifre oluþtur");
			System.out.println("2-Eski þifre ile devam et");
			select = input2.nextInt();
			switch (select) {
			case 1:
				System.out.print("Yeni Sifre giriniz : ");
				password = input.nextLine();
				System.out.println("Yeni þifre oluþturuldu : "+password);
				break;
			case 2:
				if (password.equals("Bosti66")) {
					System.out.println("Giriþ baþarýlý !");
				} else {
					System.out.println("Giriþ baþarýsýz ! Girilen þifre : "+password);
				}
				break;

			}

		}
	}

}
