package com.ineverleft.leraning.json;

import java.math.BigDecimal;

/**
 * @Description @ClassName Book @Author ineverleft
 *
 * @date 2021.02.02 14:31
 */
public class Book {

  private String name;
  private String author;
  private int id;
  private BigDecimal price;

  public Book(String name, String author, int id, BigDecimal price) {
    this.name = name;
    this.author = author;
    this.id = id;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }
}
