package comparison_numbers.serel;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private String name;
    private String pol;
    private String pasport;
    private Family family;

    public Person(int id, String name, String pol, String pasport, Family family) {
        this.id = id;
        this.name = name;
        this.pol = pol;
        this.pasport = pasport;
        this.family = family;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getPasport() {
        return pasport;
    }

    public void setPasport(String pasport) {
        this.pasport = pasport;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pol='" + pol + '\'' +
                ", pasport='" + pasport + '\'' +
                ", family=" + family +
                '}';
    }
}
