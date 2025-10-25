package blatt08;

public class test {
    public static void main(String[] args) {
        int t = 3;
        int m = 11;
        int j = 2018;
        char[] datum = new char[10];
        datum[2] = '.';
        datum[5] = '.';


        if (t < 10) {
            datum[0] = '0';
            datum[1] = (char) (t + 48);
        } else {
            int tx = t /10;
            datum[0] = (char) (tx + 48);
            tx = t - tx * 10;
            datum[1] = (char) (tx + 48);
        }

        if (m < 10) {
            datum[3] = '0';
            datum[4] = (char) (m + 48);
        } else {
            int mx = m /10;
            datum[3] = (char) (mx + 48);
            mx = m - mx * 10;
            datum[4] = (char) (mx + 48);
        }

        if (j < 10) {
            datum[6] = '0';
            datum[7] = '0';
            datum[8] = '0';
            datum[9] = (char) (j + 48);
        } else if (j < 100) {
            int jx = j / 10;
            datum[6] = '0';
            datum[7] = '0';
            datum[8] = (char) (jx + 48);
            jx = j - jx * 10;
            datum[9] = (char) (jx + 48);
        } else if (j < 1000) {
            int jx = j / 100;
            datum[6] = '0';
            datum[7] = (char) (jx + 48);
            jx = (j - jx * 100) / 10;
            datum[8] = (char) (jx + 48);
            jx = j - jx * 10;
            datum[9] = (char) (jx + 48);
        } else {
            int jx = j / 1000;
            datum[6] = (char) (jx + 48);
            int jy = jx * 1000;
            jx = (j - jy) / 100;
            datum[7] = (char) (jx + 48);
            jy += jx * 100;
            jx = (j - jy) / 10;
            datum[8] = (char) (jx + 48);
            jy += jx * 10;
            jx = j - jy;
            datum[9] = (char) (jx + 48);
        }
        for (int i = 0; i < datum.length; i++) {
            System.out.print(datum[i]);
        }
    }
}
