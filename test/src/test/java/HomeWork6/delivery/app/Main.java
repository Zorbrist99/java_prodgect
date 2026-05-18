package HomeWork6.delivery.app;

import HomeWork6.delivery.model.ExpressParcel;
import HomeWork6.delivery.model.FragileParcel;
import HomeWork6.delivery.model.Parcel;
import HomeWork6.delivery.service.ParcelService;

public class Main {

    static void main(String[] args) {
        Parcel parcel = new Parcel(
                "Vadim",
                "Lenina str.",
                12.22,
                "AA-12");

        FragileParcel fragileParcel = new FragileParcel(
                "Anatoliy",
                "Marksa str.",
                8.22,
                "BB-13",
                true);

        ExpressParcel expressParcel = new ExpressParcel(
                "Maks",
                "Verch str.",
                55.44,
                "CC-33",
                12);

        Parcel parcel1 = new Parcel();

        Parcel[] parcels = {parcel, fragileParcel, expressParcel, parcel1};

        ParcelService parcelService = new ParcelService();
        parcelService.printParcelsReport(parcels);
    }
}
