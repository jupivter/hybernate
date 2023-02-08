package co.develhope.hybernate.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "enrollment")
@Data
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student studentId;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private SchoolClass classId;

}