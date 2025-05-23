public class Main{
    public static void main(String[]args){
        int a = 1, b = 1, x = 0, y = 0;
        String[]dayOfWeek = {"Sun","Mon","Wed","Fri", "Sat"};
        for(String s : dayOfWeek){
            switch(s){
                case "Mon", "Tue":
                    x += a++;
                    //ここに、continueもbreakもない
                case "Web":
                    ++a;
                    continue;
                case "Thu","Fri":
                    y = --b;
                    break;
                case "Sat","Sun":
                    x += 2;
                    //switch式じゃないので、defaultは任意
            }
        }
        System.out.println("x:" + x + " y:" + y);
    }
}