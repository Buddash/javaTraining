package api;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ResponsePost {
    @JsonProperty("result_url") private String result_url;

    public String getResult_url() {
        return result_url;
    }

    public void setResult_url(String result_url) {
        this.result_url = result_url;
    }

    public ResponsePost(String result_url) {
        this.result_url = result_url;
    }

}