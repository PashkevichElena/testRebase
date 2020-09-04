package com.company;

import java.time.ZonedDateTime;
import java.util.Objects;


public class AppointmentModel {
//second commit
//first commit on branch
//second commit on branch
    private String parentId;

    private String from;
    private String fromName;

    private String timezone;


    private String subject;
    private String body;
    private String location;

    private Integer rescheduleVersion;
    private Integer updateVersion;

    private String bannerUrl;

    private ZonedDateTime createDate;

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getRescheduleVersion() {
        return rescheduleVersion;
    }

    public void setRescheduleVersion(Integer rescheduleVersion) {
        this.rescheduleVersion = rescheduleVersion;
    }

    public Integer getUpdateVersion() {
        return updateVersion;
    }

    public void setUpdateVersion(Integer updateVersion) {
        this.updateVersion = updateVersion;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public ZonedDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(ZonedDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppointmentModel that = (AppointmentModel) o;
        return Objects.equals(parentId, that.parentId) &&
                Objects.equals(timezone, that.timezone) &&
                Objects.equals(subject, that.subject) &&
                Objects.equals(body, that.body) &&
                Objects.equals(location, that.location) &&
                Objects.equals(rescheduleVersion, that.rescheduleVersion) &&
                Objects.equals(updateVersion, that.updateVersion) &&
                Objects.equals(bannerUrl, that.bannerUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentId, timezone, subject, body, location, rescheduleVersion, updateVersion, bannerUrl);
    }

    @Override
    public String toString() {
        return "AppointmentModel{" +
                "parentId='" + parentId + '\'' +
                ", from='" + from + '\'' +
                ", fromName='" + fromName + '\'' +
                ", timezone='" + timezone + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", location='" + location + '\'' +
                ", rescheduleVersion=" + rescheduleVersion +
                ", updateVersion=" + updateVersion +
                ", bannerUrl='" + bannerUrl + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
