package allin;

import java.util.Scanner;

public class mang {

	public static int nhapSoNguyen(Scanner sc, String string) {
		int n;

		do {
			System.out.println(string);
			while (!sc.hasNextInt()) {
				System.out.println("Vui lòng nhập số nguyên : ");
				sc.nextLine();
			}
			n = sc.nextInt();
			break;
		} while (true);
		return n;
	}

	public static int[] taoMang(Scanner sc) {
		int n = nhapSoNguyen(sc, "Nhập số phần sử của mảng :");
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("arr[%d] = ", i);
			ar[i] = nhapSoNguyen(sc, "");
		}
		return ar;
	}

	public static void xuatMang(int[] ar) {
		System.out.println("Số phần tử đã nhập: " + ar.length);
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("arr[%d] = %d%n", i, ar[i]);
		}
	}

	static void tinhToanNhe(int[] ar) {
		int tong = 0, tong1 = 0, tong2 = 0, tong3 = 0, tong4 = 0, tong5 = 0;
		int tong6 = 0;
		Double tong7;
		int a = 0, b = 0, c = 0, d = 0;
		int i = 0;
		for (i = 0; i < ar.length; i++) {
			tong += ar[i];

			if (ar[i] > 0) {
				tong1 += ar[i];
				a++;
			}

			if (ar[i] < 0) {
				tong2 += ar[i];
				b++;
			}
			if (ar[i] % 2 == 0) {
				tong3 += ar[i];
				c++;
			}
			if (ar[i] % 2 != 0) {
				tong4 += ar[i];
				d++;
			}
			if (ar[i] % 3 == 0) {
				tong5 += ar[i];
			}
			if (ar[i] % 5 == 0) {
				tong6 += ar[i];
			}
		}
		int min = ar[0];
		for (i = 1; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}
		}
		int max = ar[0];
		for (i = 1; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		tong7 = (double) (tong / ar.length);

		System.out.println("Tổng các phần tử của mảng :" + tong);
		System.out.println("Tổng các phần tử dương của mảng : " + tong1);
		System.out.println("Tổng các phần tử âm của mảng : " + tong2);
		System.out.println("Tổng các phần tử chẵn của mảng : " + tong3);
		System.out.println("Tổng các phần tử lẻ của mảng : " + tong4);
		System.out.println("Tổng các phần tử chia hết cho 3 của mảng : " + tong5);
		System.out.println("Tổng các phần tử chia hết cho 5 của mảng : " + tong6);
		System.out.println("Số phần tử của mảng là : " + ar.length);
		System.out.println("Số phần tử dương của mảng là : " + a);
		System.out.println("Số phần tử âm của mảng là : " + b);
		System.out.println("Số phần tử chẵn của mảng là : " + c);
		System.out.println("Số phần tử lẻ của mảng là : " + d);
		System.out.println("Phần tử bé nhất của mảng là : " + min);
		System.out.println("Phần tử lớn nhất của mảng là : " + max);
		System.out.println("Trung bình cộng các phần tử là : " + tong7);

	}

	static void tinhToanNhe2(int[] ar, Scanner sc) {
		int tong = 0, sum = 0;
		int i;
		for (i = 1; i < ar.length; i++) {
			if (i % 2 != 0 && i % 3 == 0) {
				tong += ar[i];
				sum++;
			}
		}
		Double trungBinh = (double) (tong / sum);
		System.out.println("Giá trị trung bình các phần tử lẻ chia hết cho 3 là : " + trungBinh);

		int a = nhapSoNguyen(sc, "Nhập số c : ");
		int sum1 = 0;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] == a) {
				sum1++;
			}
		}
		System.out.printf("Số lần xuất hiện của phần tử %d : %d", a, sum1);

		for (i = 0; i < ar.length; i++) {
			if (ar[i] == a) {
				System.out.printf("\nGiá trị %d đầu tiên xuất hiện trong mảng ở vị trí %d", a, i);
				break;
			}
		}

		for (i = 0; i < ar.length; i++) {
			if (ar[i] == a) {
				System.out.printf("\nGiá trị %d trong mảng ở vị trí %d", a, i);
			}
		}

		int max = ar[0];
		for (i = 1; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
				System.out.printf("\nSố lớn nhất trong mảng là %d ở vị trí %d", max, i);
			}
		}

		for (i = 0; i < ar.length; i++) {
			if (ar[i] <= a) {
				ar[i] = 0;
			}
		}

		for (int j = 0; j < ar.length; j++) {
			System.out.printf("\narr[%d] = %d", j, ar[j]);
		}
		int conCong = 0;
		for (i = 0; i < ar.length; i++) {
			if (ar[i] % 2 != 0) {
				conCong++;
				System.out.printf("\n Giá trị lẻ là arr[%d] = %d", i, ar[i]);
			}
		}
		System.out.printf("\nSau khi chuyển bằng 0 thì có %d giá trị lẻ", conCong);
	}

	static void tinhToanNhe3(int[] ar, Scanner sc) {
		int x = nhapSoNguyen(sc, "Nhập giá trị x");
		int y = nhapSoNguyen(sc, "Nhập giá trị y");

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == x) {
				ar[i] = y;
			}
		}
		for (int j = 0; j < ar.length; j++) {
			System.out.printf("\nar[%d]= %d", j, ar[j]);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = taoMang(sc);
		xuatMang(arr);
		// tinhToanNhe(arr);
		// tinhToanNhe2(arr, sc);
		tinhToanNhe3(arr, sc);
	}
}
