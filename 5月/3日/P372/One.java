
class One {
    int no;
    public One(int no) {
        this.no = no;
    }
    public String toString(){
        return "One:" + no;
    }
}

class Two extends One {
    String text;
    public Two(String text){
        super(0);
        this.text=text;
    }

    public String toString(){
        return super.toString()+", Two:" + text;
    }

    public static void main(String[]args){
        System.out.println(new One(1));
        System.out.println(new Two("Two"));
    }
}
