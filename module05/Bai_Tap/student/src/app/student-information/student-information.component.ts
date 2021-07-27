import { Component, OnInit } from '@angular/core';
import {IStudent} from '../model/IStudent';

@Component({
  selector: 'app-student-information',
  templateUrl: './student-information.component.html',
  styleUrls: ['./student-information.component.css']
})
export class StudentInformationComponent implements OnInit {
  student: IStudent = {
    id: 1,
    name: 'Tan Viet',
    age: 20,
    mark: 7,
    avatar: 'https://phunugioi.com/wp-content/uploads/2020/01/anh-avatar-supreme-dep-lam-dai-dien-facebook.jpg'
  }

  constructor() { }

  ngOnInit(): void {
  }
  onMark(value: any){
    this.student.mark = value;
  }

}
