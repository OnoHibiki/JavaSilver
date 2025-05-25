public class Today{
    public static void main(String[]args){
        String country = "Sydney";
        String when = "今日";
        String who = "私は";
        System.out.println(who + when  + country + "にいます");

        human human = new human("HibikiOno",30,"Japan");

    }

    class human{
        String name;
        int age;
        String country;

        human(String name,int age,String country){
            this.name = name;
            this.age = age;
            this.country = country;

            System.out.println(this.name + ":" + this.age + "歳" + this.country + "出身");
        }
    }
}