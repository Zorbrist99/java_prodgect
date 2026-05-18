package HomeWork6.delivery.service;

import HomeWork6.delivery.model.Parcel;

public class ParcelService {

    public void printParcelsReport(Parcel[] parcels){

        for (int i = 0; i < parcels.length; i++) {
            parcels[i].printInfo();
            System.out.println(parcels[i].calculateDeliveryPrice());
            System.out.println(" ");
        }
    }
}
