package Controller;
import Models.MovieBook;
import Services.MovieTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movieBooking")
public class MovieTicketController {
    @Autowired
    MovieTicketService movieTicketService;

    @PostMapping("/movieDetails")
    public ResponseEntity movieDetails(@RequestBody MovieBook request) {
        System.out.printf("Hello");
        return ResponseEntity.status(HttpStatus.CREATED).body(movieTicketService.movieDetailsAssign(request));
    }
}

