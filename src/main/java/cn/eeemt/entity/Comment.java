package cn.eeemt.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * author: HuangXiquan <br/>
 * date: 2017/11/19/019 <br/>
 * time: 13:35 <br/>
 * description:
 */
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue
    private Integer id;
    private String content;
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @Cascade(CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "article_id")
    private Article article;
    @ManyToOne(fetch = FetchType.LAZY)
    @Cascade(CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "user_id")
    private User user;
    private LocalDateTime publishTime;
    private boolean isDeleted;
    private LocalDateTime delTime;

}
