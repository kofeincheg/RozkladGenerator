package pojo;

public class Room {
	
	private int 	id;
	private String 	name;
	private int 	count_seating;
	private Boolean isLaboratory;
	
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
	public int getCount_seating() {
		return count_seating;
	}
	public void setCount_seating(int count_seating) {
		this.count_seating = count_seating;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (this.id + "  " + this.name+ "\t" +this.count_seating + "\n");
	}
	public Boolean getIsLaboratory() {
		return isLaboratory;
	}
	public void setIsLaboratory(Boolean isLaboratory) {
		this.isLaboratory = isLaboratory;
	}
		
	
}
