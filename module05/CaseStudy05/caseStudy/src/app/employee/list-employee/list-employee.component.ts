import { Component, OnInit } from '@angular/core';
import {Employee} from '../../model/employee';
import {EmployeeService} from '../../employee.service';

@Component({
  selector: 'app-list-employee',
  templateUrl: './list-employee.component.html',
  styleUrls: ['./list-employee.component.css']
})
export class ListEmployeeComponent implements OnInit {

  employees: Employee[] = [];
  name: string;
  id: number ;
  p = 1 ;
  constructor(private employeeService: EmployeeService) { }

  ngOnInit(): void {
    this.employeeService.getAllEmployee().subscribe(
      (data) => {
        this.employees = data;
        console.log(this.employees);
      }
    );
  }
  searchName(): void {
    this.employeeService.findByName(this.name).subscribe(data => {
        this.employees = data;
      }
    );
  }
  searchId(): void {
    this.employeeService.findBySearchId(this.id).subscribe(data => {
        this.employees = data;
      }
    );
  }
}
