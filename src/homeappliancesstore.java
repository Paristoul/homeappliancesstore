public class homeappliancesstore {


    static String onetair,dieuthinsi;
    static int ypal;

    public static void main(String[]args) {
        onetair=args[1];
        dieuthinsi=args[2];
        ypal=Integer.parseInt(args[3]);
        if (onetair == null || dieuthinsi == null) {
            System.out.println("To onoma ths etairias,dieuthinsi den dilothikan sosta");
        }
        else{
            System.out.println("\nTo onoma etairias einai: " + onetair);
            System.out.println("\nH dieuthinsi einai: " + dieuthinsi);
            System.out.println("\nOi ypallhloi einai: " + ypal);
        }
         catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Den dothike int");
        }


    }
}