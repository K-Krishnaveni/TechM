import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'movieFilter'
})
export class MovieFilterPipe implements PipeTransform {
  transform(movies: any[], searchText: string): any[] {
    if (!movies || !searchText) {
      return movies;
    }
    return movies.filter(movie =>
      movie.title.toLowerCase().includes(searchText.toLowerCase())
      
    );
  }
}
