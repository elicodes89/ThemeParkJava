package attractions;
import behaviours.IReviewed;
import people.Visitor;

import behaviours.ISecurity;
import behaviours.ITicketed;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed, IReviewed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        return visitor.getAge() > 12 & (visitor.getHeight() > 145);
    }

    public double defaultPrice() {
        return 8.50;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() >  200) return defaultPrice() * 2;
        else
            return defaultPrice();
    }
}
