public class ProjectClassTest{
	public static void main(String[] args){
		ProjectClass p1 = new ProjectClass();
		p1.setName("First Project");
		p1.setDesc("A million dollar idea");
		p1.elevatorPitch();
		System.out.println("new project name :" +p1.getName());
		System.out.println("new project desc :" +p1.getDesc());
	}
}