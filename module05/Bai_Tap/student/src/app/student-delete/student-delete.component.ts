import {Component, Inject, OnInit} from '@angular/core';
import {StudentService} from '../student.service';
import {Router} from '@angular/router';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';

@Component({
  selector: 'app-student-delete',
  templateUrl: './student-delete.component.html',
  styleUrls: ['./student-delete.component.css']
})
export class StudentDeleteComponent implements OnInit {
  public studentName;
  public studentId;

  constructor(private studentService: StudentService, public dialogRef: MatDialogRef<StudentDeleteComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any
              ) {
  }

  ngOnInit(): void {
    this.studentName = this.data.data1.name;
    this.studentId = this.data.data1.id;
  }
  deleteStudent() {
    this.studentService.deleteStudent(this.studentId).subscribe((data) => {
      this.dialogRef.close();
    });
  }
}
