package co.com.iue.gestiontareas.service;

import co.com.iue.gestiontareas.model.Subtask;

import java.util.List;

public interface SubtaskService {
    Subtask save(Subtask subtask);

    List<Subtask> findBySubtaskId(Long taskId);

    void deleteSubtask(Long id);
}
