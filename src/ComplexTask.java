import java.util.List;
import java.util.ArrayList;

public class ComplexTask {
	private String message = "";

	public void execute() {
		System.out.println("Complex task: " + message);

		for(Command command: commands) {
			System.out.println("command: " + command.getContent());
		}
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void addText(String text) {
		this.message += "\n>>>" + text.trim() + "<<<\n";
	}

	// nested elements ---------------- 

	private List<Command> commands = new ArrayList();

	public class Command {
		private String content;
		public void setContent(String content) {
			this.content = content;
		}
		public String getContent() {
			return this.content;
		}
	}

	public Command createCommand() {
		Command command = new Command();
		this.commands.add(command);
		return command;
	}


}