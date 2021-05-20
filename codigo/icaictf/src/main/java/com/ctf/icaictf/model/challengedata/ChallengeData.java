
package com.ctf.icaictf.model.challengedata;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "files",
    "hints",
    "solution"
})
@Generated("jsonschema2pojo")
public class ChallengeData {

    @JsonProperty("files")
    private Files files;
    @JsonProperty("hints")
    private Hints hints;
    @JsonProperty("solution")
    private String solution;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("files")
    public Files getFiles() {
        return files;
    }

    @JsonProperty("files")
    public void setFiles(Files files) {
        this.files = files;
    }

    @JsonProperty("hints")
    public Hints getHints() {
        return hints;
    }

    @JsonProperty("hints")
    public void setHints(Hints hints) {
        this.hints = hints;
    }

    @JsonProperty("solution")
    public String getSolution() {
        return solution;
    }

    @JsonProperty("solution")
    public void setSolution(String solution) {
        this.solution = solution;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
