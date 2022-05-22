import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-table-list',
  templateUrl: './table-list.component.html',
  styleUrls: ['./table-list.component.css']
})
export class TableListComponent implements OnInit {

  posts:any;
  teachers: any;

  constructor(private http: HttpClient) { }

  ngOnInit() {

    this.getTeacher()
  }

  getTeacher(){
    console.log("deneme")
    this.http.get<any>('/teacher/all').subscribe((data: any[] )=>{
      this.posts = data;
      this.teachers = data;
      console.log(data)
    });
  }

}
