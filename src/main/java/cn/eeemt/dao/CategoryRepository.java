package cn.eeemt.dao;

import cn.eeemt.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author: HuangXiquan <br/>
 * date: 2017/11/18/018 <br/>
 * time: 19:14 <br/>
 * description:
 */
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
