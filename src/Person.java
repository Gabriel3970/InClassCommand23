/**
 * @author: Gabriel Reyes Tejeda
 * @since: 1 March 2023
 * Description: This is a POJO representing a person. It will be extended.
 */
public class Person {
    private Double power = 100.0;
    String name;
    String location;

    public Person(Double power, String name, String location) {
        this.power = power;
        this.name = name;
        this.location = location;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
