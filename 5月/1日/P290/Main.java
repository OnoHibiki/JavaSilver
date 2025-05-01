class Item {
    private int id;
    Item(int id) {
        this.id = id;
    }

    public void display(){
        System.out.println("Item id : " + id);
    }
}

class Clothes extends Item {
    private String brand;
    Clothes(int id, String brand) {
        super(id);
        this.brand = brand;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Clothes brand : " + brand);
    }
}

class Main {
    public static void main(String[]args){
        Clothes c = new Clothes(100,"Duke's Clothes");
        c.display();
    }    
}
