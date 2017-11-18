package cn.eeemt.controller;

import cn.eeemt.entity.Article;
import cn.eeemt.entity.Result;
import cn.eeemt.service.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * author: HuangXiquan <br/>
 * date: 2017/11/10/010 <br/>
 * time: 0:07 <br/>
 * description:
 */
@RestController
@RequestMapping("article")
public class ArticleController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private ArticleService articleService;

    /**
     * 查询
     */
    @GetMapping("query")
    public Result query(Integer page, Integer size) {
        Page<Article> articles = articleService.query(page, size);
        return new Result<>(articles);
    }

    /**
     * 新增
     */
    @PostMapping("add")
    public Result add(@RequestBody Article article) {

        return null;
    }

    /**
     * 逻辑删除
     */
    public Result del() {
        return null;
    }

    /**
     * 更新
     */
    public Result update() {
        return null;
    }

    /**
     * 赞
     */
    public Result likeArticle() {
        return null;
    }

    /**
     * 踩
     */
    public Result dislikeArticle() {
        return null;
    }
}
