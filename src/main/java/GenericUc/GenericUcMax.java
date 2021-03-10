package GenericUc;
import java.util.Arrays;

public class GenericUcMax<T extends Comparable<T>> {

    T [] items;


    @SafeVarargs
    public GenericUcMax(T...items)
    {
        this.items=items;
    }

    public <T extends Comparable<T>> T maximum()
    {
        Arrays.sort(items);
        return (T) items[items.length-1];
    }


}

