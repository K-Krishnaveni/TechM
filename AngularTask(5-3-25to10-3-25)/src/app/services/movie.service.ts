import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Review } from '../models/review.model';

@Injectable({
  providedIn: 'root',
})
export class MovieService {
  private apiUrl = 'http://localhost:4500/movies'; 
  private genresUrl = 'http://localhost:4500/genres';  

  constructor(private http: HttpClient) {}

  getMovies(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrl);
  }
  getGenres(): Observable<any[]> {
    return this.http.get<any[]>(this.genresUrl);
  }
  getReviews(): Observable<Review[]> {
    return this.http.get<Review[]>('http://localhost:4500/reviews');
  }

  submitReview(review: Review): Observable<Review> {
    return this.http.post<Review>('http://localhost:4500/reviews', review);
  }
}
