public class VehicleTypeByPurpose extends VehicleType{
    public VehicleTypeByPurpose(){
        super("Vehicle type by purpose");
    }
    public boolean equals(Object object){
        if(object == null || getClass() != object.getClass()) return false;

        VehicleTypeByPurpose that = (VehicleTypeByPurpose) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }
}
