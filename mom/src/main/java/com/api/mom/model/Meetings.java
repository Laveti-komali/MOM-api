package com.api.mom.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "meetings",schema = "mom")
@Data
@Builder
//@NoArgsConstructor
@AllArgsConstructor
public class Meetings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String host_name;
    private String meeting_id;
    private String group_name;
    private String mode_of_meeting;
    private String location;
    private String title;
    private String status;

    public Meetings() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }

    public String getMeeting_id() {
        return meeting_id;
    }

    public void setMeeting_id(String meeting_id) {
        this.meeting_id = meeting_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getMode_of_meeting() {
        return mode_of_meeting;
    }

    public void setMode_of_meeting(String mode_of_meeting) {
        this.mode_of_meeting = mode_of_meeting;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreated_time() {
        return created_time;
    }

    public void setCreated_time(LocalDateTime created_time) {
        this.created_time = created_time;
    }

    public LocalDateTime getDate_of_meeting() {
        return date_of_meeting;
    }

    public void setDate_of_meeting(LocalDateTime date_of_meeting) {
        this.date_of_meeting = date_of_meeting;
    }

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime created_time;  //auto

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime date_of_meeting;

    @Type(JsonType.class)
    @Column(name="azenda_resolutions")
    private JsonNode azenda_resolutions;
}
