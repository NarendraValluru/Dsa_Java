public class Inventory {
    String name;
    double price;
    int quantity;

    Inventory(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public double prodPrice(){
        return price*quantity;
    }

    public void displayItems(){
        System.out.println("Product :" +this.name+ ", price: Rs."+this.price+", quantity: "+this.quantity);
    }

    public static void main(String[] args) {
        Inventory i1=new Inventory("Laptop", 95000, 2);
        i1.displayItems();
        System.out.println("total cost of " +i1.quantity+" product is "+i1.prodPrice());
        System.out.println("==========================================");
        Inventory i2=new Inventory("Iphone15", 80000, 2);
        i2.displayItems();
        System.out.println("total cost of " +i2.quantity+" product is "+i2.prodPrice());
        System.out.println("==========================================");
        Inventory i3=new Inventory("Galaxy S23", 60000, 2);
        i3.displayItems();
        System.out.println("total cost of " +i3.quantity+" product is "+i3.prodPrice());
    }
}
