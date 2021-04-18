import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../share/model';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private router: Router) { this.router = router }

  user: User = new User(null, null, null); 
  confirmPassword = null;
  alertInputs: boolean = false;
  passwordEquals: boolean = false;;

  ngOnInit(): void {
  }

  SignOn(): void {
    if(this.user.email == null || this.user.email == "" || this.user.name == null || this.user.name == "" || this.user.password == null || this.user.password == "" || this.confirmPassword == null || this.confirmPassword == ""){
      this.alertInputs = true;
      this.passwordEquals = false;
    }
    else if(this.user.password != this.confirmPassword){
      this.alertInputs = false;
      this.passwordEquals = true;
    } else{
      this.router.navigate(['login']);
    }
  }
}
