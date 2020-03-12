package SpringMybatis.service;


import SpringMybatis.entity.MovieType;
import SpringMybatis.entity.User;
import SpringMybatis.mapper.db1.UserMapper;
import SpringMybatis.mapper.db2.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class MovieService {

  @PostConstruct
  public void init(){

    System.out.println("---------");
  }

  @Autowired
  MovieMapper movieMapper;

  public List<MovieType> selectMovieall(){
    return movieMapper.selectMovieType();

  }


}

