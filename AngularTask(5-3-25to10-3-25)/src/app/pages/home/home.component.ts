import { Component, OnInit } from '@angular/core';
import { MovieService } from '../../services/movie.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  movies: any[] = [];
  searchText: string = '';

  constructor(private movieService: MovieService) {}

  ngOnInit() {
    this.movieService.getMovies().subscribe((data) => {
      this.movies = data;
  });
}
}