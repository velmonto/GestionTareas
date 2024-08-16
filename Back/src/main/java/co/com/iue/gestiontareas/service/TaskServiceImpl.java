package co.com.iue.gestiontareas.service;

import co.com.iue.gestiontareas.model.Task;
import co.com.iue.gestiontareas.model.User;
import co.com.iue.gestiontareas.repository.TaskRepository;
import co.com.iue.gestiontareas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Task save(Task task) {
        User user = userRepository.findById(task.getUser().getId()).orElse(null);
        task.setUser(user);
        return taskRepository.save(task);
    }

    @Override
    public List<Task> findByUserId(Long userId) {
        return taskRepository.findAllByUser_Id(userId);
    }

    @Override
    public void deleteTask(Long id)
    {
        taskRepository.deleteById(id);
    }
}
