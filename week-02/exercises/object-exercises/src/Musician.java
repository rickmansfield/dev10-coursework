public class Musician {

    //FIELDS - Class-Level Variables, also called Fields (not necessarily required.)
    private String name;
    private int rating;

    /**
     * @param name   The name of the musician.
     * @param rating A number representing how much a musician is loved relative to other musicians.
     */
    //CONSTRUCTOR - this is the constructor for this musician class (not necessarily required.)
    public Musician(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    //This is an empty constructor
    public Musician() {

    }
    // Getters & Setter (not necessarily required.)
    public String getName() { return name; }
    public int getRating() {
        return rating;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
//test change.
}
