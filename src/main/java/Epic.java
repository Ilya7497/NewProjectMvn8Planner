public class Epic extends Task {
    String[] subtasks = new String[0];

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    public String[] getSubtasks() {
        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String task : subtasks) {
            if (task.contains(query))
                return true;
        }
        return false;
    }
}
