package CucumberStepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FirstCucumberTestStepDef {

    private List<Student> students = new ArrayList<Student>();
    private Integer age;

    @Given("student count is ([0-9]+)") //- jebkurš skaitlis, kur katrs simbols ir no 0 - 9
    public void set_student_count(int count) { //raksta funkciju
        int studentCount = count; //šajā mainīgajā studentCount tiks saglabāts count
    }

    @Given("student with attributes")
    public void set_student(Map<String, String> params) { //šo visu pieglabāsim objektos un taisa jaunu klasi iekš Student.java
        Student student = new Student(); //Taisa studenta kopiju (tāpēc ar mazo burtu), kas tika uztaisīts Student.java
        student.setName(params.get("name")); //uzseto parametrus
        student.setPersonalCode(params.get("pk"));
        student.setAge(Integer.valueOf(params.get("age")));

        //Tagad šo sarakstu vajag pieglabāt sarakstā, tākā šo sarakstu ir jāredz arī citam stepdefam, tad liek klases līmenī augšā List<Student>

        students.add(student); //Sarakstā ieliek studentus
    }

    @When("we are getting last student age")
    public void get_last_age() { //funkcija neko nesaņems, tāpēc tukšs, izveido age klases līmenī, jo arī apakšējā rindiņa šo izmantos
        age = students.get(students.size() - 1).getAge(); //izmanto getteru age, lai no tā objekta nolasītu vērtību (tas ir getters, nolasa, setteris - uzseto)
    }

    @Then("this age must be ([0-9]*)")
        public void check_age(Integer ageToCheck){
        Assertions.assertEquals(age, ageToCheck, "Wrong age");
    }


}
