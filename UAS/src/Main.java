import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String namaChar1, namaChar2;
        int addHp1, addAtk1, addDef1, addHp2, addAtk2, addDef2, tipeChar1, tipeChar2;

        //Mengambil input untuk membuat player 1
        System.out.println("1. Tank \n2. Fighter \n3. Assassin \n4. Wizard");
        System.out.print("Masukkan Nama Karakter Player1 : ");
        namaChar1 = scan.next();

        System.out.print("Masukkan Tipe Karakter : ");
        tipeChar1 = scan.nextInt();

        System.out.println("Anda memiliki 10 additional point untuk mengupgrade Hero anda");
        System.out.println("Masukkan additional point untuk Hp : ");
        addHp1 = scan.nextInt();

        System.out.println("Masukkan additional point untuk Atk : ");
        addAtk1 = scan.nextInt();

        System.out.println("Masukkan additional point untuk Def : ");
        addDef1 = scan.nextInt();

        Hero player1 = new Hero(namaChar1, tipeChar1, addHp1, addAtk1, addDef1);

        System.out.println(player1.wizard().FinalHp);
        System.out.println(player1.tank().FinalHp);

        //Mengambil input untuk membuat player 2
        System.out.print("Masukkan Nama Karakter Player2 : ");
        namaChar2 = scan.next();

        System.out.print("Masukkan Tipe Karakter : ");
        tipeChar2 = scan.nextInt();

        System.out.println("Anda memiliki 10 additional point untuk mengupgrade Hero anda");
        System.out.println("Masukkan additional point untuk Hp : ");
        addHp2 = scan.nextInt();

        System.out.println("Masukkan additional point untuk Atk : ");
        addAtk2 = scan.nextInt();

        System.out.println("Masukkan additional point untuk Def : ");
        addDef2 = scan.nextInt();

        Hero player2 = new Hero(namaChar2, tipeChar2, addHp2, addAtk2, addDef2);

        System.out.println(player2.wizard().FinalHp);
        System.out.println(player2.tank().FinalHp);



    }
}