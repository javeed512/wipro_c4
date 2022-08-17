import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { DisplaylistComponent } from './displaylist/displaylist.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';

const routes: Routes = [

   {path:"",component:LoginComponent},
   {path:"register",component:RegisterComponent},
   {path:"displaylist",component:DisplaylistComponent},
   {path:"dashboard/:uname",component:AppComponent}



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
