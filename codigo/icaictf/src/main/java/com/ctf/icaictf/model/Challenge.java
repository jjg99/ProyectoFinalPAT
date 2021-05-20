package com.ctf.icaictf.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.ctf.icaictf.model.challengedata.ChallengeData;

import org.json.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("CHALLENGES")
public class Challenge {
    @Id
    @NotNull
    private Integer id;

    @NotNull
    private Integer difficulty;

    @NotBlank
    private String username;

    //@NotBlank
    // private ChallengeData data;
    private JSONObject data;


}