import java.util.Scanner;
public class HavaSicakligi {
    public static void  main(String[] args){
        int heat;

        Scanner inp=new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz: ");
        heat=inp.nextInt();

        if(heat<5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if ((5<=heat) && (heat<15)) {
            System.out.println("Sinemaya gidebilirsin.");
            System.out.println("Piknik yapabilirsiniz.");
        }else if ((10<heat)&&(heat<25)){
            System.out.println("Sinemaya gidebilirsin.");
            System.out.println("Piknik yapabilirsiniz.");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
