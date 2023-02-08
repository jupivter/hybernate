package co.develhope.hybernate.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "classes")
@Data
public class SchoolClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;

    private String description;

}