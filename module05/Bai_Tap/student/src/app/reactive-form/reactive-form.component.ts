import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {StudentService} from '../student.service';
import {Router} from '@angular/router';
import {IStudent} from '../model/IStudent';
@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {
  createForm: FormGroup;
  image: any;
  selectImg: any = null;
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
  onselectFile(e){
    if (e.target.files&& e.target.files[0]){
      var reader= new FileReader();
      reader.readAsDataURL(e.target.files[0]);
      reader.onload = (event: any) => {
       this.image.avatar = event.target.result;
       this.selectImg = e.target.files[0];
      }
    }
  }
}
