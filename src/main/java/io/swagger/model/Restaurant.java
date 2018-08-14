package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Restaurant
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-06T23:05:24.241Z")
@Entity
public class Restaurant   {
  @JsonProperty("id")
  @Id
  @GeneratedValue
  private Integer id;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("CategoryId")
  private Integer categoryId;

  @JsonProperty("streetNameNumber")
  private String streetNameNumber;

  @JsonProperty("postalCode")
  private String postalCode;

  @JsonProperty("City")
  private String city;

  @JsonProperty("Province")
  private String province;

  public Restaurant()
  {

  }

  public Restaurant(Integer id, String name, Integer categoryId, String streetNameNumber, String postalCode, String city, String province) {
    this.id = id;
    this.name = name;
    this.categoryId = categoryId;
    this.streetNameNumber = streetNameNumber;
    this.postalCode = postalCode;
    this.city = city;
    this.province = province;
  }

  public Restaurant id(Integer id) {
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

  public Restaurant name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Restaurant categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  **/
  @ApiModelProperty(value = "")


  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public Restaurant streetNameNumber(String streetNameNumber) {
    this.streetNameNumber = streetNameNumber;
    return this;
  }

  /**
   * Get streetNameNumber
   * @return streetNameNumber
  **/
  @ApiModelProperty(value = "")


  public String getStreetNameNumber() {
    return streetNameNumber;
  }

  public void setStreetNameNumber(String streetNameNumber) {
    this.streetNameNumber = streetNameNumber;
  }

  public Restaurant postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(value = "")


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Restaurant city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Restaurant province(String province) {
    this.province = province;
    return this;
  }

  /**
   * Get province
   * @return province
  **/
  @ApiModelProperty(value = "")


  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Restaurant restaurant = (Restaurant) o;
    return Objects.equals(this.id, restaurant.id) &&
        Objects.equals(this.name, restaurant.name) &&
        Objects.equals(this.categoryId, restaurant.categoryId) &&
        Objects.equals(this.streetNameNumber, restaurant.streetNameNumber) &&
        Objects.equals(this.postalCode, restaurant.postalCode) &&
        Objects.equals(this.city, restaurant.city) &&
        Objects.equals(this.province, restaurant.province);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, categoryId, streetNameNumber, postalCode, city, province);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Restaurant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    streetNameNumber: ").append(toIndentedString(streetNameNumber)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
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

