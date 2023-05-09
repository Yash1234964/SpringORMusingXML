package in.ineuron.dto;

public class StudentDTO {

	
	@Override
	public String toString() {
		return "StudentDTO [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddress=" + saddress + ", gender="
				+ gender + "]";
	}
	private Integer sid;
	private String sname;
	private Integer sage;
	private String saddress;
	private String gender;
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
