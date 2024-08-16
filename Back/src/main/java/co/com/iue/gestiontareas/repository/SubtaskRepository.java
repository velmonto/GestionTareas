package co.com.iue.gestiontareas.repository;

import co.com.iue.gestiontareas.model.Subtask;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubtaskRepository extends JpaRepository<Subtask, Long> {

    List<Subtask> findAllByTask_Id(Long id);
}
