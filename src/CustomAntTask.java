import org.apache.tools.ant.Task;

public class CustomAntTask extends Task {

	public void execute() {
		String projectName = getProject().getProperty("ant.project.name");
		String locationInBuildFile = getLocation().toString();
		System.out.println("Line " + locationInBuildFile + " in project: " + projectName);
	}

}