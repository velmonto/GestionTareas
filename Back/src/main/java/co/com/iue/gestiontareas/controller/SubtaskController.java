package co.com.iue.gestiontareas.controller;

import co.com.iue.gestiontareas.model.Subtask;
import co.com.iue.gestiontareas.service.SubtaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/subtask")
@CrossOrigin(origins = "http://localhost:4200")
public class SubtaskController {

    @Autowired
    private SubtaskService subtaskService;

    @PostMapping("create")
    public ResponseEntity<?> saveTask(@RequestBody Subtask subtask) {
        return new ResponseEntity<>(subtaskService.save(subtask), HttpStatus.CREATED);
    }

    @GetMapping("list/{taskId}")
    public ResponseEntity<?> getAllTasksByUserId(@PathVariable Long taskId) {
        return ResponseEntity.ok(subtaskService.findBySubtaskId(taskId));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable Long id) {
        subtaskService.deleteSubtask(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<?> updateTask(@PathVariable Long id, @RequestBody Subtask subtask) {
        subtask.setId(id);
        subtaskService.save(subtask);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
