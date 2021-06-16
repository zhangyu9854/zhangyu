package HouseRent;

public class House {
    private int ID;
    private String name;
    private int phone;
    private String address;
    private double rentMoney;
    private String state;

    public House(int ID, String name, int phone, String address, double rentMoney, String state) {
        this.ID = ID;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rentMoney = rentMoney;
        this.state = state;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRentMoney() {
        return rentMoney;
    }

    public void setRentMoney(double rentMoney) {
        this.rentMoney = rentMoney;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return ID + "\t"
                + name + "\t" +
                phone + "\t" +
                address + "\t" +
                rentMoney + "\t" +
                state;
    }
}
