import { Component, OnInit } from '@angular/core';

export interface IStudent {
  id: number;
  name: string;
  mark: number;
  image: string;

}

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
  student: IStudent = {
    id: 1,
    name: 'Tuan Anh',
    mark: 10,
    image: 'https://toigingiuvedep.vn/wp-content/uploads/2021/05/hinh-anh-avatar-nam-1.jpg'
}

  constructor() { }

  ngOnInit(): void {
  }
  onChange(value: any){
    this.student.mark = value;
  }

}
