
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
    "Item3",
    "Item4"
})
@Generated("jsonschema2pojo")
public class Objects2 {

    @JsonProperty("Item3")
    private Item3 item3;
    @JsonProperty("Item4")
    private Item4 item4;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Item3")
    public Item3 getItem3() {
        return item3;
    }

    @JsonProperty("Item3")
    public void setItem3(Item3 item3) {
        this.item3 = item3;
    }

    public Objects2 withItem3(Item3 item3) {
        this.item3 = item3;
        return this;
    }

    @JsonProperty("Item4")
    public Item4 getItem4() {
        return item4;
    }

    @JsonProperty("Item4")
    public void setItem4(Item4 item4) {
        this.item4 = item4;
    }

    public Objects2 withItem4(Item4 item4) {
        this.item4 = item4;
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

    public Objects2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Objects2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("item3");
        sb.append('=');
        sb.append(((this.item3 == null)?"<null>":this.item3));
        sb.append(',');
        sb.append("item4");
        sb.append('=');
        sb.append(((this.item4 == null)?"<null>":this.item4));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.item4 == null)? 0 :this.item4 .hashCode()));
        result = ((result* 31)+((this.item3 == null)? 0 :this.item3 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Objects2) == false) {
            return false;
        }
        Objects2 rhs = ((Objects2) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.item4 == rhs.item4)||((this.item4 != null)&&this.item4 .equals(rhs.item4))))&&((this.item3 == rhs.item3)||((this.item3 != null)&&this.item3 .equals(rhs.item3))));
    }

}
