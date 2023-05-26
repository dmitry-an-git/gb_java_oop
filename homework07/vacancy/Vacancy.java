package vacancy;

public class Vacancy {

    private MktPosition position;
    private String nameCompany;
    private Double salary;
    private Integer skill;

    public Vacancy(String nameCompany, MktPosition position, Double salary, Integer skill){
        this.nameCompany = nameCompany;
        this.position = position;
        this.salary = salary;
        this.skill = skill;
    }

    public Double getSalary() {
        return salary;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public Integer getSkill() {
        return skill;
    }

    public MktPosition getPosition() {
        return position;
    }
}
