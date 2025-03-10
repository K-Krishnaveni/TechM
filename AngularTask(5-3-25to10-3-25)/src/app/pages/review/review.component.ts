import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MovieService } from '../../services/movie.service';
import { Review } from '../../models/review.model';

@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.css']
})
export class ReviewComponent implements OnInit {
  reviewForm!: FormGroup;
  submitted = false;
  reviews: Review[] = [];

  constructor(private fb: FormBuilder, private movieService: MovieService) {}

  ngOnInit(): void {
    this.reviewForm = this.fb.group({
      movieTitle: ['', Validators.required],
      reviewerName: ['', Validators.required],
      rating: [null, [Validators.required, Validators.min(1), Validators.max(5)]],
      comment: ['', Validators.required],
    });

    this.loadReviews();
  }

  submitReview(): void {
    if (this.reviewForm.invalid) {
      return;
    }

    const newReview: Review = this.reviewForm.value;
    this.movieService.submitReview(newReview).subscribe({
      next: (response) => {
        console.log('Review submitted:', response);
        this.reviews.push(response);
        this.reviewForm.reset();
        this.submitted = true;
      },
      error: (err) => console.error('Error submitting review:', err)
    });
  }

  loadReviews(): void {
    this.movieService.getReviews().subscribe({
      next: (data) => {
        this.reviews = data;
      },
      error: (error) => {
        console.error('Error fetching reviews:', error);
      }
    });
  }
}
