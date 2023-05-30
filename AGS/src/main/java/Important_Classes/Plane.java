package Important_Classes;
public class Plane {
    private String planeID;
    private String isAvaible;



    
    public Plane(String planeID, String isAvaible) {
        this.planeID = planeID;
        this.isAvaible = isAvaible;
    }




    public String getPlaneID() {
        return planeID;
    }




    public void setPlaneID(String planeID) {
        this.planeID = planeID;
    }




    public String isAvaible() {
        return isAvaible;
    }




    public void setAvaible(String isAvaible) {
        this.isAvaible = isAvaible;
    }


    
}
