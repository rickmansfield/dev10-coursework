public interface Vehicle {
    // Makes a vehicle accelerate.
    // What that means depends greatly on the vehicle.
    void accelerate();

    // Returns a well-formatted message
    // describing the velocity.
    String getVelocityMessage();
}
/*
Differences between a class declaration and an interface declaration:

-Uses the keyword interface instead of class.
-Does not include constructors.
-Method declarations are terminated with a semicolon and don't include code blocks.
-No instance fields.

Similarities:

-Names are ProperCase.
-Stored in its own source file.

The Vehicle interface defines what it means to be a vehicle -- for now it can accelerate --
but does not include executable code to solve the problem.
Instead, it tells implementing classes what they must do to qualify as a vehicle.
 */