public class Balloon {

    //FIELDS
    private String color; //balloons color
    private double psi; // balloon's pressure in lbs/sq inch

    //CONSTRUCTORS
    public Balloon(String color, double psi) {
        this.color = color;
        this.psi = psi;
    }

    //Getters & Setters
    public String getColor() {return color;}
    public double getPsi() {return psi;}

    //Methods
    public void inflate(){
        this.psi = this.psi + Math.random() * 5.0;
    }

    public boolean isExploded(){
        if (psi > 16.0) {
            return true;
            //return Double.POSITIVE_INFINITY;
        } else {
            return false;
            //return this.psi;}
    }
}
