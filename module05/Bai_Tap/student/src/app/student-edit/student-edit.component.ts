import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import {IStudent} from '../model/IStudent';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {StudentService} from '../student.service';

@Component({
  selector: 'app-student-edit',
  templateUrl: './student-edit.component.html',
  styleUrls: ['./student-edit.component.css']
})
export class StudentEditComponent implements OnInit {
  updateForm: FormGroup;
  editStudent: IStudent;
  idStudent: number;

  // tslint:disable-next-line:max-line-length
  constructor(private fb: FormBuilder, private studentService: StudentService,
              private router: Router, private activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.updateForm = this.fb.group({
      id: [('')],
      name: [('')],
      age: [('')],
      mark: [('')],
      avatar: [('')]
    });
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      // tslint:disable-next-line:radix
      this.idStudent = parseInt(paramMap.get('id'));
      this.studentService.findById(this.idStudent).subscribe((data) => {
        this.editStudent = data;
        console.log(this.editStudent);
        this.updateForm.patchValue({
          id : this.editStudent.id,
          name: this.editStudent.name,
          age: this.editStudent.age,
          mark: this.editStudent.mark,
          avatar: this.editStudent.avatar
        });
      });
    });
  }

  getUpdate() {
    this.studentService.updateStudents(this.updateForm.value).subscribe((data) => {
      this.router.navigate(['/']);
    });
  }
}
