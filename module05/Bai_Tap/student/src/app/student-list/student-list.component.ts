import { Component, OnInit } from '@angular/core';
import {IStudent} from '../model/IStudent';
import {StudentService} from '../student.service';
import {MatDialog} from '@angular/material/dialog';
import {StudentDeleteComponent} from '../student-delete/student-delete.component';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  students: IStudent[] = [];
  parentStudentDetail: IStudent;
  name: string;
  id: number;
  p: number = 1;
  flag: any;
  order: string;
  collection: any;

  constructor(private studentService: StudentService, private dialog: MatDialog) {
  }

  ngOnInit(): void {
    this.studentService.getAllStudent().subscribe(
      (data) => {
        this.students = data;
      }
    );
  }

  getStudent(value) {
    this.parentStudentDetail = value;
  }

  catchMark(value) {
    console.log('Giá trị tại component cha:' + value);
  }

  searchName(): void {
    this.studentService.findByName(this.name).subscribe(data => {
        this.students = data;
      }
    )
  }
  openDialogDelete(studentId): void {
    this.studentService.findById(studentId).subscribe(data => {
      const dialogReg = this.dialog.open(StudentDeleteComponent,{
        width : '500px',
        data : {data1: data},
        disableClose : true
      });
      dialogReg.afterClosed().subscribe(result =>{
        this.ngOnInit()
      })
    })
  }
  key: string = 'id';
  reverse: boolean =false;
  sort(key){
    this.key = key;
    this.reverse = !this.reverse;
  }
  // sortByName(){
  //     if (this.flag){
  //       this.order = 'asc';
  //       this.studentService.sortByName(this.order).subscribe((data) => {
  //         this.collection = data;
  //       });
  //       this.flag= false;
  //     }else {
  //       this.order = 'desc';
  //       this.studentService.sortByName(this.order).subscribe((data) =>{
  //         this.collection = true;
  //       })
  //     }
  // }
}
