package manager;

import domain.Epic;
import domain.SubTask;
import domain.Task;

import java.util.ArrayList;
import java.util.List;

public interface TaskManager {

    void addTask(Task task);

    void addEpic(Epic epic);

    void addSubTask(SubTask subTask);

    void deleteAllTasks();

    void deleteAllEpics();

    void deleteAllSubTasks();

    ArrayList<Task> getTasks();

    ArrayList<Epic> getEpics();

    ArrayList<SubTask> getSubTasks();

    Task getTaskById(int id);

    Epic getEpicById(int id);

    SubTask getSubTaskById(int id);

    void deleteTaskById(int id);

    void deleteEpicById(int id);

    void deleteSubTaskById(int id);

    ArrayList<SubTask> getSubTasksOfEpic(int epicId);

    void updateTask(Task task);

    void updateEpic(Epic epic);

    void updateSubTask(SubTask subTask);

    List<Task> getHistory();
}
