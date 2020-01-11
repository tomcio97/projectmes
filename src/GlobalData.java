public class GlobalData {
    private int id1;
    private int id2;
    private int bc;

    private static double alpha = 10;
    private static double q = -150;
    private static double tOtocz = 400;

    private double s;
    private double k;
    private double lg;


    public Matrix HL = new Matrix();

    public Matrix BL = new Matrix();

    public double[] P = new double[2];

    public GlobalData(int id1, int id2, int bc, double s, double k, double lg) {
        this.id1 = id1;
        this.id2 = id2;
        this.bc = bc;
        this.s = s;
        this.k = k;
        this.lg = lg;
        //wypelnianie macierzy HL
        double c = s * k/ lg;
        HL.matrix[0][0] = c;
        HL.matrix[0][1] = -c;
        HL.matrix[1][0] = -c;
        HL.matrix[1][1] = c;

        //Wypelnianie macierzy BL i wektora P
        if(bc == 1)
        {
            P[0] = q*s;
        }
        else if(bc==2)
        {
            BL.matrix[1][1] = alpha * s;
            P[1] = -alpha *s*tOtocz;
        }

    }



    public GlobalData() {
    }

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public int getBc() {
        return bc;
    }

    public void setBc(int bc) {
        this.bc = bc;
    }


    public double getAlfa() {
        return alpha;
    }

    public void setAlfa(double alfa) {
        this.alpha = alfa;
    }

    public double getQ() {
        return q;
    }

    public void setQ(double q) {
        this.q = q;
    }

    public double gettOtocz() {
        return tOtocz;
    }

    public void settOtocz(double tOtocz) {
        this.tOtocz = tOtocz;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public double getLg() {
        return lg;
    }

    public void setLg(double lg) {
        this.lg = lg;
    }

    public double[] getP() {
        return P;
    }

    public void setP(double[] p) {
        P = p;
    }
}
