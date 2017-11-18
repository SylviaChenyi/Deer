package cn.eeemt.dao;

import cn.eeemt.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author: HuangXiquan <br/>
 * date: 2017/11/11/011 <br/>
 * time: 19:06 <br/>
 * description:
 */
public interface ArticleRepository extends JpaRepository<Article,Integer>{
}
