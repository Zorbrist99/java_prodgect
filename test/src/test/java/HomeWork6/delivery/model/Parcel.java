package HomeWork6.delivery.model;

public class Parcel {

    private String recipientName;
    private String deliveryAddress;
    protected double parcelWeight;
    String trackNumber;


    public Parcel(String recipientName, String deliveryAddress, double parcelWeight, String trackNumber) {
        this.recipientName = recipientName;
        this.deliveryAddress = deliveryAddress;
        this.parcelWeight = parcelWeight;
        this.trackNumber = trackNumber;
    }

    public Parcel() {
    }

    public double getParcelWeight() {
        return parcelWeight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setParcelWeight(double parcelWeight) {
        this.parcelWeight = parcelWeight;
    }

    public double calculateDeliveryPrice() {
        return 100 + getParcelWeight() * 30;
    }

    public void printInfo() {
        System.out.printf(
                "Имя получателя: %s\nАдрес доставки: %s\nВес посылки: %f\nТрек-номер посылки: %s\n",
                getRecipientName(),
                getDeliveryAddress(),
                getParcelWeight(),
                this.trackNumber
        );

    }
}
