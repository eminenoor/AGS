

public class PilotAccount extends Account{
    
    Boolean isHealthy = false;

    public PilotAccount(String name, String role, int userID, String password){

        super(name,role,userID,password);
        this.setRolePanel(new PilotPanel(this));
    }


    //
    public void addHealthReport(){



    }


    public Boolean getIsHealthy() {
        return isHealthy;
    }


    public void setIsHealthy(Boolean isHealthy) {
        this.isHealthy = isHealthy;
    }
}
