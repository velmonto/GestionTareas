package co.com.iue.gestiontareas.repository;

import co.com.iue.gestiontareas.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findAllByUser_Id(Long id);
}
