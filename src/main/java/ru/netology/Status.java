package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

class Status {

    @JsonProperty("verified")
    private Boolean verified;
    @JsonProperty("sentCount")
    private Integer sentCount;
    @JsonProperty("feedback")
    private String feedback;

    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @JsonProperty("sentCount")
    public Integer getSentCount() {
        return sentCount;
    }

    @JsonProperty("sentCount")
    public void setSentCount(Integer sentCount) {
        this.sentCount = sentCount;
    }

    @JsonProperty("feedback")
    public String getFeedback() {
        return feedback;
    }

    @JsonProperty("feedback")
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Status{" +
                "verified=" + verified +
                ", sentCount=" + sentCount +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
