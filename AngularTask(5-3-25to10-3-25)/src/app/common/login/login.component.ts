import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'] 
})
export class LoginComponent {
  username: string = '';
  password: string = '';
  loggedInUser: string | null = localStorage.getItem("username");

  constructor(private router: Router) {}

  login() {
    if (this.username === "krish" && this.password === "password") {
      localStorage.setItem("username", this.username);
      alert("Login successful");
      this.loggedInUser = this.username;
      this.router.navigate(['/home']); 
    } else {
      alert("Invalid Credentials");
    }
  }

  logout() {
    localStorage.removeItem("username"); 
    this.loggedInUser = null;
    alert("Logged out successfully");
    this.router.navigate(['/home']); 
  }
}
