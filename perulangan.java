public class HurufPertamaBerulang {

    public static void main(String[] args) {
        String inputString1 = "BCABC";
        String inputString2 = "ABCA";

        char hurufPertamaBerulang1 = cariHurufPertamaBerulang(inputString1);
        char hurufPertamaBerulang2 = cariHurufPertamaBerulang(inputString2);

        System.out.println("Huruf pertama yang berulang pada \"" + inputString1 + "\": " + hurufPertamaBerulang1);
        System.out.println("Huruf pertama yang berulang pada \"" + inputString2 + "\": " + hurufPertamaBerulang2);
    }

    public static char cariHurufPertamaBerulang(String input) {
        char[] hurufArray = input.toCharArray();
        char hurufPertama = '\0';

        boolean[] sudahMuncul = new boolean[256];

        for (char huruf : hurufArray) {
            if (sudahMuncul[huruf]) {
                hurufPertama = huruf;
                break;
            } else {
                sudahMuncul[huruf] = true;
            }
        }

        return hurufPertama;
    }
}
