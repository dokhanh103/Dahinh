/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dahinh;

import java.util.Scanner;

/**
 *
 * @author 8470P
 */
public class Dahinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("1.Thao tac voi hinh vuong");
        System.out.println("2.Thao tac voi hinh chu nhat");
        System.out.println("3.Ket thuc");

        Hinh hinh = new Hinh();
        do {
            System.out.printf("Nhap lua chon:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    hinh = new hinhvuong();
                    hinh.Nhapcanh();
                    hinh.Tinhchuvi();
                    hinh.Tinhdientich();
                    hinh.VeHinh();
                    break;
                case 2:
                    hinh = new hinhchunhat();
                    hinh.Nhapcanh();
                    hinh.Tinhchuvi();
                    hinh.Tinhdientich();
                    hinh.VeHinh();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } while (choice <= 3);
    }

}
