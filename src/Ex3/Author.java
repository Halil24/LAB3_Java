package Ex3;

public class Author {
    private String name;
    private String surname;
    Author(String n, String sn) {
        name = n;
        surname = sn;
    }
public String getFirstName() {
        return name;
}
public String getLastName() {
        return surname;
}

public void setName(String nm) {
        name=nm;
    }
    public void setLastName(String snm) {
        surname=snm;
    }

}
