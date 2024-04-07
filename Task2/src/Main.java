import java.util.Arrays;

//
public class Main {
    private static java.util.Arrays Arrays;

    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(), new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(), new PickupType(), new DieselType());
        VehicleAd toyotaAd = new VehicleAd("Toyota", "654", new CarType(), new SedanType(), new PetrolType());

        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd, toyotaAd});


        adsService.filterByVehicleTypeByPurpose(new PassengerType());

        adsService.filterByVehicleTypeByPurpose(new TruckType());

        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());


        
        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());


    }
}