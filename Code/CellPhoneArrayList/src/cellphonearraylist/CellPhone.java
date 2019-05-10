package CellPhoneArrayList;

public class CellPhone {
    private String phoneNumber;
    private String ownerName;

    public CellPhone(){
    phoneNumber = null;
    ownerName = null;
}

    public CellPhone(String phoneNumber, String ownerName) {
        this.phoneNumber = phoneNumber;
        this.ownerName = ownerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
  
}
