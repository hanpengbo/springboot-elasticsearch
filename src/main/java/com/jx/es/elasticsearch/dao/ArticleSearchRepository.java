package com.jx.es.elasticsearch.dao;

import com.jx.es.elasticsearch.domain.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by hpb on 2018-03-07.
 */
public interface ArticleSearchRepository extends ElasticsearchRepository<Article, Long> {
}
