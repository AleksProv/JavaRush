package comparison_numbers.serel2;

import java.io.Serializable;

public class Human implements Serializable {
    private String name;
    private String fio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}
