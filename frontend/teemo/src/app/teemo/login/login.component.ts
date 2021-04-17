import { Component, OnInit } from '@angular/core';
import { User } from '../share/model';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }
  user: User = new User(null, null, null);
  alertInputs: boolean = false;

  ngOnInit(): void {
  
  }

  public SignIn(): void{
    if(this.user.email == null || this.user.password == null || this.user.email == "" || this.user.password == "")
      this.alertInputs = true;
  }

}
