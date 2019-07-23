package edu.nwu.museum.backstage.dao;

import edu.nwu.museum.backstage.domain.News;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsMapper {
  //查询所有资讯信息
  List<News> findAll();
  //根据ID查询资讯信息
  News findById(String newsId);
  //修改资讯信息
  void update(News news);
  //添加资讯
  void insert(News news);
  //根据ID删除资讯
  int deleteById(String newsId);
}
