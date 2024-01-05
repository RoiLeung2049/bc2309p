public class SportClubMembership {
    String userName ; 
    String startDate ; 
    String membershipLevel ; 

    public void setUserName ( String name){
      this.userName = name ; 
    }

    
    public void setStartDate ( String date){
      this.startDate = date ; 
    }

    
    public void setmembershipLevel ( String level){
      this.membershipLevel = level ; 
    }

    public String getUserName() {
      return this.userName;
    }

    
    public String getStartDate() {
      return this.startDate;
    }

    
    public String getMembershipString() {
      return this.membershipLevel;
    } 

    
}
