public final class Boy {
    private int age;
    private String name;
    private Qualities qualities;
    private Work work;

    public Boy(int age, String name, Qualities qualities, Work work) {
        this.age = age;
        this.name = name;
        this.qualities = qualities;
        this.work = work;

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Qualities getQualities() {
        return qualities;
    }

    public Work getWork() {
        return work;
    }

    public String getInfo() {
        return "\nAge: " + age +
                "\nName: " + name +
                "\nQualities: " + qualities +
                "\nWork profession: " + work.getProfession() +
                "\nWork salary: " + work.getSalary();
    }
}

