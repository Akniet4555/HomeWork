public class Father extends Grandfather {
    private int age;
    private String name;

    public Father(int age, String name, Qualities qualities,Work work) {
        super(age, name,qualities,work);
    }



    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    //@Override
    //public  final  String getInfo() {
        //return super.getInfo() +
                //"\nAge: " + age +
                //"\nName: " + name;
    }

