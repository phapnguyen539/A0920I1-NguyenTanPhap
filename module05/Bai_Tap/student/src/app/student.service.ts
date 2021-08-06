import { Injectable } from '@angular/core';
import {studentDao} from './repository/studentDao';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor() { }
  getAllStudent(){
    return studentDao;
  }
  addNewStudent(student){
    studentDao.unshift(student);
  }
}

