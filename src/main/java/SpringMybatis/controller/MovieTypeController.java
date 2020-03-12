package SpringMybatis.controller;

import SpringMybatis.entity.MovieType;
import SpringMybatis.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/test")
public class MovieTypeController {

  @Autowired
  MovieService movieService;

  @GetMapping("/movieType")
  public List<MovieType> selectMovieall(){
    return movieService.selectMovieall();
  }



}
