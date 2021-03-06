package cn.eeemt.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

/**
 * author: HuangXiquan <br/>
 * date: 2017/10/31/031 <br/>
 * time: 23:17 <br/>
 * description: 文章分类
 */
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    private String name;
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(name = "category_article", joinColumns = @JoinColumn(name = "category_id"), inverseJoinColumns = @JoinColumn(name = "article_id"))
    private List<Article> articles;

    /*
     ##########################
     ### getter and setter ####
     ##########################
    */

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

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
