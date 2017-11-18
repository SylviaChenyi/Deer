package cn.eeemt.dao;

import cn.eeemt.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author: HuangXiquan <br/>
 * date: 2017/11/18/018 <br/>
 * time: 19:15 <br/>
 * description:
 */
public interface TagRepository extends JpaRepository<Tag, Integer> {
}
