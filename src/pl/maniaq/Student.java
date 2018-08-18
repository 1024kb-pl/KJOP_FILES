package pl.maniaq;

public class Student {
    private Long id;
    private String name;
    private String lastName;
    private Integer age;

    public Student(Long id, String name, String lastName, Integer age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + lastName + " " + age;
    }
}
