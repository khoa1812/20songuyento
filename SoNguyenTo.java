package NguyenTo;

public class SoNguyenTo {
    public static void main(String[] args) {
        int dem = 0;
        int so = 2;

        while (dem < 20) {
            if (laSoNguyenTo(so)) {
                System.out.print(so + " ");
                dem++;
            }
            so++;
        }
    }

    public static boolean laSoNguyenTo(int so) {
        for (int i = 2; i <= Math.sqrt(so); i++) {
            if (so % i == 0) {
                return false;
            }
        }
        return true;
    }

}
