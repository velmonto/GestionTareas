package co.com.iue.gestiontareas.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
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
    private String priority;

    @Column(name = "endDate")
    private Date endDate;

    @Column(name = "label")
    private String label;

    @Column(name = "status")
    private String status;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    @JsonManagedReference
    @OneToMany(mappedBy="task")
    private List<Subtask> subtaskList;

    @JsonManagedReference
    @OneToMany(mappedBy="task")
    private List<TaskAudit> taskAuditList;
}
