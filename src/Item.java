public class Item {
    private double itemCode;
    private String Name;

    public Item(double C, String N){
        itemCode = C;
        Name = N;
    }

    public void getitemDetails(){
        System.out.println("the item code is: "+ itemCode );
        System.out.println("the item name is: "+ Name);
    }
}
