import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  loggedInUser: string | null = null;

  constructor(private router: Router) {}

  ngOnInit() {
    if (typeof window !== 'undefined') {
      this.loggedInUser = localStorage.getItem("username");
    }
  }

  logout() {
    if (typeof window !== 'undefined') {
      localStorage.removeItem("username");
    }
    this.loggedInUser = null;
    alert("Logged out successfully");
    this.router.navigate(['/home']);
  }
}
