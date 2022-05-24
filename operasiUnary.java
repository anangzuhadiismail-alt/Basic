package com.operatorUnary;
/*Merupakan operator yang melakukan berbagai operasi Aritmatik yang hanya melibatkan satu operand.
Operasi-operasi tersebut dapat berupa penambahan, pengurangan atau membalik suatu nilai dari bolean

+	Operator Unary positif
-	Operator Unary negatif
++	Operator penambahan; peningkatan nilai sebesar 1 point
--	Operator pengurangan,; pengurangan nilai sebesar 1 point
!	Operator negasi komplemet logika, operator; membalikan sebuah nilai bolean

 */

public class operasiUnary {

    public static void main(String[] args) {

        System.out.println("===== operator unary Plus =====");
         int nilaiAwal = 8;
         int hasil = +nilaiAwal;
        System.out.println(" hasil dari +8 = " + hasil);
        System.out.println();

        System.out.println("===== operator unary min =====");
        int nilaiAwal2 = 8;
        int hasil2 = -nilaiAwal;
        System.out.println(" hasil dari -8 = " + hasil2);
        System.out.println();

        System.out.println("===== operator unary increment =====");
        int nilaiAwal3 = 8;
        nilaiAwal3++;
        System.out.println(" hasil dari 8++ = " + nilaiAwal3);
        System.out.println();

        System.out.println("===== operator unary decrement =====");
        int nilaiAwal4 = 8;
        nilaiAwal4--;
        System.out.println(" hasil dari 8-- = " + nilaiAwal4);
        System.out.println();

        System.out.println("===== operator unary negasi  =====");
        boolean sukses = false;
        System.out.println(" hasil dari sukses = " + !sukses);
        System.out.println();
    }
}
