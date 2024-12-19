package Services;

import Models.MovieBook;
import Repository.MovieTicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieTicketService {
    @Autowired
    MovieTicketRepository movieTicketRepository;
    public MovieBook movieDetailsAssign(MovieBook mb){
        MovieBook mo = new MovieBook();
        mo.setMovieName(mb.getMovieName());
        mo.setMovieLang(mb.getMovieLang());
        mo.setMovieType(mb.getMovieType());
        movieTicketRepository.save(mo);
        return mo;
    }
}
