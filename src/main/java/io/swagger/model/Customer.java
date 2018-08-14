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
 * Customer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-06T23:05:24.241Z")
@Entity
public class Customer   {
  @JsonProperty("id")
  @Id
  @GeneratedValue
  private Integer id;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("billingDetailId")
  private Integer billingDetailId;

  @JsonProperty("streetNameNumber")
  private String streetNameNumber;

  @JsonProperty("postalCode")
  private String postalCode;

  @JsonProperty("City")
  private String city;

  @JsonProperty("Province")
  private String province;

  public Customer()
  {

  }

  public Customer(Integer id, String name, Integer billingDetailId, String streetNameNumber, String postalCode, String city, String province) {
    this.id = id;
    this.name = name;
    this.billingDetailId = billingDetailId;
    this.streetNameNumber = streetNameNumber;
    this.postalCode = postalCode;
    this.city = city;
    this.province = province;
  }

  public Customer id(Integer id) {
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

  public Customer name(String name) {
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

  public Customer billingDetailId(Integer billingDetailId) {
    this.billingDetailId = billingDetailId;
    return this;
  }

  /**
   * Get billingDetailId
   * @return billingDetailId
  **/
  @ApiModelProperty(value = "")


  public Integer getBillingDetailId() {
    return billingDetailId;
  }

  public void setBillingDetailId(Integer billingDetailId) {
    this.billingDetailId = billingDetailId;
  }

  public Customer streetNameNumber(String streetNameNumber) {
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

  public Customer postalCode(String postalCode) {
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

  public Customer city(String city) {
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

  public Customer province(String province) {
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
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.name, customer.name) &&
        Objects.equals(this.billingDetailId, customer.billingDetailId) &&
        Objects.equals(this.streetNameNumber, customer.streetNameNumber) &&
        Objects.equals(this.postalCode, customer.postalCode) &&
        Objects.equals(this.city, customer.city) &&
        Objects.equals(this.province, customer.province);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, billingDetailId, streetNameNumber, postalCode, city, province);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    billingDetailId: ").append(toIndentedString(billingDetailId)).append("\n");
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

