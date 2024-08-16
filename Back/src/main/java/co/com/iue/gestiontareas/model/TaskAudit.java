package co.com.iue.gestiontareas.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "taskAudit")
public class TaskAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "modificationDate")
    private Date modificationDate;

    @ManyToOne
    @JoinColumn(name="task_id", nullable=false)
    private Task task;
}
