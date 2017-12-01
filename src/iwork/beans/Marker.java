package iwork.beans;

public class Marker {
	int id;
	String name,address,type;
	float lat,lng;
	public Marker() {
		
	}
	public Marker( String name, String address, String type, float lat, float lng) {
		
		this.name = name;
		this.address = address;
		this.type = type;
		this.lat = lat;
		this.lng = lng;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	public float getLng() {
		return lng;
	}
	public void setLng(float lng) {
		this.lng = lng;
	}
	@Override
	public String toString() {
		return "Marker [id=" + id + ", name=" + name + ", address=" + address + ", type=" + type + ", lat=" + lat
				+ ", lng=" + lng + "]";
	}

}
