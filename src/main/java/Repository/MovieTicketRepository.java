package Repository;

import Models.MovieBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieTicketRepository extends JpaRepository<MovieBook,Long> {

    MovieBook save(MovieBook movieBook);
    MovieBook getByMovieId(Long movieId);
}
