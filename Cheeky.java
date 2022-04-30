public class Cheeky{
    public static void main(String[] args) {
        String secret = "Sonya is the most beautiful girl in all of DKE and she's mine";
        int amountOfTimesICanSayTheSecretBeforeIPassOut = 3087;
        for(int i = 0; i<amountOfTimesICanSayTheSecretBeforeIPassOut;i++){
            System.out.printf("%d : %s\n", i, secret);
        }
    }
}