
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
    "Item1",
    "Item2"
})
@Generated("jsonschema2pojo")
public class Objects1 {

    @JsonProperty("Item1")
    private Item1 item1;
    @JsonProperty("Item2")
    private Item2 item2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Item1")
    public Item1 getItem1() {
        return item1;
    }

    @JsonProperty("Item1")
    public void setItem1(Item1 item1) {
        this.item1 = item1;
    }

    public Objects1 withItem1(Item1 item1) {
        this.item1 = item1;
        return this;
    }

    @JsonProperty("Item2")
    public Item2 getItem2() {
        return item2;
    }

    @JsonProperty("Item2")
    public void setItem2(Item2 item2) {
        this.item2 = item2;
    }

    public Objects1 withItem2(Item2 item2) {
        this.item2 = item2;
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

    public Objects1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Objects1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("item1");
        sb.append('=');
        sb.append(((this.item1 == null)?"<null>":this.item1));
        sb.append(',');
        sb.append("item2");
        sb.append('=');
        sb.append(((this.item2 == null)?"<null>":this.item2));
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
        result = ((result* 31)+((this.item2 == null)? 0 :this.item2 .hashCode()));
        result = ((result* 31)+((this.item1 == null)? 0 :this.item1 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Objects1) == false) {
            return false;
        }
        Objects1 rhs = ((Objects1) other);
        return ((((this.item2 == rhs.item2)||((this.item2 != null)&&this.item2 .equals(rhs.item2)))&&((this.item1 == rhs.item1)||((this.item1 != null)&&this.item1 .equals(rhs.item1))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
