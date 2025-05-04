interface One {
    default double x () {
        return 10.0;
    }
}

interface Two {
    default int x(){
        return 10;
    }
}

class Foo implements One, Two{
    public void y(){}
}

//デフォルトメソッドの競合