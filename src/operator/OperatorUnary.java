package operator;

public class OperatorUnary {
    public  static void main(String[] args){
        int i = 0;
        i++;                            //i tadinya 0 ditambahkan 1 sehingga i = 1
        System.out.println(i);          //betulkan i nilainya 1
        i++;                            //karena i tadinya sudah bernlai 1 maka sekarang ditambahkan lag 1 menjadi 2
        System.out.println(i);          //tuh betulkan i nilainya 2
        i=i+1;                          //bisa di liat i++ sama dengan i = i+1
        System.out.println(i);          //i tadi 2 sekarang jadi 3

        //berlaku juga untuk penambahan angka lain dan operator aritmatika lain
        i+=3;                           //sama dengan i = i+3
        System.out.println(i);

        i+=3;
        System.out.println(i);

        i*=3;                           //sama dengan i = i*3
        System.out.println(i);

        i*=3;
        System.out.println(i);

    }
}
