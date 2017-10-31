package cn.eeemt.entity;

import javax.persistence.*;

/**
 * author: HuangXiquan <br/>
 * date: 2017/10/31/031 <br/>
 * time: 23:59 <br/>
 * description:
 */
@Entity
@Table(name = "tags")
public class Tag {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    private String name;
    private String description;
}
