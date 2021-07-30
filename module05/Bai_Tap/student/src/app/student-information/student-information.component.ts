import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {IStudent} from '../model/IStudent';
import {mark} from '@angular/compiler-cli/src/ngtsc/perf/src/clock';

@Component({
  selector: 'app-student-information',
  templateUrl: './student-information.component.html',
  styleUrls: ['./student-information.component.css']
})
export class StudentInformationComponent implements OnInit {
 @Input()
 studentChild: IStudent;
 @Output()
 throwMark = new EventEmitter();

  constructor() { }

  ngOnInit(): void {
  }
  onMark(value: any){
    this.studentChild.mark = value;
    this.throwMark.emit(value);
  }

}
