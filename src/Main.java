public class Main {
    public static void main(String[] args) {
        Work work = new Work("Продавец",20000);
        Grandfather grandfather = new Grandfather(69,"Олег Петрович",Qualities.GOOD,work);
        System.out.println(grandfather.getInfo());

        System.out.println("-----------------------------");

        work = new Work("Бизнесмен", 100000);
        Father father = new Father(45,"Иван Сергеивич",Qualities.BAD,work);
        System.out.println(father.getInfo());

        System.out.println("------------------------------");

        work = new Work("programmer",20000000);
        Boy boy = new Boy(19,"Аскат",Qualities.BEAUTIFUL,work);
        System.out.println(boy.getInfo());
    }
}