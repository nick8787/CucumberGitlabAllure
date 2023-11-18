package api;

import java.util.List;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {
    private List<String> categories;
    private String content;
    private String date;
    private String lang;
    private String layout;
    private List<Object> tags;
    private String title;
    private String url;
}

