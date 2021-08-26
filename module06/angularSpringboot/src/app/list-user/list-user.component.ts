import {Component, OnInit} from '@angular/core';
import {UserService} from '../user.service';
import {User} from '../model/user';

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})
export class ListUserComponent implements OnInit {
  users: User[] = [];

  constructor(private userService: UserService) {
  }

  ngOnInit(): void {
    this.userService.getAllUser().subscribe((data) => {
      this.users = data;
    });
  }

}
