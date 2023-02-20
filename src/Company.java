public class Company {
    private String address;
    private int java;
    private int android;
    private int go;
    private String ownerName;

    public Company() {
    }

    public Company(String address, int java, int android, int go, String ownerName) {
        this.address = address;
        this.java = java;
        this.android = android;
        this.go = go;
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Company: " + "address, " + address + ", java " + java + ", android " + android + ", go " + go + " ownerName " + ownerName + ".";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getAndroid() {
        return android;
    }

    public void setAndroid(int android) {
        this.android = android;
    }

    public int getGo() {
        return go;
    }

    public void setGo(int go) {
        this.go = go;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
