package Accounts;

public class PilotAccount extends Account{
    
    Boolean isHealthy;

    public PilotAccount(String name, String role, int userID, String password){

        super(name,role,userID,password);
        this.setRolePanel(new PilotPanel());
    }


    //
    public void addHealthReport(){



    }
}
