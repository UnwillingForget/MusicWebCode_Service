package com.MusicService.entity;

import java.io.Serializable;
import java.util.Objects;

public class Singer implements Serializable {
    private Integer id;
    private String name;
    private Integer sex;
    private String introduction;
    private String photo;

    public Singer(){}

    public Singer(Integer id, String name, Integer sex, String introduction, String photo) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.introduction = introduction;
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", introduction='" + introduction + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Singer singer = (Singer) o;
        return Objects.equals(id, singer.id) && Objects.equals(name, singer.name) && Objects.equals(sex, singer.sex) && Objects.equals(introduction, singer.introduction) && Objects.equals(photo, singer.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sex, introduction, photo);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
