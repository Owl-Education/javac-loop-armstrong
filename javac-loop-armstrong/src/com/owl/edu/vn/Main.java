package com.owl.edu.vn;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 999; i++) {
            int tongBinhPhuong = tinhTongBinhPhuongChuSo(i);
            if (i == tongBinhPhuong) {
                System.out.println(i);
            }
        }
    }

    public static int tinhTongBinhPhuongChuSo(int n) {
        int tong = 0;
        while (n > 0) {
            int chuSo = n % 10;
            tong += chuSo * chuSo * chuSo;
            n /= 10;
        }
        return tong;
    }
}
