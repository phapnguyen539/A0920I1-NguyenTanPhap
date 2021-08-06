import { Component, OnInit } from '@angular/core';
import {AbstractControl, FormBuilder, FormGroup, Validators} from '@angular/forms';
import validate = WebAssembly.validate;
function comparePassword(c: AbstractControl) {
    const v = c.value;
  return (v.password === v.confirmPassword) ? null : {
    passwordnotmatch: true
  };
}

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  registerForm: FormGroup;
  constructor(private fb: FormBuilder) { }

  ngOnInit(): void {
    this.registerForm = this.fb.group({
      email: ['', [Validators.required,Validators.email]],
      pwGroup: this.fb.group({
        password:'',
        confirmPassword:''
      }, { validator: comparePassword})
    });
    this.registerForm.patchValue({
      email: 'info@example.com'
    });
  }
  onSubmit(){
    console.log(this.registerForm.value)
  }

}
