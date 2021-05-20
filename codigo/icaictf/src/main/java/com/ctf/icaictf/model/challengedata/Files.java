
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
    "file0",
    "file0emb",
    "file1",
    "file1emb",
    "file2",
    "file2emb",
    "file3",
    "file3emb",
    "file4",
    "file4emb"
})
@Generated("jsonschema2pojo")
public class Files {

    @JsonProperty("number")
    private String number;
    @JsonProperty("file0")
    private String file0;
    @JsonProperty("file0emb")
    private String file0emb;
    @JsonProperty("file1")
    private String file1;
    @JsonProperty("file1emb")
    private String file1emb;
    @JsonProperty("file2")
    private String file2;
    @JsonProperty("file2emb")
    private String file2emb;
    @JsonProperty("file3")
    private String file3;
    @JsonProperty("file3emb")
    private String file3emb;
    @JsonProperty("file4")
    private String file4;
    @JsonProperty("file4emb")
    private String file4emb;
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

    @JsonProperty("file0")
    public String getFile0() {
        return file0;
    }

    @JsonProperty("file0")
    public void setFile0(String file0) {
        this.file0 = file0;
    }

    @JsonProperty("file0emb")
    public String getFile0emb() {
        return file0emb;
    }

    @JsonProperty("file0emb")
    public void setFile0emb(String file0emb) {
        this.file0emb = file0emb;
    }

    @JsonProperty("file1")
    public String getFile1() {
        return file1;
    }

    @JsonProperty("file1")
    public void setFile1(String file1) {
        this.file1 = file1;
    }

    @JsonProperty("file1emb")
    public String getFile1emb() {
        return file1emb;
    }

    @JsonProperty("file1emb")
    public void setFile1emb(String file1emb) {
        this.file1emb = file1emb;
    }

    @JsonProperty("file2")
    public String getFile2() {
        return file2;
    }

    @JsonProperty("file2")
    public void setFile2(String file2) {
        this.file2 = file2;
    }

    @JsonProperty("file2emb")
    public String getFile2emb() {
        return file2emb;
    }

    @JsonProperty("file2emb")
    public void setFile2emb(String file2emb) {
        this.file2emb = file2emb;
    }

    @JsonProperty("file3")
    public String getFile3() {
        return file3;
    }

    @JsonProperty("file3")
    public void setFile3(String file3) {
        this.file3 = file3;
    }

    @JsonProperty("file3emb")
    public String getFile3emb() {
        return file3emb;
    }

    @JsonProperty("file3emb")
    public void setFile3emb(String file3emb) {
        this.file3emb = file3emb;
    }

    @JsonProperty("file4")
    public String getFile4() {
        return file4;
    }

    @JsonProperty("file4")
    public void setFile4(String file4) {
        this.file4 = file4;
    }

    @JsonProperty("file4emb")
    public String getFile4emb() {
        return file4emb;
    }

    @JsonProperty("file4emb")
    public void setFile4emb(String file4emb) {
        this.file4emb = file4emb;
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
