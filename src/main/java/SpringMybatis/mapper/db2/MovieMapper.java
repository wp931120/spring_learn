package SpringMybatis.mapper.db2;

import SpringMybatis.entity.MovieType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieMapper {

  List<MovieType> selectMovieType();

}
