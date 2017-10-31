package cn.eeemt.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * author: HuangXiquan <br/>
 * date: 2017/10/31/031 <br/>
 * time: 23:05 <br/>
 * description: 文章
 */
@Entity
@Table(name = "articles")
public class Article {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "content")
    @Type(type = "text")
    private String content;
    @Column(name = "create_time",updatable = false)
    private LocalDateTime createTime;
    @Column(name = "update_time")
    private LocalDateTime updateTime;
    @Transient
    private Category category;
    @Transient
    private User user;
}
