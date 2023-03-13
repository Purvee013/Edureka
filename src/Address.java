import java.lang.*;
public class Address implements Comparable<Address> {
private String streetname;
private int pincode;
@Override
public String toString() {
	return "Address [streetname=" + streetname + ", pincode=" + pincode + "]";
}
public String getStreetname() {
	return streetname;
}
public void setStreetname(String streetname) {
	this.streetname = streetname;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public Address(String streetname, int pincode) {
	super();
	this.streetname = streetname;
	this.pincode = pincode;
}}
