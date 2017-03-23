/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author ASUS
 */
public class ubah {
    private int angka;
    private String[] huruf;
    public String getAngkaHuruf(int pembagi){
        if(pembagi==1)
            return "";
        else if((angka%pembagi/10)==1&&angka%10!=0)
            return getAngkaHuruf(10)+"belas";
        switch((angka%pembagi)/(pembagi/10)){
            case 1:if(pembagi>=100||angka==11)
                        return " Se-"+getSatuan(pembagi)+getAngkaHuruf(pembagi/10);
                    else
                        return " Satu";
            case 2:return " Dua "+getSatuan(pembagi)+getAngkaHuruf(pembagi/10);
            case 3:return " Tiga "+getSatuan(pembagi)+getAngkaHuruf(pembagi/10);
            case 4:return " Empat "+getSatuan(pembagi)+getAngkaHuruf(pembagi/10);
            case 5:return " Lima "+getSatuan(pembagi)+getAngkaHuruf(pembagi/10);
            case 6:return " Enam "+getSatuan(pembagi)+getAngkaHuruf(pembagi/10);
            case 7:return " Tujuh "+getSatuan(pembagi)+getAngkaHuruf(pembagi/10);
            case 8:return " Delapan "+getSatuan(pembagi)+getAngkaHuruf(pembagi/10);
            case 9:return " Sembilan "+getSatuan(pembagi)+getAngkaHuruf(pembagi/10);
            default:return getAngkaHuruf(pembagi/10);
        }
    }
    public String getAngkaHuruf(){
        if(angka>1000)
            return "Melebihi batas";
        else if(angka<1000&&angka!=0)
            return getAngkaHuruf(1000);
        else if(angka==0)
            return "nol";
        else
            return "Seribu";
    }
    public String getSatuan(int y){
        switch (y) {
            case 1000:
                return "Ratus";
            case 100:
                return "Puluh";
            default:
                return "";
        }
    }
    public int getHurufAngka(String[] huruf,int x){
        if(x<=0){
            return 0;
        }
        if(huruf[x-1].equalsIgnoreCase("Satu"))return 1+(getHurufAngka(huruf,x-1));
        else if(huruf[x-1].equalsIgnoreCase("Sepuluh"))return 10;
        else if(huruf[x-1].equalsIgnoreCase("Seratus"))return 100;
        else if(huruf[x-1].equalsIgnoreCase("Sebelas"))return 11;
        else if(huruf[x-1].equalsIgnoreCase("belas"))return getHurufAngka(huruf,x-1)+10;
        else if(huruf[x-1].equalsIgnoreCase("puluh")){
            if(x-1==0)
                return 10*getHurufAngka(huruf,x-1);
            else
                return (10*getHurufAngka(huruf,x-1));
        }
        else if(huruf[x-1].equalsIgnoreCase("ratus")){
            if(huruf.length!=5)return 100*getHurufAngka(huruf,x-1);
            else return 10*getHurufAngka(huruf,x-1);
        }
        else if(huruf[x-1].equalsIgnoreCase("Dua"))return 2+(getHurufAngka(huruf,x-1));
        else if(huruf[x-1].equalsIgnoreCase("Tiga"))return 3+(getHurufAngka(huruf,x-1));
        else if(huruf[x-1].equalsIgnoreCase("Empat"))return 4+(getHurufAngka(huruf,x-1));
        else if(huruf[x-1].equalsIgnoreCase("Lima"))return 5+(getHurufAngka(huruf,x-1));
        else if(huruf[x-1].equalsIgnoreCase("Enam"))return 6+(getHurufAngka(huruf,x-1));
        else if(huruf[x-1].equalsIgnoreCase("Tujuh"))return 7+(getHurufAngka(huruf,x-1));
        else if(huruf[x-1].equalsIgnoreCase("Delapan"))return 8+(getHurufAngka(huruf,x-1));
        else if(huruf[x-1].equalsIgnoreCase("Sembilan"))return 9+(getHurufAngka(huruf,x-1));
        else return 0+(getHurufAngka(huruf,x-1));
    }
    public ubah(int angka){
        this.angka = angka;    
    }
    public ubah(String[] huruf){
        this.huruf = huruf;
    }
}