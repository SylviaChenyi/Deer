package cn.eeemt.service.impl;

import cn.eeemt.dao.ArticleRepository;
import cn.eeemt.entity.Article;
import cn.eeemt.service.ArticleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * author: HuangXiquan <br/>
 * date: 2017/11/11/011 <br/>
 * time: 19:05 <br/>
 * description:
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleRepository articleRepository;

    @Override
    public Page<Article> query(int page, int size) {
        PageRequest pageRequest = new PageRequest(page, size, Sort.Direction.DESC, "updateTime");
        return articleRepository.findAll(pageRequest);
    }

    @Override
    public void saveOrUpdate(Article article) {
        articleRepository.save(article);
    }

    @Override
    public void del(Integer articleId) {
        Article repositoryOne = articleRepository.findOne(articleId);
        repositoryOne.setDelFlag(true);
    }

    @Override
    public void vote(Integer articleId) {
        Article repositoryOne = articleRepository.findOne(articleId);
        repositoryOne.vote();
    }

    @Override
    public void unVote(Integer articleId) {
        Article repositoryOne = articleRepository.findOne(articleId);
        repositoryOne.unVote();
    }
}
