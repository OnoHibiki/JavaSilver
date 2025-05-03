interface X { void methodX();}
interface Y { void methodY();}

abstract class Base implements X {
    void methodA(){}
    abstract void methodB();
}

class Derived extends Base {
    public void methodX(){}; //インターフェース分
    void methodB(){};//抽象メソッド分
}