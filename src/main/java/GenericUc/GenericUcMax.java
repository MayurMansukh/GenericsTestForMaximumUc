package GenericUc;
public class GenericUcMax<G extends Comparable<G>> {

    G P, Q, R;

    public GenericUcMax(G P,G Q,G R) {
        this.P = P;
        this.Q = Q;
        this.R = R;
    }
    public G maximum()
    {
        return GenericUcMax.getMaximum(P,Q,R);
    }


    public static <G extends Comparable<G>> G getMaximum(G P, G Q, G R) {
        if (P.compareTo(Q) > 0 && P.compareTo(R) > 0)
            return P;
        else if (Q.compareTo(R) > 0 && Q.compareTo(P) > 0)
            return Q;
        else
            return R;
    }
}

