import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-teacher-profile',
  templateUrl: './teacher-profile.component.html',
  styleUrls: ['./teacher-profile.component.scss']
})
export class TeacherProfileComponent implements OnInit {
  createTeacherForm: FormGroup;
  createTeacherDetails:{};

  constructor(private formBuilder: FormBuilder, private http: HttpClient) {


    this.createTeacherForm = this.formBuilder.group({
      tc: ['', Validators.required],
      birthday: ['', Validators.required],
      gender: ['', Validators.required],
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      address: ['', Validators.required],
      email: ['', Validators.required],
      phone: ['', Validators.required],
      department: ['', Validators.required],
      branch: ['', Validators.required],
      lesson: ['', Validators.required],
    });
  }


  ngOnInit(): void {
  }


  createTeacher() {
    console.log(this.createTeacherForm.getRawValue())
    // const data = this.createTeacherForm.value;
    // this.createTeacherDetails = Object.assign(this.createTeacherDetails,data)
    // console.log(this.createTeacherDetails);

    if(this.createTeacherForm.value != null){
      this.http.post('/teacher/create', this.createTeacherForm.getRawValue()).subscribe(response =>{
        console.log(response)
      })
    }else {
      console.log("error")
    }
  }

  onClick() {
    alert("Success");
  }
}
