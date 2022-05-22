import { Component, OnInit } from '@angular/core';
import {FormBuilder, Validators} from "@angular/forms";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-user-profile',
  templateUrl: './user-profile.component.html',
  styleUrls: ['./user-profile.component.css']
})
export class UserProfileComponent implements OnInit {
  createStudentForm: any;

  constructor(private formBuilder: FormBuilder, private http: HttpClient) {
    this.createStudentForm = this.formBuilder.group({
      student_tc: ['', Validators.required],
      student_bhirtday: ['', Validators.required],
      student_gender: ['', Validators.required],
      student_name: ['', Validators.required],
      student_surname: ['', Validators.required],
      student_address: ['', Validators.required],
      student_email: ['', Validators.required],
      student_phone: ['', Validators.required],
    });
  }


ngOnInit(): void {
}

createStudent() {
  console.log(this.createStudentForm.getRawValue())
  const data = this.createStudentForm.value;
  // this.createTeacherDetails = Object.assign(this.createTeacherDetails,data)
  // console.log(this.createTeacherDetails);

  if(this.createStudentForm.value != null){
    this.http.post('/student/create', this.createStudentForm.getRawValue()).subscribe(response =>{
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
