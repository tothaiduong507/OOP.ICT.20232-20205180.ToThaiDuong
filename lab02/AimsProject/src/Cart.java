public class Cart {
    public static final int MAX_NUMBERS_ORDERED =20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        for (int i = 0; i < itemsOrdered.length; i++) {
            if(itemsOrdered[i] == null ) {
                itemsOrdered[i] = disc;
                System.out.println("The disc has been added.");
                return;
            }
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for (int i = 0; i < itemsOrdered.length; i++) {
            if(itemsOrdered[i] == disc){
                itemsOrdered[i] = null;
                System.out.println("Disc removed successfully");
                return;
            }
        }
    }

    public float totalCost(){
        float totalCost = 0.0F;
        for (int i = 0; i < itemsOrdered.length; i++) {
            if(itemsOrdered[i] != null){
                totalCost += itemsOrdered[i].getCost();
            }
        }
        return totalCost;
    }
    
}
