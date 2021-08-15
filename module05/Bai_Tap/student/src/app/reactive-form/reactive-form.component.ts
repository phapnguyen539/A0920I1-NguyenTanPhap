import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {StudentService} from '../student.service';
import {Router} from '@angular/router';
@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {
  createForm: FormGroup;

  constructor(private studentService: StudentService, private router: Router) {
  }

  ngOnInit(): void {
    this.createForm = new FormGroup({
      id: new FormControl('', [Validators.required]),
      name: new FormControl('', [Validators.required]),
      age: new FormControl('', [Validators.required]),
      mark: new FormControl('0', [Validators.required]),
      avatar: new FormControl('')
    });
  }

  getForm() {
    // studentDao.unshift(this.createForm.value);
    this.studentService.addNewStudent(this.createForm.value).subscribe(() => {
      this.router.navigate(['/']);
    });
  }
}
