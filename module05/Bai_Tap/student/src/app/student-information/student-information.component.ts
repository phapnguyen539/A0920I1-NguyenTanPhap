import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {IStudent} from '../model/IStudent';
import {mark} from '@angular/compiler-cli/src/ngtsc/perf/src/clock';
import {StudentService} from '../student.service';
import {ActivatedRoute, ParamMap} from '@angular/router';

@Component({
  selector: 'app-student-information',
  templateUrl: './student-information.component.html',
  styleUrls: ['./student-information.component.css']
})
export class StudentInformationComponent implements OnInit {
 // @Input()
 // studentChild: IStudent;
 // @Output()
 // throwMark = new EventEmitter();
 idStudent: number;
 studentDetail: IStudent;
  constructor( private studentService: StudentService,
               private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      // tslint:disable-next-line:radix
      this.idStudent = parseInt(paramMap.get('id'));
      this.studentService.findById(this.idStudent).subscribe((data) => {
        this.studentDetail = data;
      });

      // this.studentDetail = this.studentService.findById(this.idStudent);
    });
  }
  // onMark(value: any){
  //   this.studentChild.mark = value;
  //   this.throwMark.emit(value);
  // }

}
