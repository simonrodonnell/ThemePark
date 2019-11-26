package attractions;

import behaviours.IReviewed;

public class Park extends Attraction implements IReviewed {

    public Park(String name, int rating) {
        super(name, rating);
    }

    public String getName(){
        return super.name;
    }

    public int getRating(){
        return super.rating;
    }
}
