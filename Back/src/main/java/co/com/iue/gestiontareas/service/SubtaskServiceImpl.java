package co.com.iue.gestiontareas.service;

import co.com.iue.gestiontareas.model.Subtask;
import co.com.iue.gestiontareas.repository.SubtaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubtaskServiceImpl implements SubtaskService {

    @Autowired
    private SubtaskRepository subtaskRepository;

    @Override
    public Subtask save(Subtask subtask) {
        return subtaskRepository.save(subtask);
    }

    @Override
    public List<Subtask> findBySubtaskId(Long taskId) {
        return subtaskRepository.findAllByTask_Id(taskId);
    }

    @Override
    public void deleteSubtask(Long id)
    {
        subtaskRepository.deleteById(id);
    }
}
