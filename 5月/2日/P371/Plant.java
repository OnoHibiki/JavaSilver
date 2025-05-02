class Plant {
    public Plant(){
        System.out.println("Plant");
    }
    public Plant(int id){
        this();
        System.out.println("Plant" + id);
    }
}

class Vegetable extends Plant {
    public Vegetable(int id){
        System.out.println("Vegetable" + id);
    }
}

class Tomato extends Vegetable {
    public Tomato(int id){
        super(id);
        System.out.println("Tomato");
    }
    public static void main(String[]args){
        new Tomato(1);
    }
}