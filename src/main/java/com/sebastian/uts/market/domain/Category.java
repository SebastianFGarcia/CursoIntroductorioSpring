package com.sebastian.uts.market.domain;

public class Category {
    private Integer categoryId;
    private String category;
    private Boolean active;


    public Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean isActive() {
        return this.active;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "{" +
            " categoryId='" + getCategoryId() + "'" +
            ", category='" + getCategory() + "'" +
            ", active='" + isActive() + "'" +
            "}";
    }

}
