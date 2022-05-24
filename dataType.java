package com.TipeDataJava;
/* Java merupakan bahasa pemrograman yang strongly typed, maka kita tidak bisa mengabaikan tipe data.
Kita harus tahu data seperti apa yang disimpan ke dalam variabel. Selain itu,
Java juga bersifat statically typed, yang artinya setiap variabel harus dideklarasikan terlebih dahulu sebelum digunakan.
 */
//Terdapat 2 (dua) jenis tipe data pada Java, yaitu tipe data primitive/primitif dan reference/referensi.
/*Tipe data primitif adalah tipe data standar yang tidak diturunkan dari objek manapun.
Tipe data primitif telah ditentukan dengan kata kuncinya masing-masing.*/

public class dataType {

    public static void main(String[] args) {

        /* Tipe data integer 8 bit yang digunakan untuk menampung angka dalam range yang kecil. Nilai minimum dan maksimum dari tipe data ini adalah -128, dan 127. Tipe data byte memiliki nilai default 0.
            Ia digunakan untuk menghemat ruang dalam array yang besar, terutama pada bilangan bulat, karena 1 (satu) byte 4 (empat) kali lebih kecil dari tipe data int.
            */
        System.out.println("===== Byte =====");
        System.out.println("nilai minimal Byte = " + Byte.MIN_VALUE);
        System.out.println("nilai maksimal Byte = " + Byte.MAX_VALUE);
        System.out.println();

        /* Short
            Merupakan tipe data integer 16 bit yang digunakan untuk menampung angka dalam range menengah, yaitu antara -32,768 sampai 32,767. Sama seperti tipe sebelumnya, nilai default-nya 0.
            Ia bisa digunakan untuk menghemat memori seperti tipe data byte namun hanya 2 (dua) kali lebih kecil dari tipe data int.
         */
        System.out.println("===== Short =====");
        System.out.println("nilai minimal Short = " + Short.MIN_VALUE);
        System.out.println("nilai maksimal Short = " + Short.MAX_VALUE);
        System.out.println();

        /* Merupakan tipe data integer 32 bit yang digunakan untuk menyimpan angka dalam range cukup besar, yakni antara -2,147,483,648 sampai 2,147,483,647
           dengan nilai default 0. Jika kita tidak memperhatikan penggunaan memori, tipe data inilah yang biasanya dipakai.
         */
        System.out.println("===== Integer =====");
        System.out.println("nilai minimal Integer = " + Integer.MIN_VALUE);
        System.out.println("nilai maksimal Integer = " +Integer.MAX_VALUE);
        System.out.println();

        /*Long
        Merupakan tipe data integer yang lebih besar jika dibandingkan dengan tipe data int. Ukurannya 64 bit dan bisa digunakan untuk menyimpan angka dengan range antara
        -9,223,372,036,854,775,808 sampai 9,223,372,036,854,775,807. Tipe data long memiliki nilai default 0L.
        */
        System.out.println("===== Long =====");
        System.out.println("nilai minimal Long = " + Long.MIN_VALUE);
        System.out.println("nilai maksimal Long = " +Long.MAX_VALUE);
        System.out.println();

        /* Float
Merupakan sebuah tipe data yang bisa digunakan untuk menampung angka desimal. Nilai default-nya 0.0f.

         */
        System.out.println("===== Float =====");
        System.out.println("nilai minimal Float = " + Float.MIN_VALUE);
        System.out.println("nilai maksimal Float = " +Float.MAX_VALUE);
        System.out.println();

        /* Double
Merupakan sebuah tipe data yang mirip seperti tipe data float,
namun memiliki kapasitas yang lebih besar. Nilai default-nya 0.0d.
         */
        System.out.println("===== Double =====");
        System.out.println("nilai minimal Double = " + Double.MIN_VALUE);
        System.out.println("nilai maksimal Double = " +Double.MAX_VALUE);
        System.out.println();

        /* Char
Merupakan sebuah tipe data yang bisa digunakan untuk menampung karakter.
Nilai karakter tersebut dibungkus di dalam tanda ' '.
         */
        System.out.println("===== Character =====");
        System.out.println("nilai minimal Character = " + Character.MIN_VALUE);
        System.out.println("nilai maksimal Character = " + Character.MAX_VALUE);
        System.out.println();

 /* Tipe data reference merupakan sebuah tipe data yang merujuk ke sebuah objek atau instance dari sebuah class.
 Salah satu tipe data yang termasuk ke dalam tipe data reference adalah string. Tipe data string menunjuk ke instance dari class java.lang.String.
  */
    }
}
