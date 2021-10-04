package com.maulana.kuis.pbo;

public class Owner {
    private String ownerName;
    private String ownerAddress;
    private String ownerPhoneNo;

    public Owner(String ownerName, String ownerAddress, String ownerNoPhone) {
        this.ownerName = ownerName;
        this.ownerAddress = ownerAddress;
        this.ownerPhoneNo = ownerNoPhone;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }
    public String getOwnerAddress() {
        return ownerAddress;
    }
    public void setOwnerPhoneNo(String ownerPhoneNo) {
        this.ownerPhoneNo = ownerPhoneNo;
    }
    public String getOwnerPhoneNo() {
        return ownerPhoneNo;
    }
    public void ownerInfo() {
        System.out.println("Name\t\t: " + ownerName);
        System.out.println("Address\t\t: " + ownerAddress);
        System.out.println("Phone No\t: " + ownerPhoneNo + "\n");
    }
}
