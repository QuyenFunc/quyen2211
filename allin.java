package allin;

import java.util.Scanner;

public class allin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		cau1(sc);
		cau2(sc);
		cau3(sc);
		cau4(sc);
		cau5(sc);
		cau6(sc);
		cau7(sc);
		cau8(sc);
		cau9(sc);
		cau10(sc);
		cau11(sc);
		cau12(sc);
		cau13(sc);
		cau14(sc);
		cau15(sc);
		// Đóng Scanner
		sc.close();
	}

	public static int nhapSoNguyen(Scanner sc, String string) {
		int n;
		do {
			System.out.println(string);
			while (!sc.hasNextInt()) {
				System.out.println("Vui lòng nhập số nguyên !");
				sc.nextLine(); // Dùng để đọc dòng tiếp theo thay vì đọc khoảng trống
			}
			n = sc.nextInt();
			sc.nextLine();
			break;
		} while (true);
		return n;
	}

	public static void cau1(Scanner sc) {
		System.out.println("Câu 1: Hoán đổi 2 số nguyên");
		int a = nhapSoNguyen(sc, "nhập a : ");
		int b = nhapSoNguyen(sc, "Nhập b: ");

		int temp;
		temp = a;
		a = b;
		b = temp;

		System.out.println("a = " + a);
		System.out.println("b = " + temp);
	}

	public static void cau2(Scanner sc) {
		int a, b, c;

		System.out
				.println("\nCâu 2: Viết chương trình nhập vào số tiền phải trả của khách hàng. In ra số tiền khuyến\r\n"
						+ "mại với quy định: nếu số tiền phải trả thuộc [200, 300) thì khuyến mại 20%. Nếu số tiền\r\n"
						+ "phải trả từ 300 trở lên thì khuyến mại 30%. Còn lại thì không khuyến mại.");

		System.out.println("Menu Quần: 100k | Áo : 110k | Tất : 50K");

		a = nhapSoNguyen(sc, "\nNhập quần cần mua: ");
		System.out.printf("Số quần cần mua: " + a);

		b = nhapSoNguyen(sc, "\nNhập áo cần mua: ");
		System.out.printf("số áo cần mua: " + b);

		c = nhapSoNguyen(sc, "\nNhập áo cần mua: ");
		System.out.printf("Số tất cần mua:" + c);

		int Tong = a * 100 + b * 110 + c * 50;
		System.out.printf("\nSố tiền phải bỏ ra : " + Tong);

		if (Tong >= 200 && Tong < 300) {
			System.out.println("\n Bạn được khuyến mại 20%");
			Tong = Tong - Tong * 20 / 100;
			System.out.println("Số tiền cần phải trả là : " + Tong);
		} else if (Tong >= 300) {
			System.out.println(" Bạn được khuyến mại 20%");
			Tong = Tong - Tong * 30 / 100;
			System.out.println("Số tiền cần phải trả là : " + Tong);
		} else {
			System.out.println(" Bạn không có khuyến mãi, Số tiền phải trả là : " + Tong);
		}
	}

	public static void cau3(Scanner sc) {
		System.out.println("\nCâu 3: Chương trình số tiền phải trả");
		int n;

		do {
			n = nhapSoNguyen(sc, "Nhập số nguyên trong khoảng[10, 20]");
			if (n < 10 || n > 20) {
				System.out.println("Số không nằm trong khoảng [10, 20]. Vui lòng nhập lại.");
			}
		} while (n < 10 || n > 20);
		int Tong = 0;
		for (int i = 0; i <= n; i++) {
			Tong += i;
		}
		System.out.println("Tổng từ 1 đến n là : " + Tong);

	}

	public static void cau4(Scanner sc) {
		int n;
		System.out.println("\nCâu 4: Chương trình sau kiểm tra một số có phải là số nguyên tố hay không.");
		do {
			n = nhapSoNguyen(sc, "Nhập số nguyên (>1)");
			if (n < 1) {
				System.out.println("Số <1. Vui lòng nhập lại.");
			}
		} while (n < 1);

		boolean kiemTra = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				kiemTra = false;
				break;
			}
		}
		if (kiemTra) {
			System.out.println(n + " Là số nguyên tố");
		} else {
			System.out.println(n + " Không phải là số nguyên tố");
		}
	}

	public static void cau5(Scanner sc) {
		System.out.println("\nCâu 5 : Đếm số nguyên tố");

		int n = nhapSoNguyen(sc, "Nhập số nguyên: ");

		int count = 0;
		int sum = 0;

		for (int i = 2; i <= n; i++) {
			boolean result = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					result = false;
					break;
				}

			}
			if (result) {
				count++;
				sum += i;
			}
		}

		System.out.println("Có " + count + " số nguyên tố");
		System.out.println("Tổng các số nguyên tố bằng: " + sum);
	}

	public static void cau6(Scanner sc) {
		System.out.println("\nCâu 6: Liệt kê số nguyên tố");
		int n;
		n = nhapSoNguyen(sc, "Nhập số nguyên dương n: ");
		int count = 0;

		for (int i = 2; count < n; i++) {
			boolean result = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					result = false;
					break;
				}
			}
			if (result) {
				System.out.println(i);
				count++;
			}
		}
	}

	public static void cau7(Scanner sc) {
		System.out.println("Câu 7: Liệt kê số nguyên tố nhỏ hơn n");
		int n;
		n = nhapSoNguyen(sc, "Nhập số nguyên dương n: ");

		for (int i = 2; i < n; i++) {
			boolean Result = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					Result = false;
					break;
				}
			}
			if (Result)
				System.out.println("Số nguyên tố nhỏ hơn n là: " + i);
		}
	}

	public static void cau8(Scanner sc) {
		System.out.println("\nCâu 8 :chương trình tính tổng các chữ số của một số nguyên n");

		int n = nhapSoNguyen(sc, "Nhập 1 số nguyên :");
		int tong = 0;
		while (n > 0) {
			tong += n % 10;
			n /= 10;
		}

		System.out.println("Tổng bằng: " + tong);

	}

	public static void cau9(Scanner sc) {
		System.out.println("\nCâu 9: Chương trình tính tiền cước taxi");

		int n = nhapSoNguyen(sc, "Nhập số km : ");

		if (n == 1) {
			System.out.println("Số tiền phải trả là : 14000đ ");
		} else if (n > 1 || n <= 30) {
			int soTienDuoi30 = 14000 + 13000 * (n - 1);
			System.out.println("Số tiền phải trả là " + soTienDuoi30);
		} else {
			int soTienTren30 = 14000 + 13000 * 29 + 11000 * (n - 30);
			System.out.println("Số tiền phải trả là: " + soTienTren30);
		}
	}

	public static void cau10(Scanner sc) {
		System.out.println("\nCâu 10: chương trình tính tiền điện");

		int soDien, soCu, soMoi;
		do {
			soCu = nhapSoNguyen(sc, "Nhập số điện cũ: ");
			soMoi = nhapSoNguyen(sc, "Nhập số điện mới: ");

			soDien = soMoi - soCu;

			if (soDien < 0) {
				System.out.println("Số mới và số cũ đã được nhập sai");
			}

		} while (soDien < 0);

		if (soDien <= 50) {
			int soTien1 = 1000 + soDien * 230;
			System.out.printf("Sô chỉ cũ: %d | Số chỉ mới: %d | Số điện định mức: %d | Vượt định mức: 0 ", soCu, soMoi,
					soDien);
			System.out.println("\nSố tiền phải trả là : " + soTien1 + " đ");
		} else if (soDien > 50) {
			System.out.printf("Sô chỉ cũ: %d | Số chỉ mới: %d | Số điện định mức: 50 | Vượt định mức: %d ", soCu, soMoi,
					soDien - 50);
			int soTien2 = 1000 + 50 * 230 + (soDien - 50) * 480;
			System.out.println("\nSố tiền phải trả là : " + soTien2 + " đ");
		} else if (soDien > 100) {
			System.out.printf("Sô chỉ cũ: %d | Số chỉ mới: %d | Số điện định mức: 50 | Vượt định mức: %d ", soCu, soMoi,
					soDien - 100);
			int soTien3 = 1000 + 50 * 230 + 50 * 480 + (soDien - 100) * 700;
			System.out.println("\nSố tiền phải trả là : " + soTien3 + " đ");
		} else {
			System.out.printf("Sô chỉ cũ: %d | Số chỉ mới: %d | Số điện định mức: 50 | Vượt định mức: %d ", soCu, soMoi,
					soDien - 150);
			int soTien4 = 1000 + 50 * 230 + 50 * 480 + 50 * 700 + (soDien - 150) * 900;
			System.out.println("\nSố tiền phải trả là " + soTien4 + " đ");
		}
	}

	public static void cau11(Scanner sc) {
		System.out.println("\nCâu 11: ");
		int m;

		do {
			m = nhapSoNguyen(sc, "Nhập số thiết bị cần gia công: ");
			if (m < 0) {
				System.out.println("Nhập sai");
			}
		} while (m < 0);

		int t;
		do {
			t = nhapSoNguyen(sc, "Nhập thời gian gia công [1,60] :");
			if (t < 1 || t > 30) {
				System.out.println("Nhập sai");
			}
		} while (t < 1 || t > 30);

		int sumTime = m * t;
		System.out.printf("Thời gian gia công cho %d thiết bị là %d", m, sumTime);
		int sumMoney = m * 500;
		System.out.printf("\nChi phí cho %d thiết bị là : %d ", m, sumMoney);
	}

	public static void cau12(Scanner sc) {
		System.out.println("\n Câu12: ");
		int m;
		do {
			m = nhapSoNguyen(sc, "Nhập số thiết bị cần gia công: ");
			if (m < 0) {
				System.out.println("Nhập sai");
			}
		} while (m < 0);

		int n;
		do {
			n = nhapSoNguyen(sc, "Nhập thời gian gia công :");
			if (n < 1 || n > 60) {
				System.out.println("Nhập sai");
			}
		} while (n < 1 || n > 60);

		int sumTime = m * n;
		System.out.printf("Thời gian gia công cho %d thiết bị là %d", m, sumTime);
		int sumMoney;
		if (n < 100) {
			sumMoney = 800 * m;
			System.out.println("Chi phí phải chi trả là: " + sumMoney);
		} else if (n >= 100) {
			sumMoney = 900 * m;
			System.out.println("Chi phí phải chi trả là: " + sumMoney);
		}

	}

	public static void cau13(Scanner sc) {
		System.out.println("\n Câu 13: Tính tổng");
		int n = nhapSoNguyen(sc, "Nhập số nguyên N :");

		float s1 = S1(n);
		System.out.println(" S1=1 + 2 + 3 +.....+N :" + s1);
		float s2 = S2(n);
		System.out.println(" S2=1 +1/2+1/3+.....+1/N :" + s2);
		int s3 = S3(n);
		System.out.println(" S3=1 +2^2+3^3... +N^N :" + s3);
		int s4 = S4(n);
		System.out.println(" S4=1*2*3...*N :" + s4);
		Double s5 = S5(n);
		System.out.println(" S5= 1 + 1/2! + 1/3! + ..... + 1/N! :" + s5);
		Double s6 = S6(n);
		System.out.println(" S6= 1/(1*2) + 1/(2*3) + 1/(3*4) + ..... + 1/(N*(N+1)) :" + s6);

	}

	public static void cau14(Scanner sc) {
		System.out.println("\n Caau14: TÍnh tổng bình phương số lẻ");
		int n = nhapSoNguyen(sc, "Nhập Giá trị n");
		int tong = 0;
		for (int i = 1; i <= n; i += 2) {
			tong += i * i;
		}
		System.out.println("Tổng bình phương các số lẻ từ 1 đến " + n + " là: " + tong);
	}

	public static void cau15(Scanner sc) {
		System.out.println("\n Câu 15: Tính Fibonacci");
		int n = nhapSoNguyen(sc, "Nhập số : ");
		if (n <= 0) {
			System.out.println("Số hạng phải là một số nguyên dương.");
		} else {
			int result = fibonacci(n);
			System.out.println("Số hạng thứ " + n + " của dãy Fibonacci là: " + result);
		}
	}

	public static int fibonacci(int n) {
		if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	private static float S1(double i) {
		if (i == 1) {
			return 1;
		}
		return (float) (i + S1(i - 1));
	}

	public static float S2(float j) {
		float Tong = 0;
		for (float i = 1; i <= j; i++) {
			Tong += 1 / (i);
		}
		return Tong;
	}

	public static int S3(int m) {
		int Tong = 0;
		for (int i = 1; i <= m; i++) {
			Tong += Math.pow(i, i);
		}
		return Tong;
	}

	public static int S4(int k) {
		int Tong = 1;
		for (int i = 1; i <= k; i++) {
			Tong = Tong * i;
		}
		return Tong;
	}

	public static Double S5(float l) {
		Double Tong = (double) 0;

		for (float i = 1; i <= l; i++) {
			Tong += 1.0 / S1(i);
		}
		return (double) Tong;
	}

	public static Double S6(float o) {
		double S6 = 0.0;

		for (int i = 1; i <= o; i++) {
			S6 += 1.0 / (i * (i + 1));
		}

		return S6;
	}

}
