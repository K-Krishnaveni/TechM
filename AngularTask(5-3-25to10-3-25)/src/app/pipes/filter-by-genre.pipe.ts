import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filterByGenre'
})
export class FilterByGenrePipe implements PipeTransform {
  transform(movies: any[], selectedGenre: string): any[] {
    if (!movies || !selectedGenre || selectedGenre === 'All' || selectedGenre === '') {
      return movies;
    }
    return movies.filter(movie => 
      movie.genre.toLowerCase() === selectedGenre.toLowerCase()
    );
    
}
}