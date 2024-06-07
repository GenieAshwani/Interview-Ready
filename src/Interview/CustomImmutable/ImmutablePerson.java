package Interview.CustomImmutable;

public final class ImmutablePerson {
    private final String name;
    private final int age;

    private ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ImmutablePerson withAgeIncremented() {

        return new ImmutablePerson(this.name, this.age + 1);
    }

    public static ImmutablePerson createPerson(String name, int age) {
        return new ImmutablePerson(name, age);
    }

    public static void main(String[] args) {
        ImmutablePerson person = ImmutablePerson.createPerson("John", 25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Example of creating a new instance with an incremented age
        ImmutablePerson olderPerson = person.withAgeIncremented();
        System.out.println("New Age: " + olderPerson.getAge());


    }
}
