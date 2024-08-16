package co.com.iue.gestiontareas.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "taskAudit")
public class TaskAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "modificationDate")
    private Date modificationDate;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="task_id", nullable=false)
    private Task task;
}
