package cn.eeemt.entity;

import javax.persistence.*;

/**
 * author: HuangXiquan <br/>
 * date: 2017/10/31/031 <br/>
 * time: 23:17 <br/>
 * description: 文章分类
 */
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
}
