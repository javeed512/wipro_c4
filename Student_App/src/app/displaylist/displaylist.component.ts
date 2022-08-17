import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-displaylist',
  templateUrl: './displaylist.component.html',
  styleUrls: ['./displaylist.component.css']
})
export class DisplaylistComponent implements OnInit {


  students:Student[] = [];

    
  constructor(private service:StudentService ,private router:Router) { }


  ngOnInit(): void {

    this.service.getAllStudents().subscribe( studentList =>  {

      console.log(studentList);

        studentList.forEach( data => { 

            console.log(data);

            this.students.push(data);

        });
        
    });


  }

}
