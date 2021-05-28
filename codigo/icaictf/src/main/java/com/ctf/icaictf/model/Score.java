package com.ctf.icaictf.model;

import java.sql.Timestamp;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("SCORES")
public class Score {
    @Id
    private Integer id;
    
    @NotBlank
    @Size(min=4, max=24)
    private String username;

    @NotNull
    private Integer challenge_id;

    private Integer points;

    private Timestamp start_date;

    private Timestamp stop_date;

}
