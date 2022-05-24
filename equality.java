package operatorEquality;

/*Operator Equality and Relational digunakan untuk menentukan dan membandingkan antara 2 variabel (operand)
yang menghasilkan nilai True atau False. */
//       ==	equal to
//       !=	not equal to
//       >	greater than
//       >=	greater than or equal to
//       <	less than
//       <=	less than or equal to
public class equality {

    public static void main(String[] args) {

        int value = 5;
        int anotherValue = 4;
        boolean result;

        result = (value == anotherValue);
        System.out.println(" hasil dari 'value == anotherValue adalah' = " + result);
        System.out.println();

        System.out.println("===== tidak sama dengan != ======");
        result = (value != anotherValue);
        System.out.println(" hasil dari 'value != anotherValue adalah' = " + result);
        System.out.println();

        System.out.println("===== lebih besar dari > ======");
        result = (value > anotherValue);
        System.out.println(" hasil dari 'value > anotherValue adalah' = " + result);
        System.out.println();

        System.out.println("===== kurang dari <  ======");
        result = (value < anotherValue);
        System.out.println(" hasil dari 'value < anotherValue adalah' = " + result);
        System.out.println();

        System.out.println("===== lebih dari sama dengan >= ======");
        result = (value >= anotherValue);
        System.out.println(" hasil dari 'value >= anotherValue adalah' = " + result);
        System.out.println();

        System.out.println("===== kurang dari sama dengan <= ======");
        result = (value <= anotherValue);
        System.out.println(" hasil dari 'value <= anotherValue adalah' = " + result);
        System.out.println();

    }
}
