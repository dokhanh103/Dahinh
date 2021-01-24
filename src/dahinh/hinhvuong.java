/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dahinh;

/**
 *
 * @author 8470P
 */
public class hinhvuong extends Hinh {
    float canh;
    @Override
//    public void main(){
//        h=new hinhvuong();
//    }
    public void Nhapcanh() {
        System.out.printf("Nhap canh:");
        canh=sc.nextFloat();
    }
    public void Tinhchuvi(){
        System.out.println("Chu vi hinh vuong la: "+canh*4);
    }
    public void Tinhdientich(){
        System.out.println("Dien tich hinh vuong la: "+canh*canh);
    }
    public void VeHinh(){
        int a=Math.round(canh);
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                System.out.printf("*\t");
            }
            System.out.println("");
        }
    }

}
