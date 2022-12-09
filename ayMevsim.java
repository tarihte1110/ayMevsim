import java.util.*;
public class ayMevsim {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Hangi ayda olduğunuzu giriniz"+"(Lütfen tüm karakterleri küçük harfler şeklinde giriniz.) :");
        String ay= input.nextLine();
        System.out.print("MEVSİM:");

        switch(ay){
            case "ocak":
                System.out.print("KIŞ");
                  break;
            case "şubat":
                System.out.print("KIŞ");
                  break;
            case "mart":
                System.out.print("İLKBAHAR");
                  break;
            case "nisan":
                System.out.print("İLKBAHAR");
                  break;
            case "mayıs":
                System.out.print("İLKBAHAR");
                  break;
            case "haziran":
                System.out.print("YAZ");
                  break;
            case "temmuz":
                System.out.print("YAZ");
                  break;
            case "ağustos":
                System.out.print("YAZ");
                  break;
            case "eylül":
                System.out.print("SONBAHAR");
                  break;
            case "ekim":
                System.out.print("SONBAHAR");
                  break;
            case "kasım":
                System.out.print("SONBAHAR");
                  break;
            case "aralık":
                System.out.print("KIŞ");
                  break;
            default:
                System.out.print("Hatalı giriş yaptınız!");







        }






    }
}
