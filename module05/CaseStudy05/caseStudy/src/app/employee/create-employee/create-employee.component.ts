import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {Employee} from '../../model/employee';
import {EmployeeService} from '../../employee.service';
import {Router} from '@angular/router';
import {Level} from '../../model/level';
import {PositionEmployee} from '../../model/positionEmployee';
import {LevelService} from '../../level.service';
import {PositionEmployeeService} from '../../position-employee.service';

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {
  createEmployee: FormGroup;
  level: Level[] = [] ;
  positionEmployee: PositionEmployee[];

  constructor(private employeeService: EmployeeService,
              private router: Router,
              private levelService: LevelService,
              private positionService: PositionEmployeeService) { }

  ngOnInit(): void {
    this.createEmployee = new FormGroup({
      id: new FormControl(''),
      name: new FormControl(''),
      birthday: new FormControl(''),
      card: new FormControl(''),
      phone: new FormControl(''),
      email: new FormControl(''),
      level: new FormControl(''),
      positionEmployee: new FormControl(''),
      salary: new FormControl(''),
    });
    this.levelService.getAllLevel().subscribe((data) => {
      this.level = data;
    });
    this.positionService.getAllPosition().subscribe((data) => {
      this.positionEmployee = data ;
    });
  }
  submitEmployee(){
    this.employeeService.addEmployee(this.createEmployee.value).subscribe((data) => {
      this.router.navigate(['/list-employee']);
      alert('Them thanh cong !');
    });
  }


}
