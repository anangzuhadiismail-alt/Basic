package operatorKondisi;

public class condition {
/* Operator Conditional digunakan pada dua atau lebih ekspresi boolean. Pada operator ini, nilai dari operator kedua, ketiga dst menjadi pertimbangan
hasil dari true atau false, bila diperlukan.
*/
//     &&	Conditional-AND
//     ||	Conditional-OR
    public static void main(String[] args) {

        int value = 5;
        int anothervalue = 8;

        System.out.println(" condition And && ");
         boolean result = (value == 3 && anothervalue == 8);
         boolean anotherResult = (value != 3 && anothervalue == 8);
        System.out.println("hasil operator And pada 'value == 3 dan anotherValue == 8 adalah : " + result);
        System.out.println("hasil operator And pada 'value != 3 dan anotherValue == 8 adalah : " + anotherResult);
        System.out.println();

        System.out.println(" condition OR || ");
        boolean result1 = (value == 3 || anothervalue == 8);
        boolean anotherResult1 = (value != 3 || anothervalue == 8);
        System.out.println("hasil operator And pada 'value == 3 dan anotherValue == 8 adalah : " + result1);
        System.out.println("hasil operator And pada 'value != 3 dan anotherValue == 8 adalah : " + anotherResult1);
        System.out.println();
    }
}
