import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {FormBuilder, Validators} from "@angular/forms";

@Component({
  selector: 'app-typography',
  templateUrl: './typography.component.html',
  styleUrls: ['./typography.component.css']
})
export class TypographyComponent implements OnInit {
  students: any;
  posts:any;
  Edit:boolean;
  createForm:any;
  constructor(private http: HttpClient,private formBuilder: FormBuilder) {
    this.createForm = this.formBuilder.group({
      Grade: ['', Validators.required],

    });
  }

  ngOnInit() {
    this.getStudent();
    this.Edit=false;
  }

  getStudent(){
    console.log("deneme")
    this.http.get<any>('/student/all').subscribe((data: any[] )=>{
      this.posts = data;
      this.students = data;
      console.log(data)
    });
  }

  clickEdit() {
    this.Edit = true;

  }

  clickSave() {
    this.Edit = false;
    this.changeGrade();
  }

  changeGrade() {
    console.log(this.createForm.getRawValue())
  }
}
