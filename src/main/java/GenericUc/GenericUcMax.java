package GenericUc;

public class GenericUcMax {
    public int getIntegerMaximum(Integer N1, Integer N2, Integer N3) {
        if (N1.compareTo(N2) > 0 && N1.compareTo(N3) > 0)
            return N1;
        else if (N2.compareTo(N3) > 0 && N2.compareTo(N1) > 0)
            return N2;
        else
            return N3;
    }

    public Double getDoubleMaximum(Double N1, Double N2, Double N3) {
        if (N1.compareTo(N2) > 0 && N1.compareTo(N3) > 0)
            return N1;
        else if (N2.compareTo(N3) > 0 && N2.compareTo(N1) > 0)
            return N2;
        else
            return N3;
    }

    public String getStringMaximum(String S1, String S2, String S3) {
        if (S1.compareTo(S2) > 0 && S1.compareTo(S3) > 0)
            return S1;
        else if (S2.compareTo(S3) > 0 && S2.compareTo(S1) > 0)
            return S2;
        else
            return S3;
    }
}


