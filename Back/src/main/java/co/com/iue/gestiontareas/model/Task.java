package co.com.iue.gestiontareas.model;

import javax.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "priority")
    private int priority;

    @Column(name = "endDate")
    private Date endDate;

    @Column(name = "label")
    private String label;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    @OneToMany(mappedBy="task")
    private List<Subtask> subtaskList;

    @OneToMany(mappedBy="task")
    private List<TaskAudit> taskAuditList;
}
