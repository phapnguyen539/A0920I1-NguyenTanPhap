import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {studentDao} from '../repository/studentDao';
import validate = WebAssembly.validate;
import {StudentService} from '../student.service';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {
  createForm: FormGroup;

  constructor(private studentService: StudentService) { }

  ngOnInit(): void {
    this.createForm = new FormGroup({
      id: new FormControl('', [Validators.required]),
      name: new FormControl('', [Validators.required]),
      age: new FormControl('', [Validators.required]),
      mark: new FormControl('0', [Validators.required]),
      avatar: new FormControl('')
    });
  }
  getForm(){
   // studentDao.unshift(this.createForm.value);
    this.studentService.addNewStudent(this.createForm.value);
  }

}
