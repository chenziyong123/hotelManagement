package beans;

import enums.HotelType;

public class Hotel {


	private String id;
	private String name;
	private String address;
	private HotelType type;
	private double area;
	private int star;
	private int score;
	private String introduction;
	private String picture;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public HotelType getType() {
		return type;
	}
	public void setType(HotelType type) {
		this.type = type;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getpicture() {
		return picture;
	}
	public void setpicture(String photo) {
		this.picture = photo;
	}


}
