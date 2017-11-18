package cn.eeemt.service;

import cn.eeemt.entity.Article;
import org.springframework.data.domain.Page;

/**
 * author: HuangXiquan <br/>
 * date: 2017/11/11/011 <br/>
 * time: 19:05 <br/>
 * description:
 */
public interface ArticleService {
    Page<Article> query(int page, int size);
}
