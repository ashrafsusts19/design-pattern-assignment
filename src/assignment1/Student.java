package assignment1;


public class Student implements User {
    private String name;
    private String id;

    public void setDetails(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}



