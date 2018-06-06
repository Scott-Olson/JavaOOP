public class ProjectClass{
	// sets up two String variables
	private String name;
	private String description;
	// project creation methods
	public void Project(){
		this.name = "Default project name";
		this.description = "A new project waiting to be updated";
	}
	// overloaded to accept name
	public void Project(String name){
		this.name = name;
	}
	// overloaded to accept desc
	public  void Project(String name, String description){
		this.name = name;
		this.description = description;
	}
	//getters
	public String getName(){
		return name;
	}
	public String getDesc(){
		return description;
	}
	//setters
	public void setName(String name){
		this.name = name;
	}
	public void setDesc(String description){
		this.description = description;
	}


	// call function for the Elevator Pitch, gets the name and desc
	public void elevatorPitch(){
		System.out.println(this.getName() + " : " + this.getDesc());
	}
}