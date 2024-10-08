public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
    int result= (nb_petals)%6;
       if (result == 1) {
            return "I love you";
        } else if (result == 2) {
            return "a little";
        } else if (result == 3) {
            return "a lot";
        } else if (result == 4) {
            return "passionately";
        } else if (result == 5) {
            return "madly";
        } else {
            return "not at all";
        }
       System.out.println(howMuchILoveYou(nb_petals));
    }

}
