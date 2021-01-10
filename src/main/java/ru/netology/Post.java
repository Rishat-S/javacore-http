package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {

    @JsonProperty("status")
    private Status status;
    @JsonProperty("type")
    private String type;
    @JsonProperty("deleted")
    private Boolean deleted;
    @JsonProperty("_id")
    private String id;
    @JsonProperty("user")
    private String user;
    @JsonProperty("text")
    private String text;
    @JsonProperty("__v")
    private Integer v;
    @JsonProperty("source")
    private String source;
    @JsonProperty("updatedAt")
    private String updatedAt;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("used")
    private Boolean used;

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    @JsonProperty("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("__v")
    public Integer getV() {
        return v;
    }

    @JsonProperty("__v")
    public void setV(Integer v) {
        this.v = v;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("updatedAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("used")
    public Boolean getUsed() {
        return used;
    }

    @JsonProperty("used")
    public void setUsed(Boolean used) {
        this.used = used;
    }

    @Override
    public String toString() {
        return "Post{" +
                "status=" + status +
                ", type='" + type + '\'' +
                ", deleted=" + deleted +
                ", id='" + id + '\'' +
                ", user='" + user + '\'' +
                ", text='" + text + '\'' +
                ", v=" + v +
                ", source='" + source + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", used=" + used +
                '}';
    }
}
