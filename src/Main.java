import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// Istifadeci adi ve aldigi bali daxil edilsin, alinan bala gore hansi qiymet dushur, cap edilsin.
public class Main {
    public static void main(String[] args) {

        Scanner ad = new Scanner(System.in);
        System.out.println("Istifadechi adinizi daxil edin: ");
        String name = ad.nextLine();

        Scanner bal = new Scanner(System.in);
        System.out.println("Topladiginiz imtahan balini qeyd edin: ");
        int point = bal.nextInt();

        if(point>0 && point<51) {
        System.out.println("Tutdugunuz pille - F");
        } else if(point>=51 && point<61){
            System.out.println("Tutdugunuz pille - E");
        } else if(point>=61 && point<71){
            System.out.println("Tutdugunuz pille - D");
        } else if(point>=71 && point<81){
            System.out.println("Tutdugunuz pille - C");
        } else if(point>=81 && point<91){
            System.out.println("Tutdugunuz pille - B");
        } else if(point>=91 && point<=100){
            System.out.println("Tutdugunuz pille - A");
        }

    }
}