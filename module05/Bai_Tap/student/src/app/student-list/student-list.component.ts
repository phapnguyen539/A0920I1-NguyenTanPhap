import { Component, OnInit } from '@angular/core';
import {IStudent} from '../model/IStudent';
import {studentDao} from '../repository/studentDao';
import {StudentService} from '../student.service';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  students: IStudent[] = studentDao;
  studentDetail: IStudent;
  constructor(private studentService: StudentService) { }

  ngOnInit(): void {
    this.students = this.studentService.getAllStudent();
  }
  getStudent(value){
    this.studentDetail = value;
  }
  catchMark(value){
    console.log('Giá trị tại component cha:' + value);
  }
}
