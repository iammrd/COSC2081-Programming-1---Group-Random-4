package Customer;

public class Customer {
    private static String customerID;
    private static String fullName;
    private static String email;
    private static String address;
    private static String phoneNum;
    private static String membership;
    private static String userName;
    private static String password;


    public static String getCustomerID(){
        return customerID;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public static String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public static String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public static String getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public static String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public static String getFullName() {
        return fullName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public static String getEmail() {
        return email;
    }
    public static String getMembership() {
        return membership;
    }
    public void setMembership(String membership) {
        this.membership = membership;
    }
}
