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
public class hinhchunhat extends Hinh{
    float dai,rong;
    @Override
//    public void main(){
//        h=new hinhchunhat();
//    }
    public void Nhapcanh() {
        System.out.printf("Nhap chieu dai: ");
        dai=sc.nextFloat();
        System.out.printf("Nhap chieu rong: ");
        rong=sc.nextFloat();
    }
    public void Tinhchuvi(){
        System.out.println("Chu vi hinh vuong la: "+(dai+rong)*2);
    }
    public void Tinhdientich(){
        System.out.println("Dien tich hinh vuong la: "+dai*rong);
    }
    public void VeHinh(){
        int a=Math.round(dai);
        int b=Math.round(rong);
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.printf("*\t");
            }
            System.out.println("");
        }
    }
}
