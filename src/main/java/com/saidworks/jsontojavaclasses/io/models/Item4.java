
package com.saidworks.jsontojavaclasses.io.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "attribute1",
    "attribute2",
    "attribute3",
    "attribute4"
})
@Generated("jsonschema2pojo")
public class Item4 {

    @JsonProperty("attribute1")
    private String attribute1;
    @JsonProperty("attribute2")
    private Integer attribute2;
    @JsonProperty("attribute3")
    private List<Object> attribute3 = new ArrayList<Object>();
    @JsonProperty("attribute4")
    private Attribute4__1 attribute4;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("attribute1")
    public String getAttribute1() {
        return attribute1;
    }

    @JsonProperty("attribute1")
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public Item4 withAttribute1(String attribute1) {
        this.attribute1 = attribute1;
        return this;
    }

    @JsonProperty("attribute2")
    public Integer getAttribute2() {
        return attribute2;
    }

    @JsonProperty("attribute2")
    public void setAttribute2(Integer attribute2) {
        this.attribute2 = attribute2;
    }

    public Item4 withAttribute2(Integer attribute2) {
        this.attribute2 = attribute2;
        return this;
    }

    @JsonProperty("attribute3")
    public List<Object> getAttribute3() {
        return attribute3;
    }

    @JsonProperty("attribute3")
    public void setAttribute3(List<Object> attribute3) {
        this.attribute3 = attribute3;
    }

    public Item4 withAttribute3(List<Object> attribute3) {
        this.attribute3 = attribute3;
        return this;
    }

    @JsonProperty("attribute4")
    public Attribute4__1 getAttribute4() {
        return attribute4;
    }

    @JsonProperty("attribute4")
    public void setAttribute4(Attribute4__1 attribute4) {
        this.attribute4 = attribute4;
    }

    public Item4 withAttribute4(Attribute4__1 attribute4) {
        this.attribute4 = attribute4;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Item4 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Item4 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attribute1");
        sb.append('=');
        sb.append(((this.attribute1 == null)?"<null>":this.attribute1));
        sb.append(',');
        sb.append("attribute2");
        sb.append('=');
        sb.append(((this.attribute2 == null)?"<null>":this.attribute2));
        sb.append(',');
        sb.append("attribute3");
        sb.append('=');
        sb.append(((this.attribute3 == null)?"<null>":this.attribute3));
        sb.append(',');
        sb.append("attribute4");
        sb.append('=');
        sb.append(((this.attribute4 == null)?"<null>":this.attribute4));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.attribute1 == null)? 0 :this.attribute1 .hashCode()));
        result = ((result* 31)+((this.attribute3 == null)? 0 :this.attribute3 .hashCode()));
        result = ((result* 31)+((this.attribute2 == null)? 0 :this.attribute2 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.attribute4 == null)? 0 :this.attribute4 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item4) == false) {
            return false;
        }
        Item4 rhs = ((Item4) other);
        return ((((((this.attribute1 == rhs.attribute1)||((this.attribute1 != null)&&this.attribute1 .equals(rhs.attribute1)))&&((this.attribute3 == rhs.attribute3)||((this.attribute3 != null)&&this.attribute3 .equals(rhs.attribute3))))&&((this.attribute2 == rhs.attribute2)||((this.attribute2 != null)&&this.attribute2 .equals(rhs.attribute2))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.attribute4 == rhs.attribute4)||((this.attribute4 != null)&&this.attribute4 .equals(rhs.attribute4))));
    }

}
