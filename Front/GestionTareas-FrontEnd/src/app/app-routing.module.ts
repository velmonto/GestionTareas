import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListaTareasComponent } from './lista-tareas/lista-tareas.component';
import { RegistrarUsuarioComponent } from './registrar-usuario/registrar-usuario.component';
import { InicioSesionComponent } from './inicio-sesion/inicio-sesion.component';
import { RegistrarTareaComponent } from './registrar-tarea/registrar-tarea.component';

const routes: Routes = [
  {path :'tareas', component:ListaTareasComponent},
{path : '',redirectTo:'tareas',pathMatch:'full'},
{path: 'registrar-usuario',component:RegistrarUsuarioComponent},
{path: 'iniciar-sesion', component:InicioSesionComponent},
{path: 'registrar-tarea', component:RegistrarTareaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
