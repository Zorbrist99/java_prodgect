package HomeWork6.delivery.model;

public class ExpressParcel extends Parcel {

    private int deliveryHours;

    public ExpressParcel(String recipientName,
                         String deliveryAddress,
                         double parcelWeight,
                         String trackNumber,
                         int deliveryHours) {
        super(recipientName, deliveryAddress, parcelWeight, trackNumber);
        this.deliveryHours = deliveryHours;
    }

    public double calculateDeliveryPrice() {
        return deliveryHours < 24 ? super.calculateDeliveryPrice() + 500 : super.calculateDeliveryPrice();
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Delivery deadline: " + this.deliveryHours);
    }

}
