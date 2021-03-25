# Exercise06

1. Add a class to this project named `Balloon`.
2. Add two private fields:
    - `String color`: balloon's color
    - `double psi`: balloon's pressure in lbs/sq inch
3. Add a constructor that accepts a `String` color and sets the field. Do not set psi.
4. Add getters for both color and psi. (psi will always have its default value 0.0)

See Balloon.java

//FIELDS
private String color; //balloons color
private double psi; // balloon's pressure in lbs/sq inch

    //CONSTRUCTORS
    public Balloon(String color, double psi) {
        this.color = color;
        //this.psi = psi;
    }

    //Getters & Setters
    public String getColor() {return color;}
    public double getPsi() {return 0.0;}
}