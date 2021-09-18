package ExerciseDay3.Task2;

public class Author {
    String surmane;
    String nationality;

    public Author(String surmane, String nationality) {
        this.surmane = surmane;
        this.nationality = nationality;
    }

    public String getSurmane() {
        return surmane;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Author{" +
                "surmane='" + surmane + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
    public void print(){
        System.out.println(toString());
    }
}
