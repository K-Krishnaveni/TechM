import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { MovieListComponent } from './pages/movie-list/movie-list.component';
import { MovieItemComponent } from './pages/movie-item/movie-item.component';
import { HttpClientModule } from '@angular/common/http';
import { MovieDetailsComponent } from './pages/movie-details/movie-details.component';
import { MovieFilterPipe } from './pipes/movie-filter.pipe';
import { MovieService } from './services/movie.service';
import { LoginComponent } from './common/login/login.component';
import { RouterModule } from '@angular/router';
import { NavbarComponent } from './common/navbar/navbar.component';
import { GenresComponent } from './pages/genres/genres.component';
import { FilterByGenrePipe } from './pipes/filter-by-genre.pipe';
import { ReviewComponent } from './pages/review/review.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    MovieListComponent,
    MovieItemComponent,
    MovieDetailsComponent,
    MovieFilterPipe,
    LoginComponent,
    NavbarComponent,
    GenresComponent,
    FilterByGenrePipe,
    ReviewComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    RouterModule,
    ReactiveFormsModule
  ],
  providers: [
    provideClientHydration(),
    MovieService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
