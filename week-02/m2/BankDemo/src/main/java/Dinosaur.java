import java.util.Objects;

public class Dinosaur {

    private String name;

    private boolean isCarnivore;

    public Dinosaur(String name, boolean isCarnivore) {
        this.name = name;
        this.isCarnivore = isCarnivore;

    }

    public String getName() { return name;}

    public void setName(String name) { this.name = name; }

    public boolean isCarnivore() { return isCarnivore;}

    public void setCarnivore(boolean carnivore) { isCarnivore = carnivore; }


    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Dinosaur other = (Dinosaur) obj;
        //return super.equals(obj);
        if (!Objects.equals(name, other.name)) {

        }
        if (!Objects.equals(isCarnivore, other.isCarnivore)){
            return false;
        }
    }



}
