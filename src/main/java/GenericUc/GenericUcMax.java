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


    public static void main(String[] args) {
        GenericUcMax obj=new GenericUcMax();
        obj.getDoubleMaximum(10.0,20.0,30.0);

    }
}