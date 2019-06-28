package CucumberStepDefinitions;

public class Student {
    private String name;
    private String personalCode;
    private Integer age; //vajag setot tagad getteri un setteri, jo katram objektam ir getters un setters

    //Getters un Setters ir katram objektam, katram parametram. Get - dabū, set - uzseto. Izmanto pluginu Lumbok.
//Alt + insert vai Code ->  generate ->  getter un setter.

    public String getName() {
        return name;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

