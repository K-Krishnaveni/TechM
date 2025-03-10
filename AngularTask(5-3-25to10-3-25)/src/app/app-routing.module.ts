import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { MovieDetailsComponent } from './pages/movie-details/movie-details.component';
import { MovieListComponent } from './pages/movie-list/movie-list.component';
import { LoginComponent } from './common/login/login.component';
import { GenresComponent } from './pages/genres/genres.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent }, 
  { path: 'movies', component: MovieListComponent }, 
  { path: 'movie/:id', component: MovieDetailsComponent }, 
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  {path:'login',component: LoginComponent},
  {path:'genres',component:GenresComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
