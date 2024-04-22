import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sonuc = aravebul();
        if (sonuc!=-1){
            System.out.println(sonuc+" numaralı indeskte bulundu.");
        }
        else{
            System.out.println("bulunamadı.");
        }

    }
    public static int aravebul(){
        int[] sayilar = new int[]{1,5,6,7,8,11,19};
        Scanner input = new Scanner(System.in);
        int arananSayi = input.nextInt();
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == arananSayi) {
                return i;
            }
        }
        return -1;
    }
}
