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
 * Dishes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-06T23:05:24.241Z")
@Entity
public class Dishes   {
  @JsonProperty("id")
  @Id
  @GeneratedValue
  private Integer id;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("Price")
  private Float price;

  @JsonProperty("RestaurantId")
  @NotNull
  private Integer restaurantId;

  public Dishes()
  {

  }

  public Dishes(Integer id, String name, Float price, @NotNull Integer restaurantId) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.restaurantId = restaurantId;
  }

  public Dishes id(Integer id) {
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

  public Dishes name(String name) {
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

  public Dishes price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")


  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public Dishes restaurantId(Integer restaurantId) {
    this.restaurantId = restaurantId;
    return this;
  }

  /**
   * Get restaurantId
   * @return restaurantId
  **/
  @ApiModelProperty(value = "")


  public Integer getRestaurantId() {
    return restaurantId;
  }

  public void setRestaurantId(Integer restaurantId) {
    this.restaurantId = restaurantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dishes dishes = (Dishes) o;
    return Objects.equals(this.id, dishes.id) &&
        Objects.equals(this.name, dishes.name) &&
        Objects.equals(this.price, dishes.price) &&
        Objects.equals(this.restaurantId, dishes.restaurantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, price, restaurantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dishes {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    restaurantId: ").append(toIndentedString(restaurantId)).append("\n");
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

