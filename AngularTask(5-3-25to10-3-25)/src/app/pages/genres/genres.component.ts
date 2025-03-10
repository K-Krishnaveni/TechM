import { Component, OnInit } from '@angular/core';
import { MovieService } from '../../services/movie.service';

@Component({
  selector: 'app-genres',
  templateUrl: './genres.component.html',
  styleUrls: ['./genres.component.css']
})
export class GenresComponent implements OnInit {
  movies: any[] = []; 
  searchText: string = '';
  selectedGenre: string = '';

  genres = ["All", "Disney", "Pixar", "Horror", "Crime"];

  constructor(private movieService: MovieService) {} 

  ngOnInit(): void {
    this.movieService. getGenres().subscribe({
      next: (data) => {
        console.log('API Response:', data); 

        if (data && data) {
          this.movies = data;  
        } else {
          this.movies = [];
        }
      },
      error: (error) => {
        console.error('Error fetching genreList:', error);
      }
    });
  }
}
