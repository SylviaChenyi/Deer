package cn.eeemt.entity;

import cn.eeemt.constant.ViewPermission;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * author: HuangXiquan <br/>
 * date: 2017/10/31/031 <br/>
 * time: 23:05 <br/>
 * description: 文章
 */
@Entity
@Table(name = "articles")
@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
public class Article {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    /**
     * 标题
     */
    private String title;
    /**
     * 文章内容
     */
    @Type(type = "text")
    private String content;
    /**
     * 文章内容的哈希值
     */
    private Integer contentHashCode;
    /**
     * 文章简介
     */
    private String intro;
    /**
     * 访问权限
     */
    @Enumerated(EnumType.STRING)
    private ViewPermission viewPermission;
    /**
     * 允许评论
     */
    private Boolean allowComment;
    /**
     * 发布时间
     */
    private LocalDateTime publishTime;
    /**
     * 创建时间
     */
    @Column(updatable = false)
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
    /**
     * 分类
     */
    @Transient
    private Category category;
    /**
     * 用户
     */
    @ManyToOne(optional = false, fetch = FetchType.EAGER,cascade = CascadeType.REFRESH)
    @JoinColumn(name = "USER_ID")
    private User user;
    /**
     * 标签
     */
    @Transient
    private List<Tag> tags;
    /**
     * 删除标记
     */
    private boolean delFlag;
    /**
     * 删除日期
     */
    private LocalDateTime delTime;

    /**
     * 统计字数
     *
     * @return 字数
     */
    public int countWords() {
        return 0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getContentHashCode() {
        return contentHashCode;
    }

    public void setContentHashCode(Integer contentHashCode) {
        this.contentHashCode = contentHashCode;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public ViewPermission getViewPermission() {
        return viewPermission;
    }

    public void setViewPermission(ViewPermission viewPermission) {
        this.viewPermission = viewPermission;
    }

    public Boolean getAllowComment() {
        return allowComment;
    }

    public void setAllowComment(Boolean allowComment) {
        this.allowComment = allowComment;
    }

    public LocalDateTime getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(LocalDateTime publishTime) {
        this.publishTime = publishTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
