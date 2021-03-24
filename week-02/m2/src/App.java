public class App {
    public static void main(String[] args) {
        // 1. instantiation
        /*The statement NationalForest one = new NationalForest();
        is a variable declaration, [type name] [name],
        followed by an assignment
        which uses the new operator to instantiate an object.
         */
        //NationalForrest one = new NationalForrest("Allegheny", "Pennsylvania", 513655);
        // 2. set a 'public' field in this case the "name" field
//        one.name = "Allegheny";
//        one.location = "Pennsylvania";
//        one.acres = 513655;

        //NationalForrest two = new NationalForrest("Angeles", 661565);
        //two.name = "Angeles";

        //NationalForrest three = new NationalForrest("Angelina");
        //three.name = "Angelina";

        //String format = "name: %s, location: %s, acres: %s%n";

        //3. read each 'public' field
        // Notice each objects fields have different values
//        System.out.printf(format, one.name, one.location, one.acres);
//        System.out.printf(format, two.name, two.location, three.acres);
//        System.out.printf(format, three.name, three.location, three.acres);
        NationalForrest one = new NationalForrest("Allegheny", "Pennsylvania", 513655);
        NationalForrest two = new NationalForrest("Angeles", "California", 661565);
        NationalForrest three = new NationalForrest("Angelina", "Texas", 154140);
        NationalForrest dixie = new NationalForrest("Dixie", "Utah", 1885655);

        System.out.println(one.toLine());
        System.out.println(two.toLine());
        System.out.println(three.toLine());
        System.out.println(dixie.toLine());

    }
}
