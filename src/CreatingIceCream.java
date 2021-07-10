import java.util.Arrays;
import java.util.List;

public class CreatingIceCream {

    public void listIceCream() {
        List<IceCream> iceCreams =
                Arrays.asList(new IceCream("melba", Taste.BERRY, 3, Toping.chocolateBars, 4.2),
                        new IceCream("melba",Taste.CARAMEL, 2, Toping.coconutShavings, 3.5),
                        new IceCream("melba", Taste.HAZELNUT, 1, Toping.marshmallow, 2.2),
                        new IceCream("melba", Taste.CHOCOLATE, 3, Toping.chocolateBars, 4.5));
    }
}
