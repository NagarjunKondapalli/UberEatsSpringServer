package io.swagger.model;

import java.sql.Timestamp;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.CreationTimestamp;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Notifications
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-06T23:05:24.241Z")
@Entity
public class Notifications   {
  @JsonProperty("id")
  @Id
  @GeneratedValue
  private Integer id;

  @JsonProperty("recipientId")
  @NotNull
  private Integer recipientId;

  @JsonProperty("sentTimestamp")
  @CreationTimestamp
  private java.sql.Timestamp sentTimestamp;

  public Notifications()
  {

  }

  public Notifications(Integer id, Integer recipientId, Timestamp sentTimestamp) {
    this.id = id;
    this.recipientId = recipientId;
    this.sentTimestamp = sentTimestamp;
  }

  public Notifications id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Notifications recipientId(Integer recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Get recipientId
   * @return recipientId
  **/
  @ApiModelProperty(value = "")


  public Integer getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(Integer recipientId) {
    this.recipientId = recipientId;
  }

  public Notifications sentTimestamp(Timestamp sentTimestamp) {
    this.sentTimestamp = sentTimestamp;
    return this;
  }

  public Timestamp getSentTimestamp() {
    return sentTimestamp;
  }

  public void setSentTimestamp(Timestamp sentTimestamp) {
    this.sentTimestamp = sentTimestamp;
  }

  /**
   * Get sentTimestamp
   * @return sentTimestamp
  **/
  @ApiModelProperty(value = "")

  @Valid




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notifications notifications = (Notifications) o;
    return Objects.equals(this.id, notifications.id) &&
        Objects.equals(this.recipientId, notifications.recipientId) &&
        Objects.equals(this.sentTimestamp, notifications.sentTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recipientId, sentTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notifications {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    sentTimestamp: ").append(toIndentedString(sentTimestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

