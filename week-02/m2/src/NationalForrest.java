public class NationalForrest {
    private String name;
    private String location;
    private int acres;

    // New Code: constructor
    public NationalForrest(String name, String location, int acres) {
        this.name = name;
        this.location = location;
        this.acres = acres;
    }
    // NEW CODE: calculate square Kilometers
    public int getSquareKilometers() {
        return (int) (this.acres / 247.1);
    }

    // convert this national forest to a string in line format
    public String toLine() {
        return String.format("name: %s, location: %s, acres: %s, km^2: %s", name, location, acres, getSquareKilometers());
    }

    // NEW CODE
//    public NationalForrest() {
//        this("Unknown", "Unknown", -1);
//    }
//
//    // NEW CODE
//    public NationalForrest(String name) {
//        this(name, "Unknown", -1);
//    }
//
//    // NEW CODE
//    public NationalForrest(String name, int acres) {
//        this(name, "Unknown", acres);
//    }
//
//    public NationalForrest(String name, String location, int acres) {
//        this.name = name;
//        this.location = location;
//        this.acres = acres;
//    }

}
