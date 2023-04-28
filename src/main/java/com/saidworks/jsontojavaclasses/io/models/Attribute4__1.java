
package com.saidworks.jsontojavaclasses.io.models;

import java.util.HashMap;
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
    "field1",
    "field2"
})
@Generated("jsonschema2pojo")
public class Attribute4__1 {

    @JsonProperty("field1")
    private String field1;
    @JsonProperty("field2")
    private String field2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("field1")
    public String getField1() {
        return field1;
    }

    @JsonProperty("field1")
    public void setField1(String field1) {
        this.field1 = field1;
    }

    public Attribute4__1 withField1(String field1) {
        this.field1 = field1;
        return this;
    }

    @JsonProperty("field2")
    public String getField2() {
        return field2;
    }

    @JsonProperty("field2")
    public void setField2(String field2) {
        this.field2 = field2;
    }

    public Attribute4__1 withField2(String field2) {
        this.field2 = field2;
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

    public Attribute4__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Attribute4__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("field1");
        sb.append('=');
        sb.append(((this.field1 == null)?"<null>":this.field1));
        sb.append(',');
        sb.append("field2");
        sb.append('=');
        sb.append(((this.field2 == null)?"<null>":this.field2));
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
        result = ((result* 31)+((this.field1 == null)? 0 :this.field1 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.field2 == null)? 0 :this.field2 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Attribute4__1) == false) {
            return false;
        }
        Attribute4__1 rhs = ((Attribute4__1) other);
        return ((((this.field1 == rhs.field1)||((this.field1 != null)&&this.field1 .equals(rhs.field1)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.field2 == rhs.field2)||((this.field2 != null)&&this.field2 .equals(rhs.field2))));
    }

}
