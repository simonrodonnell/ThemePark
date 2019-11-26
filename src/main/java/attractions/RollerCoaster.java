package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getHeight() > 1.45 && visitor.getAge() > 12){
            return true;
        } else {
            return false;
        }
    }

    public String getName(){
        return super.name;
    }

    public int getRating(){
        return super.rating;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() > 2.00){
            return defaultPrice() * 2;
        } else {
            return defaultPrice();
        }
    }
}
