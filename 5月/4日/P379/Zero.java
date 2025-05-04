interface X {}
class Zero{}
class One extends Zero{}
class Two extends Zero implements X{}
class Main{
    public static void main(String[]args){
        new Main().test(new Two());
    }

    void test(Object obj){
        if(obj instanceof X) {
            System.out.print("X ");
        }
        if(obj instanceof Zero z) {
            System.out.print("Zero ");
        }
        if(obj instanceof One o) {
            System.out.print("One ");
        }
    }
}