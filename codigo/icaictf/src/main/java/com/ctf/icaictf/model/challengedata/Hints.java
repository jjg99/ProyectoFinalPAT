
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
    "number",
    "hint0",
    "hint1",
    "hint2",
    "hint3",
    "hint4"
})
@Generated("jsonschema2pojo")
public class Hints {

    @JsonProperty("number")
    private String number;
    @JsonProperty("hint0")
    private String hint0;
    @JsonProperty("hint1")
    private String hint1;
    @JsonProperty("hint2")
    private String hint2;
    @JsonProperty("hint3")
    private String hint3;
    @JsonProperty("hint4")
    private String hint4;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("hint0")
    public String getHint0() {
        return hint0;
    }

    @JsonProperty("hint0")
    public void setHint0(String hint0) {
        this.hint0 = hint0;
    }

    @JsonProperty("hint1")
    public String getHint1() {
        return hint1;
    }

    @JsonProperty("hint1")
    public void setHint1(String hint1) {
        this.hint1 = hint1;
    }

    @JsonProperty("hint2")
    public String getHint2() {
        return hint2;
    }

    @JsonProperty("hint2")
    public void setHint2(String hint2) {
        this.hint2 = hint2;
    }

    @JsonProperty("hint3")
    public String getHint3() {
        return hint3;
    }

    @JsonProperty("hint3")
    public void setHint3(String hint3) {
        this.hint3 = hint3;
    }

    @JsonProperty("hint4")
    public String getHint4() {
        return hint4;
    }

    @JsonProperty("hint4")
    public void setHint4(String hint4) {
        this.hint4 = hint4;
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
