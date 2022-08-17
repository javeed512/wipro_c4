import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {




  baseUrl:string = "http://localhost:3000/student"

  constructor(private http:HttpClient) { }



    addStudent(studentData:Student){

      console.log("service" +studentData)

       return    this.http.post(this.baseUrl,studentData);


    }



    getAllStudents():Observable<Student[]>{

      return  this.http.get<Student[]>(this.baseUrl);


    }


}
