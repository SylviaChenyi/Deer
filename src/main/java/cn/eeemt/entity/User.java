package cn.eeemt.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * author: HuangXiquan <br/>
 * date: 2017/10/31/031 <br/>
 * time: 23:09 <br/>
 * description: 作者
 */
@Entity
@Table(name = "authors")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    private String username;
    private String password;
    private String avatarUrl;
    private LocalDateTime lastLoginTime;
    private LocalDateTime joinTime;
    private LocalDateTime updateTime;
}
