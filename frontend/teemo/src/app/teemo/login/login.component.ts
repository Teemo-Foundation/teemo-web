import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../share/model';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router: Router) { this.router = router }
  user: User = new User(null, null, null);
  alertInputs: boolean = false;

  ngOnInit(): void {
  
  }

  public SignIn(): void{
    if(this.user.email == null || this.user.password == null || this.user.email == "" || this.user.password == "")
      this.alertInputs = true;
    else
      this.router.navigate(['']);
  }

}
