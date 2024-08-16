package co.com.iue.gestiontareas.controller;

import co.com.iue.gestiontareas.model.Task;
import co.com.iue.gestiontareas.security.UserPrincipal;
import co.com.iue.gestiontareas.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/task")
@CrossOrigin(origins = "http://localhost:4200")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("create")
    public ResponseEntity<?> saveTask(@RequestBody Task task) {
        return new ResponseEntity<>(taskService.save(task),HttpStatus.CREATED);
    }

    @GetMapping("list/{userId}")
    public ResponseEntity<?> getAllTasksByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(taskService.findByUserId(userId));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<?> updateTask(@PathVariable Long id, @RequestBody Task task) {
        task.setId(id);
        taskService.save(task);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
