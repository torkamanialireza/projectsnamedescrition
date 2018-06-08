public class ProjectTest{
  public static void main(String[] args){
       Project project1 = new Project("Project One", "This is the first project.");
       Project project2 = new Project("Project two", "This is the Second project.");
       Project project3 = new Project();
       System.out.println(project1.elevatorPitch());
       System.out.println(project2.elevatorPitch());
       System.out.println(project3.emptyProject());
   }
}
