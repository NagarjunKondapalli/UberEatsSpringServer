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
 * Categories
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-05T19:23:13.468Z")
@Entity
public class Categories   {
  @JsonProperty("id")
  @Id
  @GeneratedValue
  private int id;

  @JsonProperty("categoryName")
  @Size(min=3, message="Category should have atelset 3 charecters")
  @ApiModelProperty(value = "Category name should have atelset 3 charecters")
  private String categoryName ;

  public Categories(){}
  public Categories(Integer id, @Size(min = 3, message = "Category should have atelset 3 charecters") String categoryName) {
    this.id = id;
    this.categoryName = categoryName;
  }

  public Categories id(Integer id) {
    this.id = id;
    return this;
  }


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Categories categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }




  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Categories categories = (Categories) o;
    return Objects.equals(this.id, categories.id) &&
        Objects.equals(this.categoryName, categories.categoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, categoryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Categories {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
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

