public class AdsService {
    private VehicleAd[] adList;

    public void setAdList(VehicleAd[] adList) {
        this.adList = adList;
    }
    public void filterByVehicleTypeByPurpose(VehicleTypeByPurpose vehicleType){
        for(VehicleAd ad : adList){
            if(ad.getVehicleTypeByPurpose().equals(vehicleType)){
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: " + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " + vehicleType.getTypeName() + ", так как имеет тип авто " + ad.getVehicleTypeByPurpose().getTypeName());
            }
        }
    }
    public void filterByVehicleTypeByBodyTypes(VehicleTypeByBodyTypes vehicleType) {
        for(VehicleAd ad : adList){
            if(ad.getVehicleTypeByBodyTypes().equals(vehicleType)){
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: " + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип кузова - " + vehicleType.getTypeName() + ", критерий- " + vehicleType.getAttributeOfType() + ", так как имеет тип кузова "
                        + ad.getVehicleTypeByBodyTypes().getTypeName());;
            }
        }
    }

    public void filterByVehicleTypeByFuelTypes(VehicleTypeByFuelTypes vehicleType) {
        for(VehicleAd ad : adList){
            if(ad.getVehicleTypeByFuelTypes().equals(vehicleType)){
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: " + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " + vehicleType.getTypeName() + ", так как имеет тип авто " + ad.getVehicleTypeByFuelTypes().getTypeName());
            }
        }
    }

}

