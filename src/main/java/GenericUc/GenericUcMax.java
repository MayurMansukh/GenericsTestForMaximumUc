package GenericUc;




public class GenericUcMax {

    public <G extends Comparable<G>> G getMaximum(G P, G Q, G R) {
        if (P.compareTo(Q) > 0 && P.compareTo(R) > 0)
            return P;
        else if (Q.compareTo(R) > 0 && Q.compareTo(P) > 0)
            return Q;
        else
            return R;
    }

}


