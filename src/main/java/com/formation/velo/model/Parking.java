package com.formation.velo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "pumps")
public class Pump implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
}
