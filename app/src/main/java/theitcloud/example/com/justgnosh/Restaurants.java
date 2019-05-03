package theitcloud.example.com.justgnosh;

public class Restaurants {

    private String name;
    private String firstLineAddress;
    private String secondLineAddress;
    private String postcode;
    private String phoneNumber;

    public Restaurants(String name, String firstLineAddress, String secondLineAddress, String postcode, String phoneNumber){

        this.name = name;
        this.firstLineAddress = firstLineAddress;
        this.secondLineAddress = secondLineAddress;
        this.postcode = postcode;
        this.phoneNumber = phoneNumber;
    }

    /*Bunch of getters for the restaurant class*/

    public String getName(){
        return name;
    }

    public String getFirstLineAddress(){
        return firstLineAddress;
    }

    public String getSecondLineAddress(){
        return secondLineAddress;
    }

    public String getPostcode(){
        return postcode;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
}
