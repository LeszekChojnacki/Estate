package com.estate.estate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Estate {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String description;
    private double price;
    private double surface;
    private int roomsNumber;
    @CreationTimestamp
    private LocalDateTime createdAt;

}
