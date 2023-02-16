import java.util.Arrays;

public class Company {
    private  String address;
    private   Java[] java;
    private  Android[] android;
    private   Go[] go;
    private  String ownerName;

    public Company(String address, Java[] java, Android[] android, Go[] go, String ownerName) {
        this.address = address;
        this.java = java;
        this.android = android;
        this.go = go;
        this.ownerName = ownerName;
    }

    public Company() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Java[] getJava() {
        return java;
    }

    public void setJava(Java[] java) {
        this.java = java;
    }

    public Android[] getAndroid() {
        return android;
    }

    public void setAndroid(Android[] android) {
        this.android = android;
    }

    public Go[] getGo() {
        return go;
    }

    public void setGo(Go[] go) {
        this.go = go;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "address='" + address + '\'' +
                ", java=" + Arrays.toString(java) +
                ", android=" + Arrays.toString(android) +
                ", go=" + Arrays.toString(go) +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
