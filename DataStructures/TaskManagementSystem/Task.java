class Task {
    int taskId;
    String taskName;
    String status;
    Task next;

    Task(int id, String name, String stat) {
        taskId = id;
        taskName = name;
        status = stat;
    }

    public String toString() {
        return taskId + ": " + taskName + " [" + status + "]";
    }
}

class TaskList {
    Task head;

    void add(Task t) {
        if (head == null) head = t;
        else {
            Task current = head;
            while (current.next != null) current = current.next;
            current.next = t;
        }
    }

    Task search(int id) {
        Task current = head;
        while (current != null) {
            if (current.taskId == id) return current;
            current = current.next;
        }
        return null;
    }

    void delete(int id) {
        if (head == null) return;
        if (head.taskId == id) {
            head = head.next;
            return;
        }
        Task current = head;
        while (current.next != null && current.next.taskId != id)
            current = current.next;
        if (current.next != null)
            current.next = current.next.next;
    }

    void traverse() {
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}
