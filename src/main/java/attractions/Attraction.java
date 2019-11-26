package attractions;

public abstract class Attraction {
    protected String name;
    protected int rating;
    protected int visitCount;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
        this.visitCount = 0;
    }

//    public String getName() {
//        return name;
//    }
//
//    public int getRating() {
//        return rating;
//    }

    public int getVisitCount() {
        return visitCount;
    }
}
