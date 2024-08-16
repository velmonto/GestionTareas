package co.com.iue.gestiontareas.service;

import co.com.iue.gestiontareas.model.Task;

import java.util.List;

public interface TaskService {
    Task save(Task task);

    List<Task> findByUserId(Long userId);

    void deleteTask(Long id);
}
